
import java.util.Scanner;

public class Latihan1 {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka Pertama: ");
        int num1 = input.nextInt();

        System.out.print("Masukan Angka Kedua : ");
        int num2 = input.nextInt();

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + ((float) num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));

        input.close();
    }
}
