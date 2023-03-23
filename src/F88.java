import java.util.Scanner;

public class F88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so tien cho vay:");
        double money = scanner.nextDouble();

        System.out.println("Nhap so thang cho vay:");
        int month = scanner.nextInt();

        System.out.println("Nhap lai suat hang thang:");
        float interestRate = scanner.nextFloat();

        double interest = money * month * interestRate;
        System.out.println("So tien lai nhan duoc: " + interest);
    }
}
