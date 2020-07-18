public class Phonebonus {
    public static void main(String[] args) {
        boolean accountreplenishment = true;
        int bonus;
        if (accountreplenishment) {
            bonus = 1;
        } else {
            bonus = 0;
        }
        float pay = 1700;
        float totalbonus = pay * bonus / 100;
        long limit = 1000;
        if (pay > limit) ;
        {
            pay = limit;
        }
        System.out.println(totalbonus);
    }
}