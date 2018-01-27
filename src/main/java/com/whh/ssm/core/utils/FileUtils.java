package com.whh.ssm.core.utils;

import org.apache.log4j.Logger;

import java.io.*;
import java.math.BigDecimal;

/**
 * 文件类操作,继承的方法参见org.apache.commons.io.FileUtils相关文档
 */
public class FileUtils extends org.apache.commons.io.FileUtils {
    // todo 其他自定义方法在该类中添加

    /**
     * 将String写入到文件，该方法是以文本形式写得到文件中<br>
     *
     * @param fileFullName 文件全名
     * @param fileContent  内容
     * @param append       是否追加
     * @throws java.io.IOException 例外
     */
    public static void fileWrite(String fileFullName, String fileContent,
                                 boolean append) throws IOException {
        File f = new File(fileFullName);
        if (!f.getParentFile().exists())
            f.getParentFile().mkdirs();
        fileWrite(f, fileContent, append);
    }

    /**
     * 将String写入到文件，该方法是以文本形式写得到文件中<br>
     *
     * @param fileFullName 文件全名
     * @param fileContent  内容
     * @param append       是否追加
     * @throws java.io.IOException 例外
     */
    public static void fileWrite(File fileFullName, String fileContent,
                                 boolean append) throws IOException {
        FileWriter writer = null;
        try {
            // ---------------------------------
            // 获得一个文件写入的句柄
            // ---------------------------------
            writer = new FileWriter(fileFullName, append);
            // ---------------------------------
            // 写入内容
            // ---------------------------------
            writer.write(fileContent);
            // ---------------------------------
            // 将内容写到碰盘上
            // ---------------------------------
            writer.flush();
        } finally {
            if (writer != null) {
                // ---------------------------------
                // 如果句柄不为空。则最后要关闭句柄
                // ---------------------------------
                try {
                    writer.close();
                    writer = null;
                } catch (IOException e) {
                }
            }
        }
    }

    /**
     * 将byte数组写入到文件，本方法是以二进制的形式写到碰盘上<br>
     *
     * @param fileFullName 文件全名
     * @param fileContent  内容
     * @param append       是否追加
     * @throws java.io.IOException 例外
     */
    public static void fileWrite(String fileFullName, byte[] fileContent,
                                 boolean append) throws IOException {
        fileWrite(new File(fileFullName), fileContent, append);
    }

    /**
     * 将byte数组写入到文件，本方法是以二进制的形式写到碰盘上<br>
     *
     * @param fileFullName 文件全名
     * @param fileContent  内容
     * @param append       是否追加
     * @throws java.io.IOException 例外
     */
    public static void fileWrite(File fileFullName, byte[] fileContent,
                                 boolean append) throws IOException {
        FileOutputStream outputStream = null;
        try {
            // ---------------------------------
            // 获得一个二进制写入流的句柄
            // ---------------------------------
            outputStream = new FileOutputStream(fileFullName, append);
            // ---------------------------------
            // 写入内容
            // ---------------------------------
            outputStream.write(fileContent);
            // ---------------------------------
            // 将内容写到碰盘上
            // ---------------------------------
            outputStream.flush();
        } finally {
            if (outputStream != null) {
                // ---------------------------------
                // 如果句柄不为空。则最后要关闭句柄
                // ---------------------------------
                try {
                    outputStream.close();
                    outputStream = null;
                } catch (Exception e) {
                }
            }
        }
    }

    public static void fileWrite(File path, String fileName, String content,
                                 boolean append) throws IOException {
        if (!path.exists() || !path.isDirectory())
            path.mkdirs();
        File file = new File(path, fileName);
        fileWrite(file.getPath(), content, append);
    }

    public static void fileWrite(File path, String filename, byte[] data,
                                 boolean append) throws IOException {
        FileOutputStream fos = null;
        try {
            if (!path.exists()) {
                path.mkdirs();
            }
            fos = new FileOutputStream(new File(path, filename));
            fos.write(data);
            fos.close();
        } finally {
            if (fos != null)
                fos.close();
        }
    }

