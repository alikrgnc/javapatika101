import java.util.Scanner;
public class yildizYapma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak sayisi : ");
        int n = inp.nextInt();

        for (int i = 1; i <= 6 ; i++){
            for (int k = 1; k <= (n-i) ; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
