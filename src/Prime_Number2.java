import java.util.Scanner;

public class Prime_Number2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so luong so nguyen to can in:");
        int number = input.nextInt();

//
//        for (int count = 0, n = 2; count < number; n++) {
//            if (checkPrime(n)) {
//                System.out.println(n);
//                count++;
//            }
//        }
        int count = 0;
        int n =2;
        while (count < number){
            if (checkPrime(n)){
                System.out.println(n);
                count++;
            }
            n++;
        }

    }

    public static boolean checkPrime(int number) {
        if (number < 2)
            return false;
        else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0)
                    return false;
            }
        }
        return true;
    }
}

