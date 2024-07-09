import javax.xml.transform.Source;
import java.util.Scanner;

public class TinhTienLaichoVay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Tinh tien lai cho vay");
        double money = 1.0;
        int month = 1;
        double laisuat = 1.0;
        System.out.println("Nhập số tiền gửi: ");
        money = sc.nextDouble();
        System.out.println("Nhập số tháng gửi: ");
        month = sc.nextInt();
        System.out.println("Nhập lãi suất: ");
        laisuat = sc.nextDouble();
        double sum = 0;
        for (int i = 1; i <= month; i++) {
            sum += money * (laisuat/100)/12 * month;
            System.out.println("Tổng tien lai tháng "+ i + " : " + sum);
        }
    }
}
