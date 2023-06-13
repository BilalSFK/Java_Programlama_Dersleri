package Bolum_3_TypeConvertion_TipDonusumleri;

public class TipDonusumleri {
    public static void main(String[] args) {
        // Type conversion - Tip dönüşümleri -->Bir ilkel veri tipinin değeri başka bir tipe atandığında assign olduğunda gerçekleşir.
        // 2Tip var:
        // 1-Widenig conversion-Genişletme Dönüşümleri->Otomatik Gerçekleşiyor
        // 2)Narrowing conversion-Daraltma Dönüşümü--> elle yazılır (byte)(13+5) gibi. Sen gerçekleştiriyorsun java sorumluluk almıyor.
        //double  ->float  -> long  -> int ->char -> short -> byte burda büyük veri tipini küçük veri tipine sokmaya zorluyorsun
        // Veri kaybı olabilir elle girersin sorumluluk herzaman işlemi yapana aittir

        byte yas1 = 28;
        byte yas2 = 35;

        byte toplamYas = (byte) (yas1 + yas2);  // int sağlıyor int bytten büyük olduğu için büyüğü
                                                // küçüğe sokmaya manuel uğraşırız.Narrowing conversition

        System.out.println("Toplam yaş = " + toplamYas);


    }
}
