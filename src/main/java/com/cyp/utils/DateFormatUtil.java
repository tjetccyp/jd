package com.cyp.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtil {
    public static final SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    //将字符串转换为日期
    public static Date stringToDate(String s){
        try {
            return sdf.parse(s);

        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static String dateToString(Date date){
        return sdf.format(date);
    }
}
