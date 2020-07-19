public class PhoneBonus {
    public static void main(String[] args) {
        long accountBalance = 300;
        long refillAccount = 2100;
        int limit = 1000;
        int bonus;
        if (refillAccount >= limit) {
            bonus = 1;
        } else {
            bonus = 0;
        }
        long totalBonus = refillAccount * bonus / 100;
        System.out.println(totalBonus);

    }
}