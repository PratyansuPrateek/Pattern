import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the size of the Pattern: ");
        int n = scr.nextInt();

        int star = (n*2)-1;
        int space = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            System.out.println();
            space++;
            star-=2;
        }
    }
}
