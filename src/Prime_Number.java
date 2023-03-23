import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so nguyen: ");
        int number = scanner.nextInt();

        if (number < 2)
            System.out.println(number + " khong phai so nguyen to");
        else {
            boolean check = true;
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " la so nguyen to");
            else
                System.out.println(number + " khong phai so nguyen to");
        }
    }
}
