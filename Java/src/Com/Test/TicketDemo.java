package Com.Test;

import java.util.Scanner;

public class TicketDemo {
    public static void main(String[] args) {
        int prise, mounth, level;
        double finalPrise = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        prise = sc.nextInt();
        System.out.println("请输入购买的月份:");
        mounth = sc.nextInt();
        System.out.println("请输入头等舱或经济舱（1/0）:");
        level = sc.nextInt();
        System.out.println(prise(prise,mounth,level));
    }
    public static int prise(int prise,int mounth,int level){
        int finalPrise=1;
        if ((mounth >= 11 && mounth <= 12) || (mounth <= 4 && mounth >= 1)) {
            //淡季
            if (level == 1) {
                finalPrise = (int)(prise * 0.7);

            } else if (level == 0) {
                finalPrise = (int)(prise * 0.65);
            } else {
                System.out.println("等级输入错误，请重新输入!");
            }

        } else if (mounth >= 5 && mounth <= 10) {
            //旺季
            if (level == 1) {
                finalPrise = (int)(prise * 0.9);
            } else if (level == 0) {
                finalPrise = (int)(prise * 0.85);
            } else {
                System.out.println("等级输入错误");
            }

        } else {
            System.out.println("月份输入错误!");
        }
        return finalPrise;
    }

}
