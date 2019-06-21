package com.lg.util.constant;

/**
 * ErrorCodeMsg
 *
 * @author JLer
 * @version 1.0 2018-4-12 16:45
 */
public enum CodeMsgEnum {

    SUCCESS(200, "请求成功"), LOGIN_SUCCESS(201, "登陆成功"), MSG_SEND_SUCCESS(202, "消息发送成功"),

    LOGIN_TIMOUT(401, "登录超时"), DATA_NOT_EXIST(402, "数据未定义"), LOGIN_FAILURE(403, "用户名或密码错误"), TOKEN_ERROR(404, "验证不通过"), ACCESS_DENIED(405, "访问被拒绝"),

    THIRD_LOGIN_FAILURE(406, "第三方登录失败"), USER_NEED_COMPLETE(407, "需要补全用户信息"), DATA_ILLEGAL(408, "非法数据"), DATA_EXIST(409, "数据已存在"),

    PARAM_ERROR(410, "参数校验不通过"), TOKEN_GET_FAILURE(411, "获取凭证失败"), SMS_CHECK_ERROR(412, "短信校验不通过"), SMS_ACCOUNT_BEYOND(413, "短信次数超出,请明天再试"),

    ERROE(501, "意外错误"), MICRO_SERVER_ERROR(502, "微服务不可用"), NETWORK_ERROR(503, "网络错误，待会重试"), MSG_SEND_FAILURE(504, "消息发送失败");

    private Integer code;

    private String msg;

    CodeMsgEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}