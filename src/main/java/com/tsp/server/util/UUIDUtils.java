package com.tsp.server.util;

import java.util.UUID;

/**
 * @description :
 * @author: liuyanlong
 * @date: created in 2018/2/3 23:30
 */
public class UUIDUtils {

    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-","");
    }
}
