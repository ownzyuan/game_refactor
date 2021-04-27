package com.zy.common.enums;

public enum GenderEnum {

    MAN("男", 0),
    WOMAN("女", 1);

    private String name;
    private Integer value;

    GenderEnum(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
