import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Fibonacci {
    public static void main(String[] args) {
        Scanner fb = new Scanner(System.in);
        System.out.println("Enter the end of series:");
        int a=0,b=1,i,n,c;
        n= fb.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(i=0;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}