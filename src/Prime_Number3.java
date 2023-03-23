public class Prime_Number3 {
    public static void main(String[] args) {
        for (int n = 0; n < 100; n++) {
            if (checkPrime(n))
                System.out.println(n);
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



