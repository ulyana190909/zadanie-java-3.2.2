public class Phonebonus {
    public static void main(String[] args) {
        long accountBalance = 300;
        long refillAccount = 2500;
        long totalAccount = accountBalance + refillAccount;
        int limit = 1000;
        int bonus;
        if (totalAccount >= limit) {
            bonus = 1;
        } else {
            bonus = 0;
        }
        long totalBonus = totalAccount * bonus / 100;
        System.out.println(totalBonus);

    }
}