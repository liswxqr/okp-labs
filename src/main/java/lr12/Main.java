package lr12;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Film> films = new HashMap<>();

        films.put("Крепкий орешек", new Action("Крепкий орешек", 1, 132, 25));
        films.put("Форсаж", new Action("Форсаж", 2, 106, 40));
        films.put("Терминатор", new Action("Терминатор", 3, 107, 18));

        films.put("Маска", new Comedy("Маска", 4, 101, 9));
        films.put("Один дома", new Comedy("Один дома", 5, 103, 8));
        films.put("Такси", new Comedy("Такси", 6, 86, 7));

        films.put("Титаник", new Drama("Титаник", 7, 194, 11));
        films.put("Зеленая миля", new Drama("Зеленая миля", 8, 189, 4));

        for (Map.Entry<String, Film> entry : films.entrySet()) {
            System.out.println("--------------------");
            System.out.println("Ключ: " + entry.getKey());
            entry.getValue().displayInfo();
        }
    }
}
