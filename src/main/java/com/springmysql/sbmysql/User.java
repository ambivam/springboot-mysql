package com.springmysql.sbmysql;

import lombok.Data;

import javax.persistence.*;

@Entity(name="tbl_user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "age")
    private Integer age;

}
