package com.lg.util.constant;

import lombok.Data;

import java.io.Serializable;

/**
 * Response
 *
 * @author JLer
 * @version 1.0 2019-02-14 16:58
 */
@Data
//@JsonInclude(Include.NON_NULL)
public class Response<T> implements Serializable {
    private static final long serialVersionUID = -4677614367834499621L;

    private Integer code;

    private String msg;

    private String url;

    private T data;

    public Response() {
        this.code = CodeMsgEnum.SUCCESS.getCode();
        this.msg = CodeMsgEnum.SUCCESS.getMsg();
    }

    public Response(Integer code, String msg) {
        this();
        this.code = code;
        this.msg = msg;
    }

    public Response(Integer code, String msg, T data) {
        this();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Response(Integer code, String msg, String url) {
        this();
        this.code = code;
        this.msg = msg;
        this.url = url;
    }

    public Response(T data) {
        this();
        this.data = data;
    }

    public Response(CodeMsgEnum codeMsg) {
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
    }

    public Response(CodeMsgEnum codeMsg, T data) {
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
        this.data = data;
    }
}