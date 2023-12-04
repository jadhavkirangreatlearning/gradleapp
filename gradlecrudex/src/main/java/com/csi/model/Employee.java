package com.csi.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @Size(min = 2, message = "Employee Name should be at least 2 character")
    private String empName;

    private String empAddress;

    private long empContactNumber;

    private double empSalary;

    @Email(message = "Email ID must be valid")
    private String empEmailId;

    @Size(min = 4, message = "Password should be atleast 4 character")
    private String empPassword;
}
