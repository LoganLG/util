package com.lg.util;


import com.lg.util.constant.RegularContant;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PhoneUtil {
    public static boolean isPhone(String str) throws PatternSyntaxException {
        Pattern p = Pattern.compile(RegularContant.PHONE_NUMBER);
        Matcher m = p.matcher(str);
        return m.matches();
    }
}
