package com.sky.service;

import com.sky.dto.EmployeeAddDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.entity.Employee;

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
}
