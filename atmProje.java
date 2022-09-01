import java.util.Scanner;
public class atmProje {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int select, balance = 1500;

        while (right > 0) {
            System.out.println("Your UserName:");
            userName = inp.nextLine();
            System.out.println("Your password:");
            password = inp.nextLine();
            if (userName.equals("ali") && password.equals("1234")) {
                System.out.println("You have logged into the system.");

                do {
                    System.out.println("---------------------");
                    System.out.println("Lütfen işleminizi seçin : ");
                    System.out.println("\n1-Para yatırma\n2-Para çekme\n3-Bakiye sorgulama\n4-Çıkış");
                    select = inp.nextInt();
                    if (select == 1){
                        System.out.println("Yatırılan Para : ");
                        int price = inp.nextInt();
                        balance += price;
                    }else if (select == 2){
                        System.out.println("Çekilen  Para : ");
                        int price = inp.nextInt();
                        if (price <=balance){
                            balance -= price;
                            System.out.println(price + "hesabinizdan çekildi , yeni bakiyeniz" +balance);

                        }else {
                            System.out.println("Bakiyeniz bu tutarı çekmek için yetersiz");
                        }
                    } else if (select == 3){
                        System.out.println("Toplam bakiyeniz : " +balance);
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere");
                break;

            }else {
                right --;
                System.out.println("Hatalı girdiniz, kalan hakkınız");
                if (right == 0){
                    System.out.println("Hesabiniz bloke oldu, lütfen müşteri temsilcisini arayın");
                } else {
                    System.out.println("kalan giriş hakkınız" +right);
                }
            }


        }

    }
}