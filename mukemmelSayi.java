import java.util.Scanner;
public class mukemmelSayi {
    public static void main(String[] args) {
        int number;
        int total=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        number = inp.nextInt();

        for(int i =1 ; i <number ; i++) {
            if(number % i == 0){
                total += i;
            }
        }
        if(total==number){
            System.out.println(number +"  Mükemmel sayıdır");
        }else {
            System.out.print( number +"  Mükemmel sayı değildir");
        }


    }
}
