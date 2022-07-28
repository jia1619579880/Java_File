package com.itheima;
//import javax.script.ScriptContext;
//import java.util.Scanner;
//import java.util.Scanner;
//设计一个方法  需求是判断两个数组的元素是否相同
public class test01 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("输入一个数字:");
//        int num = sc.nextInt();
//        int[] arr={1,2,3,4,5};
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==num){
//                System.out.println(i);
//            }
//        }
//        System.out.println(-1);
//        int[] arr={11,22,33,44,55};
//        int i;
//        for(i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        for(i=arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
        //创建对象
        helloworld h = new helloworld();
        System.out.println(h.brand);
        System.out.println(h.prise);
        //赋初值
        h.brand = "apple";
        h.prise = 399;
        System.out.println(h.brand);
        System.out.println(h.prise);
        h.call();
        h.massege();
    }
}
