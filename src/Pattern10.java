import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the size of the Pattern: ");
        int n = scr.nextInt();
        int star = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n/2){
                star++;
            }else{
                star--;
            }
        }
    }
}
