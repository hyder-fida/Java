import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class swapNums {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a");
        a= obj.nextInt();
        System.out.println("Enter the value of b");

        b= obj.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping value of a is="+a+" and value of b is="+b);
    }
}