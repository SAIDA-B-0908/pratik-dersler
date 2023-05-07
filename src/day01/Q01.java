package day01;

public class day Q01 {
    public static void main(String[] args) {
        /*
    Konsolda :

    "Hello "\git
    / 'World'"

    yazdiriniz.
    */

    /*
    \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
            \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
            \\  : Prints a back slash    : \  Ters slash yazdırır
            \'  : Prints single quote    : '  Tek tırnak yazdırır.
            \"  : Prints double quote    : "  Çift tırnak yazdırır.
   */


            System.out.println("Hello World"); // Hello World

            System.out.println("\""); // "

            System.out.println("\"Hello \"\\\n/ \'World\'\""); //    "Hello "\
            //    / 'World'"

            System.out.println("/"); //    /

            String afilliYazi = "\"Hello \"\\\n/ 'World'\"";
            char karakter = '\'';
            System.out.println(afilliYazi);

        }
    }

