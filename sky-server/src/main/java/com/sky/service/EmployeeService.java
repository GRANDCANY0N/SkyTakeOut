package com.sky.service;

import com.sky.dto.EmployeeAddDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

/**
 * @author Canyon
 */
public interface EmployeeService {
    /**
     * 判断用户登录逻辑，返回用户信息或者抛出异常
     * @param employeeLoginDTO 前端返回对象
     * @return 用户登录实体
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 添加员工
     * @param employeeAddDTO 前端添加员工数据
     */
    void employeeAdd(EmployeeAddDTO employeeAddDTO);

    /**
     * 根据姓名分页查询员工
     * @param employeePageQueryDTO 前端提供的分页数据
     * @return {@link PageResult }
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);
}
