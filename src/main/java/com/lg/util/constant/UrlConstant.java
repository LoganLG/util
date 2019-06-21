package com.lg.util.constant;

public interface UrlConstant {

    /**
     * 钉钉网关gettoken地址
     */
    String DING_GET_TOKEN = "https://oapi.dingtalk.com/gettoken";

    /**
     * 获取用户在企业内的userId
     */
    String DING_GET_USER_INFO = "https://oapi.dingtalk.com/user/getuserinfo";

    /**
     * 获取用户详情
     */
    String DING_USER_GET = "https://oapi.dingtalk.com/user/get";

    /**
     * 发送工作通知消息
     */
    String DING_MESSAGE_CORP = "https://oapi.dingtalk.com/topapi/message/corpconversation/asyncsend_v2";

    /**
     * 发送普通消息
     */
    String DING_MESSAGE_SEND = "https://oapi.dingtalk.com/message/send_to_conversation";

    /**
     * 根据unionid获取userid
     */
    String DING_GET_USERID_BYUNIONID = "https://oapi.dingtalk.com/user/getUseridByUnionid";

    /**
     * 扫码登录第三方网站获取用户信息
     */
    String DING_GET_USER_INFO_BYCODE = "https://oapi.dingtalk.com/sns/getuserinfo_bycode";

    /**
     * wx小程序登录
     */
    String WX_JSCODE2SESSION = "https://api.weixin.qq.com/sns/jscode2session";


    /**
     * wx小程序获取access_token
     */
    String WX_GET_ACCESS_TOKEN = "https://api.weixin.qq.com/cgi-bin/token";

    /**
     * wx小程序获取发送模板消息
     */
    String WX_TEMPLATE_SEND = "https://api.weixin.qq.com/cgi-bin/message/wxopen/template/send";

    /**
     * 短信
     */
    String SMS_SEND = "http://210.51.191.35:8080/eums/sms/utf8/send.do";
}
