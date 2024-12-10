//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Создаем три объекта Product с разными параметрами
        Product product1 = new Product(9, 40.0, 0.75); // 0.75% скидка
        Product product2 = new Product(14, 123.0, 42.575); // 42.575% скидка
        Product product3 = new Product(3, 200.0, 59.1); // 59.1% скидка

        // Вызываем метод priceCalculation для каждого продукта
        product1.priceCalculation();
        product2.priceCalculation();
        product3.priceCalculation();
    }
}
