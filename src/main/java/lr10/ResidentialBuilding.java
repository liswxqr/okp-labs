package lr10;

public class ResidentialBuilding implements Buildable, Habitable {
    private String address;
    private int floors;
    private int apartments;

    public ResidentialBuilding(String address, int floors, int apartments) {
        this.address = address;
        this.floors = floors;
        this.apartments = apartments;
    }

    @Override
    public void build() {
        System.out.println("Построен жилой дом по адресу " + address);
    }

    @Override
    public int getFloors() {
        return floors;
    }

    @Override
    public void live() {
        System.out.println("В доме живут жильцы");
    }

    @Override
    public int getCapacity() {
        return apartments * 3;
    }

    public void displayInfo() {
        System.out.println("Адрес: " + address);
        System.out.println("Этажей: " + floors);
        System.out.println("Квартир: " + apartments);
    }
}
