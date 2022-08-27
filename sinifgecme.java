import java.util.Scanner;
public class sinifgecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        double avarage = ( mat + fizik + kimya + turkce + muzik) / 5 ;
        if (avarage <= 55){
            System.out.println("Sınıfta kaldınız!yazık");
        }else {
            System.out.println("Tebrikler geçtin lan");
            System.out.println("Ortalamanız : " + avarage);
        }


    }
}
