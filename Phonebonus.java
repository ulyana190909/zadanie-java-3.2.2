public class Phonebonus {
    public static void main(String[] args) {
        long AccountBalance = 300;
        long RefillAccount = 1200;
        long TotalAccount = AccountBalance + RefillAccount;
        long Limit = 1000;
        double Bonus;
        if (TotalAccount >= Limit) {
            Bonus = 0.01;
        } else {
            Bonus = 0.00;
        }
        double TotalBonus = TotalAccount * Bonus;
        System.out.println(TotalBonus);

    }
}