import java.util.Scanner;

public class MaxMinDigitFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        int max = 0;
        int min = 9;
        int a;

        while (temp > 0) {
            a = temp % 10;
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
            temp = temp / 10;
        }

        System.out.println(max);
        System.out.println(min);
    }
}
