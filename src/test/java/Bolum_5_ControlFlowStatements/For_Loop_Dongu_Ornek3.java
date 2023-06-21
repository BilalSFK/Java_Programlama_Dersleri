package Bolum_5_ControlFlowStatements;

public class For_Loop_Dongu_Ornek3 {
    public static void main(String[] args) {

        // todo SORU-3: =>1'den 5'e kadar olan sayıların (5! 5 faktöriyel demek)çarpımını bulan Java programı yazınız.

        // todo       i   ->    1  2  3  4   5   6     -->1'den 5'e kadar  (i=<5)     i=<6 FALSE ve döngüden çıkar.
        // todo      Çarpma ->  1  1  2  6  24  120
        int carpim = 1;                                  // todo çarpmanın etkisiz elemanı 1'dir.
        for (int i = 1; i <= 5; i++) {
            carpim = carpim * i;
        }
        System.out.println("Çarpım : " + carpim);

        // todo SORU-4: =>5'den 1'e kadar olan sayıların çarpımını bulan Java programı yazınız.
        // todo Çarpım işlemini tersten yaparsak; 5 4 3 2 1 sırasıyla gidersek;

        carpim = 1;                                  // todo çarpmanın etkisiz elemanı 1'dir.
        for (int i = 5; i >= 1; i--) {  // todo 5 1'den büyükmü? 4 1'den büyükmü.... i-- her defasında 1 azaltır.
            carpim = carpim * i;
        }
        System.out.println("Çarpım : " + carpim);

        carpim = 0;                    // todo çarpmanın etkisiz elemanı 1'dir. Ama 0 yaparsak?
        for (int i = 5; i >= 1; i--) {
            carpim = carpim * i;       // todo Her defasında 0 ile çarpılır ve sonuç 0 çıkar.
        }
        System.out.println("Çarpım : " + carpim);

    }
}
