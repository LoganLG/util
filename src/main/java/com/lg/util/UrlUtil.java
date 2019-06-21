package com.lg.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlUtil {
    // encoding参数使用utf-8
    public static String urlEncode(String value, String encoding) {
        if (value == null) {
            return "";
        }
        try {
            String encoded = URLEncoder.encode(value, encoding);
            return encoded.replace("+", "%20").replace("*", "%2A")
                    .replace("~", "%7E").replace("/", "%2F");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException("Failed To Encode Uri", e);
        }
    }
}
