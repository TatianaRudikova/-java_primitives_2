public class Main {
    public static void main(String[] args) {
        int account = 100;
        int translation = 1100;
        int bonus = 0;

        if (translation > 1000) {
            bonus = translation / 100;
        }

        int amount = account + translation + bonus;

        System.out.println("Кол-во бонусных рублей " + bonus);
        System.out.println("Итоговая сумма по счету клиента " + amount);
    }
}