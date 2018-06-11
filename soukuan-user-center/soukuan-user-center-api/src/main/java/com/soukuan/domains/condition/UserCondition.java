package com.soukuan.domains.condition;

import com.soukuan.domains.po.User;
import com.soukuan.web.page.Pager;
import lombok.Data;

import java.io.Serializable;


/**
* Title
* Author xiebiao
* DateTime  2018-06-08.
* Version V1.0.0
*/
@Data
public class UserCondition implements Serializable{

    private Pager pager;

    private User user;
}
