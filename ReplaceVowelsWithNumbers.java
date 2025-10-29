import java.util.Scanner;

public class ReplaceVowelsWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String newName = name.toLowerCase();
        String result = "";
        int count = 0;
        char[] arr = newName.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 'a':
                    result += 1;
                    count++;
                    break;
                case 'e':
                    result += 2;
                    count++;
                    break;
                case 'i':
                    result += 3;
                    count++;
                    break;
                case 'o':
                    result += 4;
                    count++;
                    break;
                case 'u':
                    result += 5;
                    count++;
                    break;
                default:
                    result += arr[i];
            }
        }

        System.out.println(result);
        System.out.println(count);
    }
}
