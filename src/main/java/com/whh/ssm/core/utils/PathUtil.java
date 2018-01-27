package com.whh.ssm.core.utils;

import java.io.File;


/**
 * Created by Administrator on 2016/11/15 0015.
 */
public class PathUtil {

    public static final String IMAGE_SAVE_PATH = "/uploadImages/";
    public static File getRandImgFile(String s_FileExt) {
        String file =  getGuid(12) + s_FileExt;
        //String file = DateUtils.format(new Date(), "yyyy" + File.separator + "DDD" + File.separator+"ss"+File.separator) + getGuid(12) + s_FileExt;
        File fileName = new File(new File("/home/whh" , IMAGE_SAVE_PATH), file);
        if (!fileName.getParentFile().exists()) {
            fileName.getParentFile().mkdirs();
        }
        return fileName;
    }
    public static String getGuid(int len) {
        StringBuffer sb = new StringBuffer(len);
        for (int i = 0; i < len; i++) {
            int k;
            switch ((int) (Math.random() * 2D)) {
                case 0: // '\0'
                    k = (int) (Math.random() * 10D) + 48;
                    break;

                case 1: // '\001'
                    k = (int) (Math.random() * 26D) + 65;
                    break;

                default:
                    k = 95;
                    break;
            }
            sb.append((char) k);
        }

        return sb.toString();
    }
}
