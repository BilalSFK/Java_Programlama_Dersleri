package Bolum_5_ControlFlowStatements;

public class For_Loop_Dongu_Ornek1 {
    public static void main(String[] args) {

        // todo SORU-1: 1’den 10’a kadar olan sayıların toplamını bulan java programını yazınız.

        int top = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        System.out.println("Toplam : " + top);              // todo böyle tek tek yazmamak için for döngüsü kullanırız.
        // todo 55 çıkar.

        // todo =,+=,-=...
        //  i     --> 1 2 3 4  5  6  7  8  9 10 11-->11 false olunca döngüden çıktı.
        //  toplam--> 0 1 3 6 10 15 21 28 36 45 55

        int toplam = 0;
        for (int i = 0; i <= 10; i++) {  // todo 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55   i <= 11 False ve döngü biter.
            toplam += i;                 // todo toplam = toplam +i;
        }
        System.out.println("Toplam : " + toplam);       // todo 55 çıkar.

    }
}
