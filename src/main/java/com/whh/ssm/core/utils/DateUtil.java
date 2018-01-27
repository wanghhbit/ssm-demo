package com.whh.ssm.core.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created with IntelliJ IDEA.
 * User: wanghh
 */
public class DateUtil {
    /**
     * 获取当天开始时间
     *
     * @return
     */
    public static Date getCurrentDateBegin() {
        Calendar currentDate = new GregorianCalendar();
        currentDate.setTime(new Date());
        currentDate.set(Calendar.HOUR_OF_DAY, 0);
        currentDate.set(Calendar.MINUTE, 0);
        currentDate.set(Calendar.SECOND, 0);
        Date date = currentDate.getTime();
        return date;
    }

    /**
     * 获取昨天开始时间
     *
     * @return
     */
    public static Date getYesterDayBegin() {
        Calendar currentDate = new GregorianCalendar();
        currentDate.setTime(new Date());
        currentDate.add(Calendar.DATE, -1);
        currentDate.set(Calendar.HOUR_OF_DAY, 0);
        currentDate.set(Calendar.MINUTE, 0);
        currentDate.set(Calendar.SECOND, 0);
        Date date = currentDate.getTime();
        return date;
    }

    /**
     * 格式化日期
     * @param date 形如20170317235959
     *
     * @return
     */
    public boolean checkdate(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar a = Calendar.getInstance();
        if (!"".equals(date) && date != null && date.length() == 8) {
            int year = Integer.parseInt(date.substring(0, 4));
            int month = Integer.parseInt(date.substring(4, 6));
            int day = Integer.parseInt(date.substring(6, 8));
            if (year > a.get(Calendar.YEAR) || month > 12 || day > 32) {
                return false;
            }
            String time = year + "-" + month + "-" + day + " 00:00:00";
            Date date1 = format.parse(time);
            if (!date1.after(new Date())) {
                return true;
            }
        }
        return false;
    }

    /**
     * 计算两个时间差
     *
     * @param start 开始时间
     * @param end   结束时间
     * @return
     */
    public static String getTimeDifference(Date start, Date end) {
        if (start == null || end == null) {
            return null;
        }
        if (start.getTime() > end.getTime()) {
            return null;
        }
        long nd = 1000 * 24 * 60 * 60;//一天的毫秒数
        long nh = 1000 * 60 * 60;//一小时的毫秒数
        long nm = 1000 * 60;//一分钟的毫秒数
        long ns = 1000;//一秒钟的毫秒数
        long diff;//获得两个时间的毫秒时间差异
        diff = end.getTime() - start.getTime();
        long day = diff / nd;//计算差多少天
        long hour = diff % nd / nh;//计算差多少小时
        long min = diff % nd % nh / nm;//计算差多少分钟
        long sec = diff % nd % nh % nm / ns;//计算差多少秒//输出结果
        return day + "天" + hour + "小时" + min + "分钟" + sec + "秒";
    }
}
