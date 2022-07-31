package com.Test;

import java.util.Random;

public class ScanCode {
    public static void main(String[] args) {
        //验证码  前四位大小写字母  第五为为0～9的数字；
        //把52个大小写数组存储到string里面  随机抽取四次
        char[] arr = new char[52];
        char j = 'a';
        int i;
        for (i = 0, j = 'a'; i < 26; i++, j++) {
            arr[i] = j;
        }
        for (i = 26, j = 'A'; i < 52; i++, j++) {
            arr[i] = j;
        }
        Random r = new Random();

        String result = "";

        for(i=0;i<4;i++){
            int randomIndex = r.nextInt(arr.length);
//            System.out.print(arr[randomIndex]);
            result+=arr[randomIndex];
        }
        int randomNum = r.nextInt(10);
        result+=randomNum;

        System.out.print(result);



    }
}
