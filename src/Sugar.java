/**
 * Класс Sugar
 * <p>
 * Поля (примерная идея):
 * - private String sugarLevel; // Например: "Без сахара", "Мало сахара", "Много сахара"
 * - private double sugarPrice; // надбавка к цене (может быть 0 для "Без сахара", 10.0 для "Много" и т.д.)
 * <p>
 * Геттеры/сеттеры:
 * - getSugarLevel(), setSugarLevel(...)
 * - getSugarPrice(), setSugarPrice(...)
 * <p>
 * Методы (примерные идеи):
 * - getSugarDescription(): String
 * (может возвращать что-то вроде: "Добавлен сахар: <уровень>")
 */
public class Sugar {

    // Напишите код здесь (объявление полей)
    private String sugarLevel;
    private double sugarPrice;

    // Напишите код здесь (конструкторы)
    public Sugar(String sugarLevel) {
        this.setSugarLevel(sugarLevel);

    }


    // Напишите код здесь (геттеры/сеттеры)
    public String getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(String sugarLevel) {
        this.sugarLevel = sugarLevel;

        switch (sugarLevel) {
            case "Без сахара":
                this.sugarPrice = 0;
                break;
            case "1 чайная ложка сахара":
                this.sugarPrice = 5;
                break;
            case "2 чайные ложки сахара":
                this.sugarPrice = 10;
                break;
            case "3 чайные ложки сахара":
                this.sugarPrice = 15;
                break;
            default:
                throw new IllegalArgumentException("Неверно выбран уровень сахара: " + sugarLevel);
        }
    }

    public double getSugarPrice() {
        return sugarPrice;
    }

    public void setSugarPrice(double sugarPrice) {
        this.sugarPrice = sugarPrice;
    }


    public String getSugarDescription() {
//     // Напишите код здесь, возвращая текстовое описание уровня сахара
//     // Например: return "Уровень сахара: " + sugarLevel;
        return "Уровень сахара: " + getSugarLevel() +
                " (надбавка к цене: " + getSugarPrice() + " руб.)";
    }
}
