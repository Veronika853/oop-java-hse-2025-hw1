/**
 * Класс Coffee
 * <p>
 * Поля (примерная идея):
 * - private String name;       // Название кофе
 * - private double basePrice;  // Базовая цена
 * <p>
 * Геттеры/сеттеры:
 * - getName(), setName(...)
 * - getBasePrice(), setBasePrice(...)
 * <p>
 * Методы (примерные идеи):
 * - calculatePriceWithSugar(Sugar sugar): double
 * (может возвращать basePrice + некая надбавка за сахар, или просто basePrice, если надбавки нет)
 * <p>
 * - toString() (не обязательно, но может упростить вывод информации)
 */
public class Coffee {


    // Напишите код здесь (объявление полей)
    private String name;
    private double basePrice;


    // Напишите код здесь (конструктор/конструкторы)
    public Coffee(double basePrice, String name) {
        this.name = name;
        this.basePrice = basePrice;

    }

    // Напишите код здесь (геттеры/сеттеры)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double calculatePriceWithSugar(Sugar sugar) {
        //     // Напишите код здесь:
        return basePrice + sugar.getSugarPrice();
    }

    public String toString() {
        //     // Напишите код здесь (опционально)
        return String.format("%s (Цена: %.2f руб.)", name, basePrice);
    }
}
