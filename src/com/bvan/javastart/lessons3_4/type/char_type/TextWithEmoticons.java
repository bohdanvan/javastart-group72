package com.bvan.javastart.lessons3_4.type.char_type;

/**
 * @author bvanchuhov
 */
public class TextWithEmoticons {

    public static void main(String[] args) {
        String text = "Native [1]\tApple [2]\tAndroid [3]\tAndroid [3]\tSymbola [4]\tTwitter [5]\tUnicode\tBytes (UTF-8)\tDescription\n" +
                "\uD83D\uDE01\n" +
                "\uD83D\uDE01\n" +
                "\uD83D\uDE01\n" +
                "U+1F601\t\\xF0\\x9F\\x98\\x81\tgrinning face with smiling eyes\n" +
                "\uD83D\uDE02\n" +
                "\uD83D\uDE02\n" +
                "\uD83D\uDE02\n" +
                "U+1F602\t\\xF0\\x9F\\x98\\x82\tface with tears of joy\n" +
                "\uD83D\uDE03\n" +
                "\uD83D\uDE03\n" +
                "\uD83D\uDE03\n" +
                "U+1F603\t\\xF0\\x9F\\x98\\x83\tsmiling face with open mouth\n" +
                "\uD83D\uDE04\n" +
                "\uD83D\uDE04\n" +
                "\uD83D\uDE04\n" +
                "U+1F604\t\\xF0\\x9F\\x98\\x84\tsmiling face with open mouth and smiling eyes\n";
        System.out.println(text);
    }
}
