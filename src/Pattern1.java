import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the size of n= ");
        int n = scr.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

