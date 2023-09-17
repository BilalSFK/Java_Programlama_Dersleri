package Bolum_2_Variables_and_DataTypes;

public class StatementVeExpression_Kavramları_6 {
    public static void main(String[] args) {
        int x,y,z; // burda x,y,z 'yi bildirdik-DEKLARE ettik
        //System.out.println(x);  --> Burda yazdırmak istedik ama yazmaz çünkü initialize etmedik

        x =1; // Şimdi Initialize ettik
        System.out.println(x);  // artık 1 bastı

        //STATEMENT(satırın başından ; dahil kısma kadar olan kısım) ve EXPRESSION(açıklama,ifade)
        y=4;         // y=4; bunun tamamına STATEMENT diyoruz.         = operatörünün sağına ise 4' e EXPRESSION diyoruz.
        System.out.println(x+y);  // System.out.println(x+y); bunun tamamına STATEMENT diyoruz.     x+y 'ye  EXPRESSION diyoruz.
    }
}
