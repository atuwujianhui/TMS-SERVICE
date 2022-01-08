package com.fjzcit.tms.model.system;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
@Table(name="sys_user",
        uniqueConstraints = {
            @UniqueConstraint(columnNames="name"),
            @UniqueConstraint(columnNames="login_name")
        }
)
public class User {

    @Id	//主键id
    // @GeneratedValue(strategy=GenerationType.IDENTITY)//主键生成策略
    @Column(name = "ID",
            columnDefinition = "BIGINT COMMENT 'ID'")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="login_name")
    private Integer loginName;

    @Column(name="password")
    private String password;

}