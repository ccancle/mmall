package com.mmall.util;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * @program: mmall
 * @description: 日期格式转换工具类
 * @author: Macchac
 * @create: 2020-03-09 15:01
 **/
public class DateTimeUtil {
    //joda-time

    public static final String STANDRD_FORMAT = "yyyy-MM-dd HH:mm:ss";
    /***
     * 字符串转换成Date
     * @param dateTimeStr
     * @param formatStr
     * @return
     */
    public static Date strToDate(String dateTimeStr,String formatStr){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(formatStr);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);

        return dateTime.toDate();
    }

    /**
     * Date转换成字符串 Date经过format转化成String
     * @param date
     * @param formatStr
     * @return
     */
    public static String dateToStr(Date date,String formatStr){
        if (date == null){
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(formatStr);
    }


    public static Date strToDate(String dateTimeStr){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(STANDRD_FORMAT);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);

        return dateTime.toDate();
    }


    public static String dateToStr(Date date){
        if (date == null){
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return dateTime.toString(STANDRD_FORMAT);
    }

    //TestClass
//    public static void main(String[] args) {
//        System.out.println(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
//        System.out.println(DateTimeUtil.dateToStr(new Date()));
//        System.out.println(DateTimeUtil.strToDate("2020-01-01 11:11:11","yyyy-MM-dd HH:mm:ss"));
//        System.out.println(DateTimeUtil.strToDate("2020-01-01 11:11:11"));
//    }

}
