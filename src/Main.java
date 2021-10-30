public class Main {
    public static void main(String[] args) {
        int balanceNow = 200;
        int depositAmount = 1300;

        int bonus;
        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }



        int balanceNew = balanceNow + depositAmount + bonus;
        System.out.println("Сумма пополнения : " + depositAmount);
        System.out.println("Бонус : " + bonus);
        System.out.println("Новый баланс : " + balanceNew);
    }
}
