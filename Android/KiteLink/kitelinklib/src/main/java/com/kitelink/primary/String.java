package com.kitelink.primary;

import java.io.UnsupportedEncodingException;

/**
 * Created by ming on 2017/2/20.
 */

public class String {
    private java.lang.String value = "";

    public String() {
        value = new java.lang.String();
    }

    public String(byte[] bytes, String charsetName) {
        if (charsetName == null) {
            return;
        }

        if (bytes == null) {
            return;
        }

        try {
            value = new java.lang.String(bytes, charsetName.toString());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private String(java.lang.String value) {
        this.value = value;
    }

    public int lenght() {
        return value.length();
    }

    public String substring(int start, int end) {
        java.lang.String subString = value.substring(start, end);

        return new String(subString);
    }

    public boolean isEmpty() {
        return value.isEmpty();
    }

    public byte[] getBytes() {
        return value.getBytes();
    }

    public int indexOf(String str) {
        return value.indexOf(str.toString());
    }

    public int lastIndexOf(String str) {
        return value.lastIndexOf(str.toString());
    }

    public String replace(String target, String replacement) {
        java.lang.String str = value.replace(target.toString(), replacement.toString());
        return new String(str);
    }

    public String[] split(String regex) {
        java.lang.String[] str = value.split(regex.toString());
        String[] strArray = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            strArray[i] = new String(str[i]);
        }

        return strArray;
    }

    public String trim() {
        java.lang.String str = value.trim();
        return new String(str);
    }


    @Override
    public boolean equals(Object o) {

        return value.equals(o);

    }

    @Override
    public java.lang.String toString() {
        return value.toString();
    }
}
