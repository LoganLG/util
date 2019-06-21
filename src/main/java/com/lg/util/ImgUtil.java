package com.lg.util;

import org.springframework.util.StringUtils;

public class ImgUtil {
    /**
     * 判断文件是否为图片
     *
     * @param filename 文件名
     * @param type     判断具体文件类型
     * @return 检查后的结果
     * @throws Exception
     */
    public static boolean isImg(String filename, String type) {
        // 文件名称为空的场合
        if (!StringUtils.hasText(filename)) {
            // 返回不和合法
            return false;
        }
        // 获得文件后缀名
        String tmpName = filename.substring(filename.lastIndexOf(".") + 1, filename.length());
        // 声明图片后缀名数组
        String imgeArray[][] = {
                {"bmp", "0"}, {"dib", "1"}, {"gif", "2"},
                {"jfif", "3"}, {"jpe", "4"}, {"jpeg", "5"},
                {"jpg", "6"}, {"png", "7"}, {"tif", "8"},
                {"tiff", "9"}, {"ico", "10"}
        };
        // 遍历名称数组
        for (int i = 0; i < imgeArray.length; i++) {
            // 判断单个类型文件的场合
            if (StringUtils.hasText(type) && imgeArray[i][0].equals(tmpName.toLowerCase()) && imgeArray[i][0].equals(type)) {
                return true;
            }
            // 判断符合全部类型的场合
            if (!StringUtils.hasText(type) && imgeArray[i][0].equals(tmpName.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isImg("ec9ec155-b3cd-4684-bb97-a1070d777248.png", "png"));
    }
}
