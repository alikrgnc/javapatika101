import java.util.Scanner;
public class tersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayisi : ");
        int n = inp.nextInt();

        for (int i = 1; i <= n ; i++){
            for (int j = 1; j <= (i-1); j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2*n) - (2*i-1)); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
