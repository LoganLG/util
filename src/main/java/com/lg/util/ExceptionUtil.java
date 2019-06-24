package com.lg.util;

import com.alibaba.fastjson.JSONObject;
import com.lg.util.constant.AppException;
import com.lg.util.constant.CodeMsgEnum;
import com.lg.util.constant.CommonConstant;
import com.lg.util.constant.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.MethodArgumentNotValidException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class ExceptionUtil {
    public static Response<String> defaultException(HttpServletRequest req, Exception e) {
        log.error("Throw exception:", e);
        Response<String> r;
        //无权限访问
        if (e instanceof AccessDeniedException) {
            r = new Response<>(CodeMsgEnum.ACCESS_DENIED);
            //自定义错误
        } else if (e instanceof AppException) {
            CodeMsgEnum codeMsgEnum = ((AppException) e).getCodeMsgEnum();
            //自定义提示
            String data = ((AppException) e).getData();
            if (StringUtils.hasText(data)) {
                codeMsgEnum.setMsg(data);
            }
            r = new Response<>(codeMsgEnum);
            //参数校验错误
        } else if (e instanceof MethodArgumentNotValidException) {
            r = new Response<>(CodeMsgEnum.PARAM_ERROR);
        } else {
            r = new Response<>(CodeMsgEnum.ERROE);
        }
        if (r.getData() == null) {
            if (e.getCause() != null) {
                r.setData(e.getCause().getMessage());
            } else {
                r.setData(e.getLocalizedMessage());
            }
        }
        r.setUrl(req.getRequestURL().toString());
        return r;
    }

    public static void authException(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        log.error("AuthenticationException:", authException);
        Map<String, String> map = new HashMap<>();
        map.put("code", CodeMsgEnum.TOKEN_ERROR.getCode().toString());
        map.put("msg", CodeMsgEnum.TOKEN_ERROR.getMsg());
        map.put("url", request.getRequestURL().toString());
        map.put("data", authException.getMessage());
        response.setContentType(CommonConstant.CONTENT_TYPE);
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.getWriter().write(JSONObject.toJSONString(map));
    }
}
