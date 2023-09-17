package Bolum_4_Operators;

public class Operators_1 {
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

        int sonucc= sayi2/sayi1;
        System.out.println("sonucc = " + sonucc); // int tam sayı verir. Burada ise kesirli bir sonuç var(1.5). int
                                        //tam sayı kısmı olanı alır. 1'i basar ama kesirli kısmı 0.5'i atar.

        double sonuccc= sayi2/sayi1;
        System.out.println("sonuccc = " + sonuccc); // double kesirli sayı verir. Burada da kesirli bir sonuç var(1.5). Ama
        //tam sayı kısmı olanı alır. 1.0'ı basar ama kesirli kısmı 0.5'i atar.Kesirli kısmı atılır tam sayı kalır elimizde

        double sonuc = sayi2 / (double)sayi1;  // 30/20=1.5 sonuç double olacağı için, eğer  sayı2 / sayı1 dersek sonuç 1.0 çıksr
                                        //değer kaybetmemek için sayi2 / (double)sayi1;
                                        // Herhangibirinin yanına (double) yazıp int olan tam sayılardan birini
                                        //double'a dönüştüreceğiz-yükselteceğiz..

        System.out.println("Sonuç = " + sonuc);  //int/int herzaman tamsayı çıkar tam sayıyı yazar, kesirli kısmını atar

        sonuc =(double) sayi2 / sayi1;
        System.out.println("Sonuç = " + sonuc); //buda olur.

        sonuc =(double) (sayi2 / sayi1);
        System.out.println("Sonuç = " + sonuc); //buda olmaz çünkü parantez önceliği var yani önce parantez içi yapılır
                                                // ve sonuc 1.0 çıkar.


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
