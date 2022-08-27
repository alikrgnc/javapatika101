import java.util.Scanner;

public class hesapmakine {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayı :");
        n1 = input.nextInt();

        System.out.print("İkinci Sayı :");
        n2 = input.nextInt();

        System.out.println(" Toplama 1\n Çıkarma 2\n Çarpma 3 \n Bölme 4 : ");
        System.out.println(" Seçiminiz : ");
        select = input.nextInt();


        switch(select){
            case 1:
                System.out.println("Toplam : "+ (n1 + n2));
                break;
            case 2:
                System.out.println("Toplam : "+ (n1 - n2));
                break;
            case 3:
                System.out.println("Toplam : "+ (n1 * n2));
                break;
            case 4:
                switch (n2){
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez.");
                    default:
                        System.out.println("Bölüm: " + (n1/n2));
                        break;
                }
            break;
                default:
                System.out.println("Tekrar sayı giriniz!hatalı");
                break;

        }


    }
}
