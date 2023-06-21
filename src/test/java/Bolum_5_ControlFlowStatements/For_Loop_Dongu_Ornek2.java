package Bolum_5_ControlFlowStatements;

public class For_Loop_Dongu_Ornek2 {
    public static void main(String[] args) {

        // todo SORU-2: 1’den 100’a kadar olan ÇİFT sayıların toplamını bulan java programını yazınız.

        // todo 1.YÖNTEM KOLAY
        int toplam = 0;
        for (int i = 0; i <= 100; i += 2) {      // todo i += 2 -->i=i+2 ile çifter çifter toplarım
            toplam = toplam + i;
        }
        System.out.println("Toplam : " + toplam);

        // todo 2.YÖNTEM MOD ALARAK
        int sum = 0;                               // todo Toplamanın etkisiz elemanı 0'dır.
        for (int i = 1; i <= 100; i++) {           // todo i++  tek tek gider if şartıyla 0'a tam bölünenleri toplarım.
            if (i % 2 == 0) {         // todo if i'nin 2'ye bölümünden kalan 0 ise true ve bloktan girip topla demektir.
                sum = sum + i;
            }
        }
        System.out.println("Sum : " + sum);
    }
}
