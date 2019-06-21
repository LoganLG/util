package com.lg.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * DateUtil
 *
 * @author JLer
 * @version 1.0 2018-4-12 16:45
 */
public class DateUtil {
    public final static DateFormat MONTH_FORMAT = new SimpleDateFormat("yyyy-MM");

    public final static DateFormat STANDARD_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static Date stringToDate(String str) {
        Date date = null;
        Calendar calendar = Calendar.getInstance();
        try {
            date = MONTH_FORMAT.parse(str);
            calendar.setTime(date);
            calendar.set(Calendar.HOUR, calendar.get(Calendar.HOUR) + 8);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return calendar.getTime();
    }

    public static String getStringNowMonth() {
        return MONTH_FORMAT.format(new Date());
    }

    public static String getLastDay(String str) {
        // 获取Calendar
        Calendar calendar = Calendar.getInstance();
        // 设置时间
        calendar.setTime(stringToDate(str));
        // 设置日期为本月最大日期
        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));
        // 设置时间为最后一秒
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 59);
        return STANDARD_FORMAT.format(calendar.getTime());
    }

    public static String getFirstDay(String str) {
        // 获取Calendar
        Calendar calendar = Calendar.getInstance();
        // 设置时间
        calendar.setTime(stringToDate(str));
        calendar.set(Calendar.DATE, 1);
        // 设置时间为第一秒
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return STANDARD_FORMAT.format(calendar.getTime());
    }

    public static Date getTomorrow(Date date) {
        // 获取Calendar
        Calendar calendar = Calendar.getInstance();
        // 设置时间
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 1);
        // 设置时间为第一秒
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }
}