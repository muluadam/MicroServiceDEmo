package com.muluadam.userservicewithfeign.entity;


import lombok.Data;

@Data
public class Department {

    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
