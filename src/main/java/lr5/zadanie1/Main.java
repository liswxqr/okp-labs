package lr5.zadanie1;

public class Main {

    static class Product {
        String name;
        double price;
        int quantity;

        Product(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        double totalCost() {
            return price * quantity;
        }
    }

    public static void main(String[] args) {
        Product product = new Product("Телефон", 500, 3);
        System.out.println("Общая стоимость: " + product.totalCost());
    }
}