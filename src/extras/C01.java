package extras;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        /*
        Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz kadın için: K, erkek için: E");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        if (!(cinsiyet == 'K' || cinsiyet == 'E')) {
            System.out.println("Gecersiz cinsiyet girisi");
        } else if (cinsiyet == 'K') {
            if (yas < 16 || yas > 77) {
                System.out.println("Gecersiz yas girisi yaptiniz");
            } else if (yas >= 60) {
                System.out.println("Emekli olabilirsiniz");
            } else {
                System.out.println("Emekli olabilmeniz icin: " + (60 - yas) + " yıl calismaniz gerekiyor");
            }
        } else {
            if (yas < 16 || yas > 77) {
                System.out.println("Gecersiz yas girisi yaptiniz");
            } else if (yas >= 65) {
                System.out.println("Emekli olabilirsiniz");
            } else {
                System.out.println("Emekli olabilmeniz icin: " + (65 - yas) + " yıl calismaniz gerekiyor");
            }
        }
    }
}

