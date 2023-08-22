import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
 class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         System.out.println("Enter the number of choice:");
         int num = sc.nextInt();
         if(num%2==0){
             System.out.println("Number is Even");
         }
        else{
             System.out.println("Number is odd");
         }
    }
}