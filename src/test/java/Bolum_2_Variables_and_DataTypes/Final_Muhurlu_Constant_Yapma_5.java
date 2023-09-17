package Bolum_2_Variables_and_DataTypes;

public class Final_Muhurlu_Constant_Yapma_5 {
    public static void main(String[] args) {
        int pi= 3;
        pi = 5;
        System.out.println(pi);   //Pi burada değişir

        //final int pi =3;        /Pi artık mühürlendi-constant denir. değişkenin değeri 3 tür ve değiştirilemez.
       // pi=5;
        int x; //--> x'e henüz bir değer atanmadı yani initialize edilmedi.
                   // ilk başta bu şekilde yapılandırmamış initialize etmemiş olabilirim. Ama arkasından gelen komutta bunu initalize etmeliyim mutlaka

        x = 1; //artık initialize ettik.
    }
}
