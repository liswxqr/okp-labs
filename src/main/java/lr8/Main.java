package lr8;

public class Main {
    public static void main(String[] args) {
        Food[] foods = {
                new Pizza("Пицца", 800, 20, "Сыр"),
                new Pizza("Пепперони", 900, 25, "Колбаса"),
                new Pizza("Маргарита", 700, 15, "Помидоры"),
                new Salad("Цезарь", 300, 10, "Соус Цезарь"),
                new Salad("Овощной", 150, 5, "Масло")
        };

        for (Food food : foods) {
            food.displayInfo();
            food.cook();

            if (food instanceof Pizza) {
                ((Pizza) food).addTopping();
            }

            if (food instanceof Salad) {
                ((Salad) food).addDressing();
            }

            System.out.println();
        }
    }
}