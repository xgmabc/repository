package com.xgm.ninja.bean;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserBean implements Serializable {
    private int userId;
    private String username;
    private String password;
    private Date regTime;
}
