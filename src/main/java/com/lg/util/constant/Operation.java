package com.lg.util.constant;

public enum Operation {
    Add("add"), Del("del"), Edit("edit"), Find("find");

    private String type;

    Operation(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
