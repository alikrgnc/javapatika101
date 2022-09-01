import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n,r,sonuc=0;
        int a=1,b=1,c=1;

        System.out.print("N degerini giriniz : ");
        n = inp.nextInt();
        System.out.print("R degerini giriniz : ");
        r = inp.nextInt();

        for(int i=1;i<=n;i++)
        {
            a*=i;
        }
        for(int i=1;i<=r;i++)
        {
            b*=i;
        }
        for(int i=1;i<=(n-r);i++)
        {
            c*=i;
        }
        sonuc=(a/(b*c));
        System.out.print("Kombinasyonu : "+sonuc);
    }
}