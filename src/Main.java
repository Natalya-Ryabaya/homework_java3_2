public class Main {
    public static void  main(String[] args) {
        float balance_start  = 100;
        float transfer = 1050;
        int bonus;
        if (transfer >= 1000) {
            bonus = (int) (transfer/100);
        } else {
            bonus = 0;
        }
        float balance_end = balance_start + transfer;
        System.out.println(bonus);
        System.out.println(balance_end);
    }
}
