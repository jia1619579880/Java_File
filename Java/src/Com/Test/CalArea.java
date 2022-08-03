package Com.Test;

/*
今日学习打卡
日期：2022\8\3
今日收获：了解了标识符的命名规则、以及数据类型的认知，知道了自动类型转换和强制类型转换以字节低到高来转换。以及运算符的优先级，多出来的取余运算符的运用，自增自减的应用，以及加号可以在输出语句中使用，可以拼接字符串。
遗留问题：无
明日计划：了解高级语言的流程控制语句，顺序，选择，循环结构
* */

import java.util.Scanner;

public class CalArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Radius:");
        double r = sc.nextDouble();
        System.out.println("enter high:");
        double h = sc.nextDouble();
        double s = r * r * 3.14;
        System.out.println("The Area of cylinder is : " + s);
        double v = s * h;
        System.out.println("The volume of cylinder is :" + v  );
    }
}
