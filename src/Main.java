public class Main {
    public static void main(String[] args) {

        int oldBalance = 1000; // баланс до пополнения
        int Payment = 1000; // сумма пополнения
        int newBalance; // баланс после пополнения
        int Bonus_rub; // бонусные рубли
        Bonus_rub = Payment / 100; // Расчет бонуса к зачислению
        if (Payment == 0) {
            System.out.println("Пополнение на ноль невозможно");
        }
        if (Payment < 1000)  // условие начисления бонуса
        {
            newBalance = oldBalance + Payment;
            System.out.println("Пополнение счета на: " + Payment + "р. Сумма вашего счета составляет: " + newBalance + "р.");
        } else {
            newBalance = oldBalance + Payment + Bonus_rub;
            System.out.println("Пополнение счета на: " + Payment + "р. Сумма вашего счета составляет: " + newBalance + "р. Вам начислено: " + Bonus_rub + "р. бонусом.");
        }
    }
}