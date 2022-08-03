package Com.Test;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(12));
    }
    public static boolean isPrime(int num){
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
