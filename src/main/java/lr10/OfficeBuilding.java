package lr10;

public class OfficeBuilding implements Buildable, Habitable {
    private String address;
    private int floors;
    private int companies;

    public OfficeBuilding(String address, int floors, int companies) {
        this.address = address;
        this.floors = floors;
        this.companies = companies;
    }

    @Override
    public void build() {
        System.out.println("Построен офисный центр по адресу " + address);
    }

    @Override
    public int getFloors() {
        return floors;
    }

    @Override
    public void live() {
        System.out.println("В офисах работают сотрудники");
    }

    @Override
    public int getCapacity() {
        return companies * 20;
    }

    public void displayInfo() {
        System.out.println("Адрес: " + address);
        System.out.println("Этажей: " + floors);
        System.out.println("Компаний: " + companies);
    }
}
