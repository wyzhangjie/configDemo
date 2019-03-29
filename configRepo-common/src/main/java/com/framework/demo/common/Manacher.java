package com.framework.demo.common;

/**
 * Created by zhjie.zhang on 2019/3/26. 马拉车算法获取字符串中最大的回文
 */
public class Manacher {
    public static String split;

    private static String preHandleString(String s) {
        StringBuffer sb = new StringBuffer();
        sb.append("#");
        int len = s.length();
        for (int i = 0; i < len; i++) {
            sb.append(s.charAt(i));
            sb.append(split);
        }
        return sb.toString();
    }

    public static String getManacher(String s) {
        String str = preHandleString(s);
        int len = str.length();
        /** 右面边界*/
        int rightSide = 0;
        /** 右边界对应的中心位置*/
        int rightSideCenter = 0;
        /** 回文最长长度*/
        int longesthalf = 0;
        /**记录每个字符为中心的最长回文的半长 */
        int[] helfLenArr = new int[len];
        /** 记录回文中心 */
        int center = 0;

        for (int i = 0; i < str.length(); i++) {
            boolean needSce = true;
            if (i < rightSide) {
                int leftCenter = 2 * rightSideCenter - i;
                helfLenArr[i] = helfLenArr[leftCenter];
                if ((i + helfLenArr[i]) < rightSide) {
                    needSce = false;
                }
                if ((i + helfLenArr[i]) > rightSide) {
                    helfLenArr[i] = rightSide - i;
                }
            }
            if (needSce) {
                while (i - helfLenArr[i] - 1 >= 0 && i + 1 + helfLenArr[i] < len) {
                    if (str.charAt(i - helfLenArr[i] - 1) == str.charAt(i + 1 + helfLenArr[i])) {
                        helfLenArr[i]++;
                    } else {
                        break;
                    }
                }
                rightSide = i + helfLenArr[i];
                rightSideCenter = i;
                if (helfLenArr[i] > longesthalf) {
                    center = i;
                    longesthalf = helfLenArr[i];
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = center - longesthalf + 1; i < center + longesthalf; i += 2) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Manacher.split ="#";
        String[] testStrArr = new String[]{
                "abcdcef",
                "adaelele",
                "cabadabae",
                "cabababae"
        };
        for (String s : testStrArr) {
            System.out.println(String.format("原字符：%s", s));
            System.out.println(String.format("最长回文：%s", Manacher.getManacher(s)));

        }
    }

}
