import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị: ");
        int number = sc.nextInt();
        int count = 0;
        int N = 12;
        while (count < number) {
            boolean isPrime = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    isPrime = false;

                }
            }
            if (isPrime) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
