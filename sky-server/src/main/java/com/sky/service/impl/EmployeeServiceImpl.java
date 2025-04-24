package com.sky.service.impl;

import com.sky.constant.MessageConstant;
import com.sky.constant.PasswordConstant;
import com.sky.constant.StatusConstant;
import com.sky.context.BaseContext;
import com.sky.dto.EmployeeAddDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.entity.Employee;
import com.sky.exception.AccountExistException;
import com.sky.exception.PasswordErrorException;
import com.sky.exception.AccountNotFoundException;
import com.sky.mapper.EmployeeMapper;
import com.sky.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.sky.exception.AccountLockedException;
import org.springframework.util.DigestUtils;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeMapper employeeMapper;

    /**
     * @param employeeLoginDTO 前端数据传输对象
     * @return {@link Employee }
     */
    @Override
    public Employee login(EmployeeLoginDTO employeeLoginDTO) {
        String username = employeeLoginDTO.getUsername();
        String password = employeeLoginDTO.getPassword();
        Employee employee = employeeMapper.getByUsername(username);
        if(employee == null){
            throw new AccountNotFoundException(MessageConstant.ACCOUNT_NOT_FOUND);
        }
        //md5加密 过时
        password = DigestUtils.md5DigestAsHex(password.getBytes());

        if(!(employee.getPassword().equals(password))){
            throw new PasswordErrorException(MessageConstant.PASSWORD_ERROR);
        }
        if(employee.getStatus().equals(StatusConstant.DISABLE)){
            throw new AccountLockedException(MessageConstant.ACCOUNT_LOCKED);
        }

        return employee;
    }

    /**
     * 1、判断是否存在该账号
     * 2、new一个员工对象
     * 3、将DTO的值放入
     * 4、将时间以及密码等默认值放入并加密
     */
    @Override
    public void employeeAdd(EmployeeAddDTO employeeAddDTO) {
        String username = employeeAddDTO.getUsername();
        if(employeeMapper.getByUsername(username)!=null){
            throw new AccountExistException(username + MessageConstant.ACCOUNT_EXISTS);
        }
        Employee employee = new Employee();

        //复制DTO到对象
        BeanUtils.copyProperties(employeeAddDTO,employee);

        employee.setStatus(StatusConstant.ENABLE);
        employee.setPassword(DigestUtils.md5DigestAsHex(PasswordConstant.PASSWORD.getBytes()));
        employee.setCreateTime(LocalDateTime.now());
        employee.setUpdateTime(LocalDateTime.now());

        employee.setCreateUser(BaseContext.getCurrentId());
        employee.setUpdateUser(BaseContext.getCurrentId());

        employeeMapper.employeeAdd(employee);
    }
}
