package com.sky.dto;

import lombok.Data;

@Data
public class EmployeePageQueryDTO {
    private Integer pageSize;
    private Integer page;
    private String name;
}
