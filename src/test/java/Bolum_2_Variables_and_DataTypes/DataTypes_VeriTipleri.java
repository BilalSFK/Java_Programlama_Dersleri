package Bolum_2_Variables_and_DataTypes;

public class DataTypes_VeriTipleri {
    public static void main(String[] args) {

        //PRIMITIVE (İLKEL) VERİ TİPLERİ-->TOPLAM 8 ADET
        //TAMSAYI VERİ TİPLERİ
        int sayi = 128;
        byte sayi1 = 127; //-->128 OLMAZ çünkü byte -128 den 127'e kadar kutu açıyor toplam 256 adet rakama izin veriyor
        short sayi4=10;
        long sayi5=1_000_000_000_000_000_000L;

        //KESİRLİ SAYI TİPLERİ
        double sayi2 = 127.0;
        float sayi3= 124.38f;

        //CHARACTER VERİ TİPİ
        char karakter = '1';
        System.out.println(karakter);

        //MANTIKSAL -LOGİCAL VERİ TİPİ
        boolean dogruMu = false;

        //BYTE'IN MİN VE MAX DEĞERLERİNİ BULMA---ezbere gerek yok değer aralığını böyle bulabiliyoruz
        byte minValue= Byte.MIN_VALUE;
        byte maxValue=Byte.MAX_VALUE;

        System.out.println(minValue);
        System.out.println(maxValue);

        //REFERANS VERİ TİPİ
        String baskent = "Ankara";
        System.out.println("Türkiye'nin başkenti "+baskent +"'dır");

    }
}
