public class Main {
    public static void main(String[] args) {

        int oldBalance = 10; // баланс до пополнения
        int Payment = 2000; // сумма пополнения
        int newBalance; // баланс после пополнения
        int Bonus_rub; // бонусные рубли
        Bonus_rub = Payment / 100; // Расчет бонуса к зачислению
        if (Payment < 1000)  // условие начисления бонуса
        {
            newBalance = oldBalance + Payment;
            System.out.println("Пополнение счета на: " + Payment + "р. Сумма вашего счета составляет: " + newBalance);
        } else {
            newBalance = oldBalance + Payment + Bonus_rub;
            System.out.println("Пополнение счета на: " + Payment + "р. Сумма вашего счета составляет: " + newBalance + "р. Вам начислено: " + Bonus_rub + "р. бонусом.");
        }
    }
}