package ru.gramant.thinkgear.utils;

import android.text.format.DateFormat;

import java.util.Date;

/**
 * Created by fedor.belov on 06.11.13.
 */
public class FormatUtils {

    public static String dateToHumanTime(Long millis) {
        return DateFormat.format("k:mm:ss", new Date(millis)).toString();
    }

    public static String arrayToString(Object[] s, String glue) {
        int k = s.length;
        if (k == 0)
            return null;
        StringBuilder out = new StringBuilder();
        out.append(s[0].toString());
        for (int x = 1; x < k; ++x) {
            if (s[x] != null) out.append(glue).append(s[x].toString());
        }

        return out.toString();
    }

}
