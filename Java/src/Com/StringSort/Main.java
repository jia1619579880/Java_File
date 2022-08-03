package Com.StringSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] strArray = s.split(" ");

        int[] arr = new int[strArray.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }
        Arrays.sort(arr);
        System.out.println(ArrayListto(arr));

    }

    public static String ArrayListto(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (arr.length - 1 == i) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + " ");
            }
        }
        sb.append("]");
        String s = new String();
        s = sb.toString();
        return s;
    }
}
