import java.util.Scanner;

public class findCift {
    public static void main(String[] args) {
        int i;
        int toplam = 0;
        Scanner deger = new Scanner(System.in);

        do {
            System.out.print("Bir Sayi Giriniz : ");
            i = deger.nextInt();
            if ((i % 2 == 0) && (i % 4 == 0)) ;
            toplam += i;
        } while (i % 2 == 0);
        System.out.print("Toplam : " + toplam);
    }
}
