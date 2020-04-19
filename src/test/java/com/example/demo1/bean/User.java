package com.example.demo1.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
@Data
public class User implements Serializable {
    private String userName;
    private String password;
}
