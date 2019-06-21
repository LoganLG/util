package com.lg.util.constant;

public class AppException extends RuntimeException {
    private static final long serialVersionUID = 3880804475737516041L;

    private CodeMsgEnum codeMsgEnum;

    private String data;

    public AppException() {

    }

    public AppException(CodeMsgEnum codeMsgEnum, String data) {
        this.codeMsgEnum = codeMsgEnum;
        this.data = data;
    }

    public AppException(CodeMsgEnum codeMsgEnum) {
        this.codeMsgEnum = codeMsgEnum;
    }

    public CodeMsgEnum getCodeMsgEnum() {
        return codeMsgEnum;
    }

    public void setCodeMsgEnum(CodeMsgEnum codeMsgEnum) {
        this.codeMsgEnum = codeMsgEnum;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
