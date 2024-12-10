public class Product {
    private int quantity; // Количество товаров
    private double price; // Цена товара
    private double discount; // Скидка на товар в процентах

    public Product(int q, double p, double d) {
        this.quantity = q;
        this.price = p;
        this.discount = d;
    }

    public void priceCalculation() {
        double priceWithoutDiscont = quantity * price; // Общая цена без скидки
        double priceWithDiscont = priceWithoutDiscont * (1 - discount / 100); // Общая цена со скидкой

        priceWithoutDiscont = Math.round(priceWithoutDiscont * 100.0) / 100.0; // Округлениe до 2 знаков
        priceWithDiscont = Math.round(priceWithDiscont * 100.0) / 100.0; // Округлениe до 2 знаков

        System.out.println("Общая сумма без скидки: " + priceWithoutDiscont);
        System.out.println("Общая сумма со скидкой: " + priceWithDiscont);
    }
}
