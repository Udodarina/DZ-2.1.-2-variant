public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishmentAmount = 1100;
        int newBalance = balance + replenishmentAmount;

        if (replenishmentAmount > 1000) {

            int bonus = (int) (replenishmentAmount / 100);


            System.out.println("Вам баланс: " + (newBalance + bonus));
        } else {
            System.out.println("Вам баланс: " + newBalance);
        }
    }
}