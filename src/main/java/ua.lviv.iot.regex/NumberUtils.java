package ua.lviv.iot.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberUtils {
    public static String findNumbersInTextAndReverseIt(final String inputText) {
        Pattern p = Pattern.compile("(\\d{7}) | (\\d{3}-\\d{2}-\\d{2}) | "
                + "(\\d{2}-\\d{2}-\\d{2}-\\d{1})");
        Matcher m = p.matcher(inputText);

        StringBuffer result = new StringBuffer();
        while (m.find()) {
            StringBuffer buffer = new StringBuffer(m.group());
            m.appendReplacement(result, buffer.reverse().toString());
        }
        m.appendTail(result);
        return result.toString();
    }
}