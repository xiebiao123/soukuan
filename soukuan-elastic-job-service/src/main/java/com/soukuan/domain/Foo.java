package com.soukuan.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Foo implements Serializable {

    private int id;

    private String name;
}
