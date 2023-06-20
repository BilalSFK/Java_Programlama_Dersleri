package Bolum_5_ControlFlowStatements;

public class Switch_Statements_3 {
    public static void main(String[] args) {

        int dayNumber = 2;  // todo aşağıda hangi sayı ile eşleşiyorsa o case'i çalıştırır.
        switch (dayNumber) {
            case 1:
                System.out.println("Pazartesi");
                break;           // todo break olduğu için int dayNumber = 1 yazdığımızda Pazartesi'yi basar ve kapatır.
            case 2:
                System.out.println("Salı");
                // todo Dikkat break; yok
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;

            default:        // todo yukarıdaki case(durumların) hiçbirisiyle eşleşmiyorsa defaultu çalıştırır.
                System.out.println("Yanlış bir sayı girildi.");
                break;                             // todo altta başka bir case olmadığı için break koymasak da sorun olmaz.
        }
    }
}
// todo NOT: int dayNumber = 2 yazdığımızda break olmadan çalıştırdığımızda yukarıdan aşağıya sırayla gider
// todo ve önce Pazartesi'yle eşleşmez ve case 2: ile eşleşir ve Salı basar ama burada break olmadığı için
// todo case 3: e geçer Çarşambayı'da basar ve Case 3:'ün break'inde kalır. Salı ve Çarşambayı basmış olur.
// todo NOT: int dayNumber = 1 yazdık case:1 case 2: Case 3: Case 4: Case 5:  bunlarda break yok. case:6 da break var.
// todo  Pazartesi Salı Çarşamba Perşembe Cuma Cumartesi yazar ve breakde durur.
// todo NOT: int dayNumber = 2 yazdık case:1 eşleşmediği için es geçer, case 2: Case 3: Case 4: Case 5:  bunlarda break
//  yok. case:6 da break var.
// todo  Salı Çarşamba Perşembe Cuma Cumartesi yazar ve breakde durur. Hep ilk baştan başlar match'ini arar. Bulursa
//  işleme girer, break arar varsa orada kalır bulamazsa break bulana kadar tüm işlemleri ayrı ayrı yapar.




