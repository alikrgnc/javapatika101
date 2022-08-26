import java.util.Scanner;
public class vucutkitle {
    public static void main(String[] args) {
        double boy ;
        double kilo;

        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Kilonuzu Giriniz : ");
        kilo = inp.nextDouble();
        double kitle = kilo / (boy * boy);

        System.out.print("Vucut Kitle Endeksiniz : " + kitle);


    }
}
