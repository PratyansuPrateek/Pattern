import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the size of the Pattern: ");
        int n = scr.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
