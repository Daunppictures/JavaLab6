package ua.lviv.iot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordReplacer {

    public static String replaceWrongWords(String text, String changeStr) {
        Pattern pattern = Pattern.compile("\\b\\b[^aeyuio ]{3}\\w*\\b",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        text = matcher.replaceAll(changeStr);
        return text;
    }
}