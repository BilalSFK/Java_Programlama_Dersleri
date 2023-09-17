package Bolum_4_Operators;

public class Operator_Precedence_Oncelikleri_3 {
    public static void main(String[] args) {
        // todo Operatör öncelikleri-Precedence
        int sonuc=5+3*8-7;
        System.out.println(sonuc);  // 22 çıkar önce çarpma-bölme sonra toplama-çıkarma

        int result=(5+3)*(8-7);
        System.out.println(result);

        //todo Assignment Operators: +=, -=, *=, /=, %=

        int x=5;
        x +=1;      // todo x=x+1;   ile   x += 1; aynı  ve x++;   buda aynı
        System.out.println(x);

        x -=7;      // todo       x=x-7;
        System.out.println(x);

        x *=-5;      // todo       x=x*-5;
        System.out.println(x);

        x /=5;        // todo       x=x/5;
        System.out.println(x);

        int m=7;
        m %=5;         //todo     m=m%5;
        System.out.println(m);
    }
}
