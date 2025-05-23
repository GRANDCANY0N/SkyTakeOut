package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface EmployeeMapper {
    /**
     * 根据用户名查询员工
     * @param username 用户名
     * @return 用户实体
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    /**
     * 添加新员工
     * @param employee 员工实体
     */
    @Insert("INSERT INTO " +
            "employee (name, username, password, phone, sex, id_number, create_time, update_time, create_user, update_user) " +
            "values " +
            "(#{name}," +
            "#{username}," +
            "#{password}," +
            "#{phone}," +
            "#{sex}," +
            "#{idNumber}," +
            "#{createTime}," +
            "#{updateTime}," +
            "#{createUser}," +
            "#{updateUser})")
    void employeeAdd(Employee employee);


    /**
     * 分页查询
     * @param employeePageQueryDTO 前端提供的分页数据
     * @return {@link Page }<{@link Employee }>
     */
    Page<Employee> pageQuery(EmployeePageQueryDTO employeePageQueryDTO);
}
