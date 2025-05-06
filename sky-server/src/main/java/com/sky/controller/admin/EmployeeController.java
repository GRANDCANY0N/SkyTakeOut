package com.sky.controller.admin;


import com.sky.constant.JwtClaimsConstant;
import com.sky.dto.EmployeeAddDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.properties.JwtProperties;
import com.sky.result.PageResult;
import com.sky.service.EmployeeService;
import com.sky.utils.JwtUtil;
import com.sky.vo.EmployeeLoginVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import com.sky.result.Result;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Canyon
 */
@Slf4j
@RestController
@RequestMapping("/admin/employee")
@RequiredArgsConstructor


public class EmployeeController {


    private final EmployeeService employeeService;
    private final JwtProperties jwtProperties;

    /**
     * @param employeeLoginDTO 前端数据传输对象
     * @return {@link Result }<{@link EmployeeLoginVO }>
     */
    @PostMapping("/login")
    public Result<EmployeeLoginVO> login(@RequestBody EmployeeLoginDTO employeeLoginDTO){
        log.info("员工登录：{}", employeeLoginDTO);
        Employee employee = employeeService.login(employeeLoginDTO);

        //登录成功后，生成jwt令牌
        Map<String, Object> claims = new HashMap<>(2);
        claims.put(JwtClaimsConstant.EMP_ID, employee.getId());
        claims.put(JwtClaimsConstant.USERNAME,employee.getUsername());

        String token = JwtUtil.createJwt(
                jwtProperties.getAdminSecretKey(),
                jwtProperties.getAdminTtl(),
                claims);

        EmployeeLoginVO employeeLoginVO = EmployeeLoginVO.builder()
                .id(employee.getId())
                .userName(employee.getUsername())
                .name(employee.getName())
                .token(token)
                .build();

        return Result.success(employeeLoginVO);
    }


    /**
     * @param employeeAddDTO 添加用户DTO
     * @return {@link Result }<{@link String }>
     */
    @PostMapping("/add")
    public Result<String> employeeAdd(@RequestBody EmployeeAddDTO employeeAddDTO){
        employeeService.employeeAdd(employeeAddDTO);

        return Result.success("添加成功！");
    }

    /**
     * MGZ TODO 2025/5/6：如果需要按照多个条件进行分页查询，例如姓名+生日，或者前端传递的不是姓名，是其他的参数是否要写新的方法
     */
    @GetMapping("/page")
    public Result<PageResult> page(EmployeePageQueryDTO employeePageQueryDTO){
        PageResult pageResult = employeeService.pageQuery(employeePageQueryDTO);
        return Result.success(pageResult);
    }

}
