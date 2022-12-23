public class Main {
    public static void main(String[] args) {

        int oldBalance = 1000; // баланс до пополнения
        int payment = 1000; // сумма пополнения
        int newBalance; // баланс после пополнения
        int bonusRub; // бонусные рубли
        bonusRub = payment / 100; // Расчет бонуса к зачислению
        if (payment == 0) {
            System.out.println("Пополнение на ноль невозможно");
        }
        if (payment < 1000)  // условие начисления бонуса
        {
            newBalance = oldBalance + payment;
            System.out.println("Пополнение счета на: " + payment + "р. Сумма вашего счета составляет: " + newBalance + "р.");
        } else {
            newBalance = oldBalance + payment + bonusRub;
            System.out.println("Пополнение счета на: " + payment + "р. Сумма вашего счета составляет: " + newBalance + "р. Вам начислено: " + bonusRub + "р. бонусом.");
        }
    }
}
