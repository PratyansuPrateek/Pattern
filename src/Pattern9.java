import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the Size of the Pattern: ");
        int n = scr.nextInt();

        int star = 1;
        int space = n / 2;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            System.out.println();
            if (i < n / 2) {
                space--;
                star += 2;
            }  else if(i == n / 2) {

            } else {
                space++;
                star -= 2;
            }
        }
    }
}
