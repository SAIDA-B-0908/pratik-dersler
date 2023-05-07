package extras;

import java.util.Scanner;

public class C01_same {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Cinsiyetinizi girin (Erkek/Kadin): ");
            String cinsiyet = scanner.nextLine();
            System.out.print("Yaşınızı girin: ");
            int yas = scanner.nextInt();

            if (cinsiyet.equalsIgnoreCase("erkek") && yas >= 65) {
                System.out.println("Emekli olabilirsiniz.");
            } else if (cinsiyet.equalsIgnoreCase("kadin") && yas >= 60) {
                System.out.println("Emekli olabilirsiniz.");
            } else {
                int emeklilikYasi = cinsiyet.equalsIgnoreCase("erkek") ? 65 : 60;
                int kalanYil = emeklilikYasi - yas;
                System.out.println("Emekli olmak için " + kalanYil + " yıl daha çalışmanız gerekiyor.");
            }
        }
    }

