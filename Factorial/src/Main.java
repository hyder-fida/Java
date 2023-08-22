import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
 class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");

        int num, fact=1, i;
        num = sc.nextInt();

        for(i=num;i>0;i--){
            fact= fact*i;
        }
        System.out.println("Factorial is:"+fact);
    }
}