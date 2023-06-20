package Bolum_5_ControlFlowStatements;

public class If_Statements_1 {
    public static void main(String[] args) {
        int yas = 28;

        // todo Yetişkin olup olmama durumu:

        if (yas >= 18) {                                // todo TRUE olmayan hiçbir durumda if { blokunun içine giremez.
            System.out.println("Kişi yetişkindir.");
        } else {
            System.out.println("Yetişkin değildir.");
        }

        //Yaşı 70'den büyük, 18'den küçük olma durumu- Bu yaş durumuna göre Sosyal yardım alınmasıyla ilgili
        if (yas < 18 | yas >= 70) {   // todo | veya bu her iki durumuda inceler. yaş 18 yaştan küçük veya 70 yaştan büyük
            System.out.println("Sosyal yardım alabilir.");  // todo en az kod yazmak için | yazdık. Eğer if if else.. kod çok uzardı.
        } else {
            System.out.println("Sosyal yardım alamaz.");
        }

        // todo time-memory complexity -->

        int x = 65; //decimal--onluk sistemdeki değer
        int y = 0b01000001; //01000001--65'in binary karşılığı
        int z = 0x41;    // 65'in hexal karşılığı

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
