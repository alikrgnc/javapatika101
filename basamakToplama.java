import java.util.Scanner;

public class basamakToplama {
    public static void main(String[] args) {
        int number, total = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Basamaklarini toplamak istediginiz sayiyi giriniz : ");
        number = inp.nextInt();
        do {
            int sonBasamak = number % 10;
            number /= 10;
            System.out.print(sonBasamak);
            if (number != 0) {
                System.out.print("+");
            }
            total+=sonBasamak;
        }while (number!=0);
        System.out.print(" = " + total);

    }
}