    /**
     * 根据URL地址，读取URL中的内容
     *
     * @param path URL地址
     * @return URL中的内容
     */
    public static String getUrlContent(String path) {
        String rtn = "";
        int c;
        try {
            if (path.indexOf("http://") == -1) {
                path = "http://" + path;
            }
            java.net.URL l_url = new java.net.URL(path);
            java.net.HttpURLConnection l_connection = (java.net.HttpURLConnection) l_url
                    .openConnection();
            l_connection.setRequestProperty("User-agent", "Mozilla/4.0");
            l_connection.connect();
            InputStream l_urlStream = l_connection.getInputStream();
            while (((c = l_urlStream.read()) != -1)) {
                int all = l_urlStream.available();
                byte[] b = new byte[all];
                l_urlStream.read(b);
                rtn += new String(b, "UTF-8");
            }
            // Thread.sleep(2000);
            l_urlStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rtn;
    }

    /**
     * 根据内容提取图片URL
     *
     * @param htmlStr 内容
     * @return 图片URL数组
     */
    public static String[] getImgStr(String htmlStr) {
        String img = "", tmp = "";
        java.util.regex.Pattern p_image;
        java.util.regex.Matcher m_image;

        String regEx_img = "<img\\s+[^>]*src=['\"]?([^'\"\\s>]*)['\"]?\\s*[^>]*>"; // 图片链接地址
        p_image = java.util.regex.Pattern.compile(regEx_img,
                java.util.regex.Pattern.CASE_INSENSITIVE);
        m_image = p_image.matcher(htmlStr);
        while (m_image.find()) {
            img = img + "," + m_image.group(1);
        }
        if (img.indexOf(",") >= 0) {
            String images = img.substring(1);
            return images.split(",");
        } else {
            return null;
        }
    }

    /**
     * @param size      文件大小
     * @param precision 保留的小数位
     * @return
     */
    public static String byteCountToDisplaySize(long size, int precision) {
        String displaySize;

        if (size / ONE_GB > 0) {
            displaySize = String.valueOf(size / ONE_GB) + " GB";
        } else if (size / ONE_MB > 0) {
            //当文件大小为MB级时，保留两位小数位
            BigDecimal bd = new BigDecimal((double) size / ONE_MB);
            double filesize = bd.setScale(precision, bd.ROUND_HALF_UP).doubleValue();
            String size2 = String.valueOf(filesize);
            if (size2.indexOf(".") == -1) {
                size2 = size2 + ".00";
            } else {
                for (int i = 0; i < precision - size2.substring(size2.indexOf(".") + 1).trim().length(); i++) {
                    size2 += "0";
                }
            }
            displaySize = size2 + " MB";
        } else if (size / ONE_KB > 0) {
            displaySize = String.valueOf(size / ONE_KB) + " KB";
        } else {
            displaySize = String.valueOf(size) + " bytes";
        }
        return displaySize;
    }

    private static final Logger logger = Logger.getLogger(FileUtils.class);
    public static final int SUCCESS = 0;
    public static final int SAMEFILENAME = 1;
    public static final int FILENOTEXISTS = 2;
    public static final int WRITEFILEERROR = 3;

    /**
     * 文件拷贝
     *
     * @param source
     * @param dest
     * @return
     */
    public static int CopyFile(String source, String dest) {
        File infile = null;
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            if (source.equals(dest)) {
                return SAMEFILENAME;  //判断源文件与目标文件是否相同
            }
            infile = new File(source);
            if (!infile.exists() || !infile.isFile()) {
                return FILENOTEXISTS;
            }
            in = new FileInputStream(infile);
            out = new FileOutputStream(new File(dest));
            byte[] b = new byte[in.available()];
            in.read(b);
            out.write(b);
            return SUCCESS;
        } catch (Exception e) {
            return WRITEFILEERROR;
        } finally {
            infile = null;
            if (in != null) {
                try {
                    in.close();
                } catch (Exception e1) {
                }
                in = null;
            }
            if (out != null) {
                try {
                    out.close();
                } catch (Exception e2) {
                }
                out = null;
            }
        }
    }

    /**
     * 创建目录
     *
     * @param dir
     */
    public static void md(String dir) {
        File m_fDir = new File(dir);

        if (m_fDir.exists()) {  //若目录存在则不作任何操作
        } else {
            m_fDir.mkdirs();    //否则建立目录
        }
    }


    public static void writeBaseFile(String pathname, String content) throws IOException {
        File path = new File(pathname);
        File parent = path.getParentFile();
        if (!parent.exists()) {
            parent.mkdirs();
        }
        if (!path.exists()) {
            path.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(path);
        try {
            byte[] buff = null;
            if (pathname.matches(".*[-_]utf8\\.(html|shtml|xml)")) {
                buff = content.getBytes("UTF-8");
            } else {
                buff = content.getBytes();
            }
            fos.write(buff, 0, buff.length);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fos.close();
        }
        long e = System.currentTimeMillis();
    }


    public static void writeFile(String pathname, String content) throws IOException {
        //先写入主存储
        writeBaseFile(pathname, content);

        //同时写入一份到二级务份存储
        //首先替换一下路径,把目录替换为备份文件
        //basePath=/home/cms2009/html
        //baseBackupPath=/home/cms2009/html2storage
        /*if (pathname != null && pathname.startsWith(PathUtils.basePath))
        {
            String backupPath = PathUtils.baseBackupPath + pathname.substring(PathUtils.basePath.length());
            writeBaseFile(backupPath, content);
        }*/
    }

    public static String readFile(String stopfile) {
        return readFileWithEncoding(stopfile, "GBK");
    }

    public static String readFileWithEncoding(String filePath, String encoding) {
        long s = System.currentTimeMillis();
        StringBuilder str = new StringBuilder();
        String tep = "";
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), encoding));
            while ((tep = in.readLine()) != null) {
                str.append(tep);
            }
        } catch (Exception e) {
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception e) {
                }
            }
        }
        long e = System.currentTimeMillis();
        if (e - s > 500)
            logger.debug("read file cost time:" + (e - s) + " " + filePath);
        return str.toString();
    }

}
