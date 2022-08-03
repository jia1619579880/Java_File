package Com.Test;

public class Shuixianhuashu {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Shuixian();
        Notwonum();
        FourStar();
        FiveStar();
        long end = System.currentTimeMillis();
        System.out.println("共耗时:"+(end-start)+"毫秒");
    }

    public static void Shuixian() {
        System.out.print("水仙花: ");
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int a = i / 100 % 10;
            int b = i / 10 % 10;
            int c = i % 10;
            double sum = Math.pow(c, 3) + Math.pow(b, 3) + Math.pow(a, 3);
            if (sum == i) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("============");


    }

    public static void Notwonum() {
        System.out.print("两位数: ");
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int a = i % 10;
            int b = i / 10;
            double sum = Math.pow(a, 2) + Math.pow(b, 2);
            if (sum == i) {
                count++;
            }
        }
        System.out.println("============");

    }

    public static void FourStar() {
        System.out.print("四位数 ");
        for (int i = 1001; i < 10000; i++) {
            int g = i % 10;
            int s = i / 10 % 10;
            int b = i / 100 % 10;
            int q = i / 1000 % 10;
            double sum = Math.pow(g, 4) + Math.pow(s, 4) + Math.pow(b, 4) + Math.pow(q, 4);
            if (sum == i) {
                System.out.println(i);
            }
        }
        System.out.println("============");
    }

    public static void FiveStar() {
        System.out.println("五位数");
        for(int i = 10001;i<100000;i++){
            int g = i%10;
            int s = i/10%10;
            int b = i/100%10;
            int q = i/1000%10;
            int w = i/10000%10;
            double sum = Math.pow(g,5)+Math.pow(s,5)+Math.pow(b,5)+Math.pow(q,5)+Math.pow(w,5);
            if(sum == i){
                System.out.println(i);
            }
        }
        System.out.println("============");
    }
}