package com.muluadam.userservicewithfeign.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

    @Id
    @GeneratedValue
    private Long userId;
    private String firstName;
    private  String lastName;
    private String email;
    private String mobile;
    private  Long departmentId;

}
