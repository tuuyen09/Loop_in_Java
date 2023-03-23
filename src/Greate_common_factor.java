import java.util.Scanner;

public class Greate_common_factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so nguyen a:");
        int a = scanner.nextInt();

        System.out.println("Nhap so nguyen b:");
        int b = scanner.nextInt();

        if (a == 0 || b == 0) {
            if (a == 0) {
                System.out.println(Math.abs(b));
            } else {
                System.out.println(Math.abs(a));
            }
        } else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("Greatest common factor: " + a);

        }
    }


}


