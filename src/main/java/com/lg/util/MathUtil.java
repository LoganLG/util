package com.lg.util;

import java.math.BigDecimal;

/**
 * MathUtil
 * @author JLer
 * @version 1.0 2018-4-12 16:45
 */
public class MathUtil {

    public static float keepTwoDecimal(float f) {
        BigDecimal bd = new BigDecimal(f);
        return bd.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
    }
}