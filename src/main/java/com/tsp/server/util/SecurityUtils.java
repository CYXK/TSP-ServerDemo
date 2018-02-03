package com.tsp.server.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @description: 加密相关工具类
 * @author: liuyanlong
 * @date: created in 17-12-27 下午12:40
 */
public class SecurityUtils {

   private static final char[] chars = "0123456789abcdef".toCharArray();


    private static MessageDigest sha256;

    static {
        try {
            sha256 = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }


    public static String sha256(String souce) {
        byte[] digest = sha256.digest(souce.getBytes());
        return code2HexStr(digest);
    }

    /**
     * 将加密后的密文转化为16进制字符串
     * @param bs 加密后的密码
     * @return 16进制字符串
     */
    public static String code2HexStr(byte[] bs) {
        StringBuilder sb = new StringBuilder("");

        int bit;
        for(byte b : bs) {
            bit = (b & 0x0f0) >> 4;
            sb.append(chars[bit]);
            bit = b & 0x0f;
            sb.append(chars[bit]);
        }

        return sb.toString();
    }
}
