package Bolum_2_Variables_and_DataTypes;

public class DataTypes_7 {
    public static void main(String[] args) {

        //Tam sayılar "Whole numbers" or "integer" integer da tam sayı demek

        byte b = -101;//-->128 OLMAZ çünkü byte -128 den 127'e kadar kutu açıyor toplam 256 adet rakama izin veriyor
        short s = 32767;  //-->-32,768 den 32,767'ye kadar gider
        int i = 500_000;
        long l = 5_000_000_000_000L;

        //Kesirli sayılar (Floating Point numbers)

        double kilo = 72.8;   // İngilizcede , decimalde virgül kullanılmadığı için NOKTA kullanırız.
        float price = 45.5F;     //F veya f  kullanabiliriz. f koymazsak hata verir double kabul eder.

        boolean dogruMu = false;
        boolean doluMu = true;
        boolean yetiskinMi = false;
        boolean isAdult = true;
        boolean evliMi = true;

        char aKarakteri = 'A';
        char ucodeA = '\u2749';      // char karakteri 65535' kadar gider. İçerisinde tüm Dünya dillerini barındırır.
                                     // tekli karakterler, harfler veya ASCII değerleri

        System.out.println(aKarakteri);
        System.out.println(ucodeA);

    }
}
