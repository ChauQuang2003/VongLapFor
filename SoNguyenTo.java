import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số:");
        int number = sc.nextInt();
        if (number < 1) {
            System.out.println("Không là số nguyên tố");

        } else {
            int sum = 2;
            boolean check = true;
            while (sum < number) {
                if (number % sum == 0) {
                    check = false;
                    break;
                }
                sum++;
            }
            if (check) {
                System.out.println(number + " không là số nguyên tố");
            } else {
                System.out.println(number + " là số nguyên tố");
            }
        }
    }
}
