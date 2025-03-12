/**
 * Класс CoffeeOrder
 * <p>
 * В этом классе у вас должен быть метод main:
 * 1. Создание объекта Scanner для ввода пользователя.
 * 2. Логика меню (switch или if-else) для выбора кофе и сахара.
 * 3. Создание объекта Coffee и объекта Sugar, исходя из выбора пользователя.
 * 4. Вызов методов (например, coffee.calculatePriceWithSugar(sugar)).
 * 5. Вывод информации о заказе (название кофе, уровень сахара, итоговая цена).
 * 6. (Опционально) повтор решения в цикле до выхода из программы.
 */

import java.util.Scanner;

public class CoffeeOrder {

    public static void main(String[] args) {
        // Напишите вашу логику здесь:
        // 1) Создать Scanner;
        Scanner scanner = new Scanner(System.in);
        // 2) Спросить пользователя, какой кофе (название, цена) или номер опции;

        // 3) Спросить пользователя, какой сахар (номер опции, уровень, цена);
        // 4) Создать объекты Coffee и Sugar (конструкторы, сеттеры);
        Coffee[] coffees = {
                new Coffee(80.5, "Руссиано"),
                new Coffee(100, "Эспрессо"),
                new Coffee(150, "Капучино"),
                new Coffee(180, "Латте")
        };

        Sugar[] sugars = {
                new Sugar("Без"),
                new Sugar("1 чайная ложка"),
                new Sugar("2 чайные ложки"),
                new Sugar("3 чайные ложки")
        };
        // 5) Вычислить общую стоимость и вывести результат;
        // 6) (Опционально) продолжать спрашивать, пока пользователь не решит завершить.
        while (true) {
            System.out.println("Выберите кофе:");
            for (int i = 0; i < coffees.length; i++) {
                System.out.printf("%d) %s\n", i + 1, coffees[i]);
            }
            System.out.print("Введите номер опции для кофе: ");
            int coffeeChoice = scanner.nextInt() - 1;
            if (coffeeChoice < 0 || coffeeChoice >= coffees.length) {
                System.out.println("Некорректный выбор, попробуйте снова.");
                continue;
            }

            System.out.println("Выберите сахар:");
            for (int i = 0; i < sugars.length; i++) {
                System.out.printf("%d) %s\n", i + 1, sugars[i].getSugarDescription());
            }
            System.out.print("Введите номер опции для сахара: ");
            int sugarChoice = scanner.nextInt() - 1;
            if (sugarChoice < 0 || sugarChoice >= sugars.length) {
                System.out.println("Некорректный выбор, попробуйте снова.");
                continue;
            }

            double totalPrice = coffees[coffeeChoice].getBasePrice() + sugars[sugarChoice].getSugarPrice();
            System.out.printf("Вы заказали %s, %s сахара. Итоговая стоимость: %.2f ₽\n",
                    coffees[coffeeChoice],
                    sugars[sugarChoice].getSugarLevel().toLowerCase(), totalPrice);

            String response;
            scanner.nextLine();

            do {
                System.out.print("Хотите заказать ещё? (Да/Выход): ");
                response = scanner.nextLine().trim().toLowerCase();

                if (response.equals("выход")) {
                    System.out.println("Спасибо за заказ!");
                    scanner.close();
                    return;
                } else if (!response.equals("да")) {
                    System.out.println("Некорректный ввод. Введите 'Да' или 'Выход'.");
                }
            } while (!response.equals("да"));
        }
    }
}
