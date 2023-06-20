package Bolum_5_ControlFlowStatements;

public class BitwiseOperators_2 {
    public static void main(String[] args) {
        // todo Bitwise Operators
        // todo &,|,^,~,<<,>>,>>>
        // todo           76543210
        // todo    0 0 0 0 0 1 0 1 =>101==> (2 üzeri 0 * 1) = 1 + (2 üzeri 1 *0) = 0 + (2 üzeri 2 * 1) = 4 -->1+0+ 4=5;

        int x=64;   // todo 01000000
        int y=7;    // todo 00000111
        int r=x&y;  // todo 00000000
        int r2=x|y; // todo 01000111

        int sayi=128;  // todo 128 normalde 10000000 ama bir sağa kaydır >> işaretiyle 01000000 bu yani 64' e dönüşüyor.
        sayi=sayi>>1;  // todo  >> bu işaret bitleri 1 sağa kaydır demek
        y=y>>1;        // todo int y=7 yani 00000111 ama bir sağa kaydır >> işaretiyle 00000011 yani 3 olur.
                       // todo burada anlatılan int bölümlerderde double'a dönüştürmezsek karşılaşılacak ver kaybını gösterir.
                       // todo 7/2=3 çıkar küsurat 0,5 silinmiş olur.

        System.out.println(r);
        System.out.println(r2);
        System.out.println(sayi);
        System.out.println(y);

        y=y<<2;      // todo int y=7 yani 00000111 ve yukarıda 00000011 yani 3'e düşmüştü. Şimdi  00000011'i 2 sola kaydırırsak;
        System.out.println(y); // todo 00001100-->4+8=12 çıkar.
    }
}


