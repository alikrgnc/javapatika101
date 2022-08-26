import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        double elma,armut,domates,muz,patlican;
        double elmakg = 3.67 , armutkg = 2.14 , domateskg = 1.11 , muzkg = 0.95 , patlicankg = 5.0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Elma kg : ");
        elma = inp.nextDouble();
        System.out.print("Armut kg : ");
        armut = inp.nextDouble();
        System.out.print("Domates kg : ");
        domates = inp.nextDouble();
        System.out.print("Muz kg : ");
        muz = inp.nextDouble();
        System.out.print("Patlıcan kg : ");
        patlican = inp.nextDouble();

        double tutar;
        tutar = (elma * elmakg) + (armut*armutkg) + (domates*domateskg) + (muz*muzkg) + (patlican*patlicankg);
        System.out.print("Toplam Ücret :  " + tutar);



    }
}
