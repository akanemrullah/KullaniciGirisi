import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Intiger ve String degiskenlerimizi tanimladik.
        int select;
        String userName, password, newPassword;

        // Ilk scanner nesnemizi projemize dahil ettik.
        Scanner input = new Scanner(System.in);

        // Kullanici adi ve sifre bilgileri kullanicidan alinip ilgili degiskenlere atandilar.
        System.out.print("Kullanici adinizi giriniz: ");
        userName = input.nextLine();

        System.out.print("Sifrenizi giriniz: ");
        password = input.nextLine();

        // Mantiksal kontroller saglandi.
        if (userName.equals("patika")) {
            if (password.equals("java123")) {
                System.out.println("Giris basarili!!");
            } else {
                System.out.print("\nBasarisiz.\nKullanici adiniz veya sifreniz hatalidir!");
                System.out.print("\nSifrenizi sifirlamak ister misiniz?\n Evet: 1, Hayir: 2\nSeciminiz: ");
                select = input.nextInt();

                if (select == 1) {
                    System.out.println("Lutfen yeni sifrenizi giriniz: ");

                    Scanner inp = new Scanner(System.in);
                    newPassword = inp.nextLine();

                    if (newPassword.equals("java123")) {
                        System.out.println("Guncellemek istediginiz sifreniz eski sifreniz olamaz!!\nFarkli bir sifre belirleyiniz.");
                    } else {
                        System.out.println("Sifre olusturuldu.");
                    }

                } else if (select == 2) {
                    System.out.println("Lutfen tekrar giris yapmayi deneyiniz.");
                } else {
                    System.out.println("Hatali secimde bulunuldu!!");
                }
            }
        } else {
            System.out.println("Kullanici adinizi veya sifrenizi hatali girdiniz. Tekrar deneyiniz!!");
        }
    }
}