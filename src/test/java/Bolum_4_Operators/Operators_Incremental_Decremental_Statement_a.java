package Bolum_4_Operators;

public class Operators_Incremental_Decremental_Statement_a {
    public static void main(String[] args) {
        // todo: ++ ve -- operatörleri-->1 artırmak ve 1 eksiltmek için kullanılır.
        //  Bu iki operatör TEK BAŞLARINA kullanıldıklarında prefix(ön ek) veya postfix(son ek) olarak kullanılmasının
        //  hiçbir farkı yoktur.
        //  x++; tamamı bir statement'dır. ve x'in değerini 1 artırır. x=x+1; de x in değerini 1 artırır.
        //  x++; x=x+1; x +=1; hepsi aynı sonucu verir.


        // TODO TEK BAŞINA KULLANIMI (++ prefix ve postfix ++ kullanımı nda sonuç değişmez)
        int x = 5;
        System.out.println(x);
        x++;             // TODO Post inremental-Postfix-Suffix(değişkenden sonra gelen ++)(son ek)
        System.out.println(x);
        ++x;             // TODO Pre inremental-Prefix (değişkenden önce gelen ++)(ön ek)
        System.out.println(x);
        x--;
        System.out.println(x);
        --x;
        System.out.println(x);

        // TODO FARKLI BİR İŞLEM İÇERİSİNDE KULLANILIRSA (++ prefix ve postfix ++ kullanımı nda sonuç değişir)

        int X = 5;
        int Y = 3;

        int Z = X++ + Y;       // TODO işte burada sonuç 1 artmaz.  Direk 8 çıkar. X toplama esnasında artmıyor. Ama
        // TODO bir sonraki aşamada ALT SATIRDA artıyor.
        System.out.println("Z = " + Z);  // Z = 8
        System.out.println("Y = " + Y);  // Y = 3
        System.out.println("X = " + X);  // X = 6

        X = 5;
        Y = 3;

        Z = ++X + Y;       // TODO işte burada sonuç 1 artar.  Z Direk 9 çıkar. Çünkü ÖN EK DİREK İŞLEME ALINIR.
        System.out.println("Z = " + Z); // Z = 9
        System.out.println("Y = " + Y); // Y = 3
        System.out.println("X = " + X); // X = 6

        // todo x++ önce işlem yapılır(Dört işlem). Sonra alt satırda x in değeri bir artırılır
        // todo ++x önce artırılır ve artmış haliyle işlem yapılır.

        x = 5;
        int y = 0;
        int z = ++x + y--;

        System.out.println("z=" + z); // z=-1
        System.out.println("x=" + x); // x=6
        System.out.println("y=" + y); // y=-8

        double agirlik = 50.5;
        double result = agirlik / 0; // todo infinity yazar.
        double sonuc = agirlik / 2;  // todo 25.25 çıkar.

        System.out.println(result);
        System.out.println(sonuc);

        // todo AYNI DEĞİŞKENİN değerini istediğimiz kadar artırıp azaltabiliriz.
        y = 3;
        y = y - 10;        // TODO  y -=10 şeklindede yazılır
        System.out.println(y);

        x = 7;
        System.out.println(x);
        x = x * 5;
        System.out.println(x); // todo x in yeni değeri 35 oldu.

        x = x / 8;
        System.out.println(x);  // todo 4 çıkar.

        double xl = 35;
        xl = xl / (double) 8;
        System.out.println(xl); // todo 4.375 çıkar.
    }
}

