/*
package com.example.contact.util;

import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Logger;

public class BeanUtils {

    private static final String ERROR_JSON = "{\"error\":\"internal error, please try again later\"}";

    private static Logger logger = LoggerFactory.getLogger(BeanUtils.class);

    private BeanUtils() {}

*
     * 将权限字符串装换成权限数组
     *
     * @param auth 权限字符串
     *
     * @return 权限数组


    public static int[] getAuth(String auth) {
        int[] a = new int[5];
        if (Checker.isNotEmpty(auth)) {
            String[] u = auth.split(ValueConsts.COMMA_SIGN);
            int len = Math.min(a.length, u.length);
            for (int i = 0; i < len; i++) {
                a[i] = Formatter.stringToInt(u[i]);
            }
        }
        return a;
    }

*
     * 将Bean转换成JSON
     *
     * @param object Bean对象
     *
     * @return {@link String}


    public static String toPrettyJson(Object object) {
        String result;
        try {
            result = com.example.contact.util.BeanUtils.toPrettyJson(object, FieldModifier.PRIVATE);
        } catch (IllegalAccessException e) {
            result = Formatter.formatJson(ERROR_JSON);
            logger.error(e.getMessage());
        }
        return result;
    }

*
     * 将类属性装换成JSON（只能转换有get方法的）
     *
     * @param object 转换的对象
     *
     * @return {@link JSONObject}


    public static JSONObject beanToJson(Object object) {
        try {
            return com.example.contact.util.BeanUtils.beanToJson(object);
        } catch (IllegalAccessException | InvocationTargetException e) {
            logger.error(e.getMessage());
            return null;
        }
    }
}
*/
