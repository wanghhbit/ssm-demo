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
     * ��ȡ���쿪ʼʱ��
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
     * ��ȡ���쿪ʼʱ��
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
     * ��ʽ������
     * @param date ����20170317235959
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
     * ��������ʱ���
     *
     * @param start ��ʼʱ��
     * @param end   ����ʱ��
     * @return
     */
    public static String getTimeDifference(Date start, Date end) {
        if (start == null || end == null) {
            return null;
        }
        if (start.getTime() > end.getTime()) {
            return null;
        }
        long nd = 1000 * 24 * 60 * 60;//һ��ĺ�����
        long nh = 1000 * 60 * 60;//һСʱ�ĺ�����
        long nm = 1000 * 60;//һ���ӵĺ�����
        long ns = 1000;//һ���ӵĺ�����
        long diff;//�������ʱ��ĺ���ʱ�����
        diff = end.getTime() - start.getTime();
        long day = diff / nd;//����������
        long hour = diff % nd / nh;//��������Сʱ
        long min = diff % nd % nh / nm;//�������ٷ���
        long sec = diff % nd % nh % nm / ns;//����������//������
        return day + "��" + hour + "Сʱ" + min + "����" + sec + "��";
    }
}
