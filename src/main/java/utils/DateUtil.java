package utils;


import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @description:日期工具类
 * @author: daixiongkun
 * @time: 2019-09-21 15:11
 */
public class DateUtil {

    public DateUtil() {
    }

    /*
     * yyyy-MM-dd
     */
    public static final String FORMAT1 = "yyyy-MM-dd";

    /*
     * yyyy.MM.dd
     */
    public static final String FORMAT2 = "yyyy.MM.dd";

    /*
     * yyyy/MM/dd
     */
    public static final String FORMAT3 = "yyyy/MM/dd";

    /*
     * yyyy-MM-dd HH:mm
     */
    public static final String FORMAT4 = "yyyy-MM-dd HH:mm";

    /*
     * yyyy.MM.dd HH:mm
     */
    public static final String FORMAT5 = "yyyy.MM.dd HH:mm";

    /*
     * yyyy/MM/dd HH:mm
     */
    public static final String FORMAT6 = "yyyy/MM/dd HH:mm";

    /*
     * yyyy-MM-dd HH:mm:ss
     */
    public static final String FORMAT7 = "yyyy-MM-dd HH:mm:ss";

    /*
     * yyyy.MM.dd HH:mm:ss
     */
    public static final String FORMAT8 = "yyyy.MM.dd HH:mm:ss";

    /*
     * yyyy/MM/dd HH:mm:ss
     */
    public static final String FORMAT9 = "yyyy/MM/dd HH:mm:ss";

    /*
     * yyyy_MM_dd_HH_mm_ss
     */
    public static final String FORMAT10 = "yyyy_MM_dd_HH_mm_ss";

    /*
     * yy-MM-dd
     */
    public static final String FORMAT11 = "yy-MM-dd";

    /*
     * yyyyMMdd
     */
    public static final String FORMAT12 = "yyyyMMdd";

    /*
     * yyyyMMddHHmmss
     */
    public static final String FORMAT13 = "yyyyMMddHHmmss";

    /*
     * yyyyMM
     */
    public static final String FORMAT14 = "yyyyMM";

    /*
     * YYYY-MM-dd HH-mm-ss
     */
    public static final String FORMAT15 = "YYYY-MM-dd HH-mm-ss";

    /*
     * yyyy-MM-dd'T'HH:mm:ss.SSSZ
     */
    public static final String FORMAT16 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    /**
     * @description获取当前时间
     * @param format
     * @return 返回当前时间
    */
    public static String getCurrentDate(String format){
        if (StringUtils.isBlank(format)){
            format = FORMAT1;
        }
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        String currentTime = dateFormat.format(date);
        return currentTime;
    }

    /**
     * @description  字符串转成日期
     * @param str
     * @param format
     * @return 返回日期
    */
    public static Date parseStringToDate(String str,String format){
        DateFormat fomatter = null;
        Date date = null;
        if (StringUtils.isNotBlank(str)){
            if (StringUtils.isBlank(format)){
                fomatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            }else {
                fomatter = new SimpleDateFormat(format);
            }
            try {
                date = fomatter.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return date;
    }

    /**
     * @description  日期转成字符串
     * @param date
     * @param format
     * @return 返回字符串
    */
    public static String parseDateToString(Date date,String format){
        String result = "";
        DateFormat formatter = null;
        if (date != null) {
            if (StringUtils.isBlank(format)){
                formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            }else {
                formatter = new SimpleDateFormat(format);
            }
            result = formatter.format(date);
        }
        return result;
    }

    /**
     * @description 返回日期中的年份
     * @param date
     * @return 返回年份
    */
    public static int getYear(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    /**
     * @description  返回日期中的月份
     * @param date
     * @return 返回月份
    */
    public static int getMonth(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH)+1;
    }

    /**
     * @description  返回日期中的日
     * @param date
     * @return int
    */
    public static int getDay(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * @description  返回日期中的小时
     * @param date
     * @return int
    */
    public static int getHour(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * @description  返回日期中的分钟
     * @param date
     * @return int
    */
    public static int getMinute(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MINUTE);
    }

    /**
     * @description  获取当前时间秒数
     * @param date
     * @return long
    */
    public static long getMillis(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getTimeInMillis();
    }
}

