package com.example.demo1.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
@Data
public class Emp implements Serializable {
    private Integer id;
    private String studentName;
    private String gender;
    private BigDecimal salary;
    private Date joinDate;
    private Integer deptId;

}
