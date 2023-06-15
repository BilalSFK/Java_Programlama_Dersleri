package Bolum_4_Operators;

public class Operators_Mantıksal_Logical_Operatorler_d {
    public static void main(String[] args) {
        // todo MANTIKSAL OPERATÖRLER
        //  &,|, !,  --> Her iki durumuda ayrı ayrı inceler, kısa kesme olmaz.
        //  &&, || --> short cut and, short cut or
        //  && ilk kısım false ise kısa keser diğer duruma bakmaz. Çünkü Aradığı TRUE TRUE
        //  || ilk kısım true ise kısa keser diğer duruma bakmaz. Çünkü Aradığı FALSE FALSE
        //  .
        //  Ãmpersan    :   “ve”        shift + 6 -->  ‘&’ bu işaret
        //  Pipe        :   “veya”         sağ alt + küçüktür büyüktür işareti-->   | bu işaret
        //  Ünlem       :    "değil"       shit + 1    !--> Doğruyu yanlışa yanışı doğruya çevirir. (!beyaz) beyaz değil demek

        boolean b1 = false & false;          // todo False
        boolean b2 = false & true;           // todo False
        boolean b3 = true & false;           // todo False
        boolean b4 = true & true;            // todo True    -->Her ikisinin de TRUE olmadığı her durum FALSE'dur(& operatöründe)


        boolean b5 = false | false;           // todo False -->Her ikisinin de FALSE olmadığı her durum TRUE'dur(& operatöründe)
        boolean b6 = false | true;            // todo True
        boolean b7 = true | false;            // todo True
        boolean b8 = true | true;             // todo True

        boolean b9 = !(true & false);         // todo parantez içi FALSE çıkar. !(FALSE)-->FALSE DEĞİL demek-->TRUE çıkar
        boolean b10 = !(true | false);        // todo parantez içi TRUE çıkar. !(TRUE)-->TRUE DEĞİL demek-->FALSE çıkar


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.println();

        System.out.println(b5);
        System.out.println(b6);
        System.out.println(b7);
        System.out.println(b8);

        System.out.println();

        System.out.println(b9);
        System.out.println(b10);

    }
}

