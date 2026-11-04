package lr10;

public class Main {
    public static void main(String[] args) {

        ResidentialBuilding[] houses = {
                new ResidentialBuilding("ул. Ленина, 10", 9, 36),
                new ResidentialBuilding("ул. Советская, 5", 5, 20),
                new ResidentialBuilding("пр. Победы, 77", 12, 48)
        };

        OfficeBuilding[] offices = {
                new OfficeBuilding("ул. Центральная, 1", 7, 15),
                new OfficeBuilding("пр. Мира, 3", 4, 8)
        };

        for (ResidentialBuilding house : houses) {
            System.out.println("--------------------");
            house.displayInfo();
            house.build();
            house.live();
            System.out.println("Вместимость: " + house.getCapacity());
        }

        for (OfficeBuilding office : offices) {
            System.out.println("--------------------");
            office.displayInfo();
            office.build();
            office.live();
            System.out.println("Вместимость: " + office.getCapacity());
        }
    }
}
