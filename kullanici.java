import java.util.Scanner;

public class kullanici {

    public static void main(String[] args) {
	/*
	Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse
	yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı
	ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan program
	 */

        //Değişkenleri tanımlama ve kullanıcıdan bilgi alma işlemi
        String userName, password, nullification, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        //Eğer şifre dopruysa başarılı değilse hatalı giriş yaptınız işlemlerini yapma
        if(userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı...");
        }
        else {
            System.out.println("Hatalı Giriş!");
            /*ğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması
             gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
             sorun yoksa "Şifre oluşturuldu" yazan program
            / */
            System.out.println("Şifreyi Sıfırlamak ister misiniz?\nyes\nno");
            nullification = input.nextLine();
            if(nullification.equals("yes")) {
                newPassword = input.nextLine();
                if(newPassword.equals("java123") || newPassword.equals(password) ) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz. ");
                }
                else {
                    System.out.println("Şifre Oluşturuldu.");
                }
            }
        }


    }
}