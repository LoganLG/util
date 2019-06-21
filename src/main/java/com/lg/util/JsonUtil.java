package com.lg.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.List;

public class JsonUtil {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    static {
        //在遇到未知属性的时候不抛出异常
        MAPPER.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        //允许序列化空的对象
        MAPPER.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        // 指定时区，默认 UTC，而不是 jvm 默认时区
//        MAPPER.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        //日期格式化
//        MAPPER.setDateFormat(DateUtil.STANDARD_FORMAT);
    }

    /**
     * 将对象转换成json字符串
     *
     * @param data
     * @return
     */
    public static String toJSONString(Object data) {
        try {
            return MAPPER.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将json结果集转化为对象
     *
     * @param jsonData json数据
     * @param clazz    对象中的object类型
     * @return
     */
    public static <T> T parseJSONString(String jsonData, Class<T> beanType) {
        try {
            return MAPPER.readValue(jsonData, beanType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将object转化为对象
     *
     * @param jsonData json数据
     * @param clazz    对象中的object类型
     * @return
     */
    public static <T> T parseObject(Object data, Class<T> beanType) {
        try {
            return MAPPER.readValue(toJSONString(data), beanType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将json数据转换成对象list
     *
     * @param jsonData
     * @param beanType
     * @return
     */
    public static <T> List<T> jsonToList(String jsonData, Class<T> beanType) {
        JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
        try {
            return MAPPER.readValue(jsonData, javaType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 将object数据转换成对象list
     *
     * @param jsonData
     * @param beanType
     * @return
     */
    public static <T> List<T> parseArray(Object data, Class<T> beanType) {
        JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
        try {
            return MAPPER.readValue(toJSONString(data), javaType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}