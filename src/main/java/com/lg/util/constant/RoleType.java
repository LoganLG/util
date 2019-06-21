package com.lg.util.constant;

public enum RoleType {
    Public(0), Hrms(1), File(2), Website(3), OwnerAfter(4);

    private Integer type;

    RoleType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
