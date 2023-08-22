import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
 class isPrime {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n, i, flag = 0;
        System.out.println("Enter any Number:");
        n = obj.nextInt();
        for (i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("is not a prime number:");
        }
        if (flag == 0) {
            System.out.println("is a prime number:");
        }
    }
}