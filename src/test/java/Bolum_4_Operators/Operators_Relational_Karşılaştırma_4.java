package Bolum_4_Operators;

public class Operators_Relational_Karşılaştırma_4 {
    public static void main(String[] args) {
        // todo Karşılaştırma ve İlişkisel operatörler
        // todo ==, !=, <, >, <=, >=  2 değerin karşılaştırılmasında kullanıyoruz.

        int x = 5;
        int y = 3;

        System.out.println(x == y);  // todo x ve y birbirine eşit midir? False geldi
        System.out.println(x != y);  // todo x ve y birbirine eşit değil midir? True geldi
        System.out.println(x > y);   // todo x  y'den büyük müdür? True geldi
        System.out.println(x >= y);  // todo x  y'den büyük veya eşit midir? True geldi
        System.out.println(x <= y);  // todo y  x'den büyük veya eşit midir? False geldi

        // todo SORU Kısa kenar ve uzun kenar uzunlukları verilen iki dikdörtgenin
        //  alanlarını ve çevrelerini karşılaştıran bir Java porgramı yazınız.
        //  Birinci Dikdörtgenin Uzunlukları kk-> kısakenar uk-> uzunkenar
        int kk_1 = 7;
        int uk_1 = 10;
        // todo İkinci Dikdörtgenin Uzunlukları
        int kk_2 = 4;
        int uk_2 = 6;

        // todo Alan hesaplama ->uk*kk
        int alan_1 = uk_1 * kk_1;
        System.out.println("Alan_1 : " + alan_1);

        int alan_2 = uk_2 * kk_2;
        System.out.println("Alan_2 : " + alan_2);

        // todo Çevre hesaplama ->2(uk+kk)
        int cevre_1 = 2 * (uk_1 + kk_1);
        System.out.println("Çevre_1 :" + cevre_1);

        int cevre_2 = 2 * (uk_2 + kk_2);
        System.out.println("Çevre_2 :" + cevre_2);

        // todo Şimdi Alanları Karşılaştıralım-> cevre_1>cevre_2 cevre 1 cevre 2 den büyükmüdür?
        //  Bunu yapabilmek için akışı kontrol edebilmek için if kullanabiliriz artık.
        //  Bu buna eşitse şunu yap değilse şunu yap gibi
        //  if  yani Control Flow Statements- day06-video1-00.41.17
        //  KONTROL AKIŞ İFADELERİ -->ASIL 6.DAYDE ANLATILACAK burda niye bahsediyor çünkü if olmadan operatörlerden
        //  bahsedilemediği için

        if (alan_1 > alan_2) {   // todo if(şart) eğer alan_1 alan_2 den büyükse bir şart koş.
            //todo Şunu yap şunu ekrana bas gibi-->akışı yönlendiriyoruz
            System.out.println("İlk Dikdörtgenin alanı daha büyüktür"); // todo alan_1 büyük old. için soldaki ifadeyi yazar
        }
        // todo if else if else bütün durumları yazarız sırayla cevre_1>cevre_2 -> 1.durum cevre_2>cevre_1 -> 2.durum
        //  else-->kalan son ihtimali yazıyor-->3.durum

        if (cevre_1 < cevre_2) {        // todo  şart True ise bloktan içeri girip yazdırır. Değilse else if'e gidip durum True ise o bloktan girer.
            System.out.println("İkinci Dikdörtgenin çevresi daha büyüktür");
        } else if (cevre_1 > cevre_2) { // todo eğer böyle ise(TRUE) bu bloka gir ve soutu yazdır
            System.out.println("İlk Dikdörtgenin çevresi daha büyüktür");
        } else {  // todo yukarıda iki ihtimalde geçersiz ise bunu yazdırır.  ELSE'de şart yok if ve else if'de FALSE alırsa giremez en son bunu yazar
            System.out.println("İki Dikdörtgenin birbirine eşittir");  // todo ( )-->condition,(durum)) yok else'de-->kalan son ihtimali yazıyoruz
        }
        // todo sayılarda 3 ihtimal olur biri diğerinden büyük-diğeri birinden büyük-yada her ikisi birbirine eşit olan 3 durum olur
        //  peki 3'den fazla durum olursa mesela bir arabanın 1-sağa 2-sola 3-ileri 4-geri ve 5-durma koşulları toplam 5 koşul varsa;
        //  ilk 1-if sonra 2-else if, 3-else if, 4-else if, en son 5-else deyip bitiririz.

    }
}
