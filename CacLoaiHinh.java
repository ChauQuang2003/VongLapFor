import java.util.Scanner;

public class CacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu: ");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;

                case 2:
                    System.out.println(" *");
                    System.out.println(" **");
                    System.out.println(" ***");
                    System.out.println(" *****");
                    System.out.println(" ******");
                    break;

                case 3:
                    System.out.println("     *   ");
                    System.out.println("    * *   ");
                    System.out.println("   * * *   ");
                    System.out.println(" * * * * *  ");
                    System.out.println("* * * * * *  ");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}