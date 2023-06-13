package Bolum_4_Operators;

public class Operators {
    public static void main(String[] args) {
        //Operators
        // Arithmetic Operators
        /*
            Toplama: + --> operand1 ve oprand2'in değerlerini toplar.
            Çıkarma: - --> operand1 ve operan2'nin farkını alır
            Çarpma: *  --> operand1 ve operan2 değerlerini çarpar
            Bölme: /   --> operand1'i operand2'ye böler
            Mod alma: % --> operand1'in operand2'ye bölümünden kalanı verir
            ++ -->     ARTIRMA incremental operator--> sayının değerini 1 artırma
            -- -->     Eksiltme decremental operator --> sayının değerini 1 eksiltir
         */

        int sayi1 = 20;
        int sayi2 = 30;
        int toplam = sayi1 + sayi2;

        System.out.println("Toplam = " + toplam);         //50 çıkar
        System.out.println("Toplam = " + sayi1 + sayi2);  // 2030 çıkar. Çünkü "Toplam = " String bir ifade
                                                          // buna  + ile direk int bir değer gelirse onu Stringe çeviriryor.
                                                          // Concodanete işlemi oluyor.

        System.out.println("Toplam = " + (sayi1 + sayi2)); //Öncelik herzaman Parantez içindedir. 50 basar


        int fark = sayi1 - sayi2;

        System.out.println("Fark = " + fark);

        int result = sayi1 * sayi2;

        System.out.println("Result = " + result);


        double sonuc = sayi2 / (double)sayi1;  // 30/20=1.5 sonuç double olacağı için, eğer  sayı2 / sayı1 dersek sonuç 1.0 çıksr
                                        //değer kaybetmemek için sayi2 / (double)sayi1; birinin yanına (double) yazıp int olan sayılardan birini
                                        //double'a dönüştüreceğiz..
        System.out.println("Sonuç = " + sonuc);  //int/int herzaman tamsayı çıkar tam sayıyı yazar, kesirli kısmını atar

        int kalan = 7 % 2;   //Programlamada 0,1 istenen durumlarda beyaz siyah yada 1 den 100'e kadar olan sayılarda tek olanları yazdır gibi sorular
        System.out.println("Kalan = " + kalan); //mod almayı çok kullanırız.

        int x = 5;
        int y = 4;
        System.out.println("x mod y : " + (x % y));

        int sayi = 5;
        System.out.println("Sayı --> " + sayi);
        sayi++;
        System.out.println("Sayı --> " + sayi);
    }
}
