package Bolum_2_Variables_and_DataTypes;

/**
 * Escape Yani Kaçış Karakterleri anlatılacak    \"    \"
 */
public class Escape_Kacis_Karakteri_4 {
    public static void main(String[] args) {
        String mesaj = "Kişi, Benim adım Ahmet dedi.";
        System.out.println(mesaj);   //Bunu Normal yazabilir

        //String mesaj = "Kişi, "Benim adım Ahmet" dedi."; --->Ama  çift tırnak içinde çift tırnak kullanılamıyor. Onun İçin
        String message = "Kişi, \"Benim adım Ahmet\" dedi.";  //----> \"          \"  bu kaçış işaretlerini kullanıyoruz.
        System.out.println(message);

        mesaj = "Adım Bilal.\n Selam"; //  \n bir alt satıra imleci indirir enter gibi
        System.out.println(mesaj);

        mesaj = "Adım \rBilal.Selam";  //  \r Bilal .selam basar. \r yerleştirdiğin yerden sağ tarafını basar
        System.out.println(mesaj);

        mesaj = "Adım Bilal\t .Selam";     // \t  bir tab miktarı sağa kaydırır.  Adım Bilal	 .Selam basar!
        System.out.println(mesaj);

        message = "Kişi, 'Benim adım Ahmet' dedi."; // bunu tekli tırnağı normal basar.
        System.out.println(message);
    }
}
