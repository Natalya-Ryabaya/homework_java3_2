public class Main {
    public static void  main(String[] args) {
        int balanceStart  = 100;
        int transfer = 1050;
        int bonus;
        if (transfer >= 1000) {
            bonus = transfer/100;
        } else {
            bonus = 0;
        }
        int balanceEnd = balanceStart + transfer;
        System.out.println(bonus);
        System.out.println(balanceEnd);
    }
}
