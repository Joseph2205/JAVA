import java.util.Scanner;

public class EvenOddDigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        int b;
        int even = 0;
        int odd = 0;

        while (temp > 0) {
            b = temp % 10;
            if (b % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            temp = temp / 10;
        }

        System.out.println(even);
        System.out.println(odd);
    }
}
