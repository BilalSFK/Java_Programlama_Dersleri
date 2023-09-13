package Bolum_2_Variables_and_DataTypes;

public class DikdörtgeninAlaniniBulma_2 {
    public static void main(String[] args) {
        /**
         * Bir Dikdörtgenin uzun ve kısa kenarı verildiğinde bu dikdörtgenin alanı nedir?
         */

        int uzunKenar= 20;
        int kisaKenar= 10;

        System.out.println(uzunKenar*kisaKenar);

        int uzun_Kenar= 20, kisa_Kenar= 10; //değişkeni böylede tanımlayabiliriz ama genelde yukarıdaki gibi tanımlanır
        int alan=uzun_Kenar*kisa_Kenar; // --> Böylede yazabilirim. Kullanıcının anlayacağı şekle getirebiliriz
        System.out.println("Dikdörtgenin alanı " +alan + " santimetre karedir");


    }
}
