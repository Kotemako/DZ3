public class Main {
    public static void main(String[] args) {
        int threshold = 1000;
        int refill;
        refill = 1700;
        int balance;
        balance = 300;

        int bonus;
        if(refill > threshold) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        int totalBalance;
        totalBalance = balance + refill + bonus;

        System.out.println(totalBalance);
        System.out.println(bonus);
    }
}