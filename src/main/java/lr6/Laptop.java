package lr6;

public class Laptop {
    private String brand;
    private int ram;
    private int storage;
    private double price;

    public Laptop(String brand, int ram, int storage, double price) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount() {
        price = price * 0.9;
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("ASUS", 16, 512, 2000);

        laptop.applyDiscount();

        System.out.println("Ноутбук: " + laptop.getBrand());
        System.out.println("ОЗУ: " + laptop.getRam() + " ГБ");
        System.out.println("Память: " + laptop.getStorage() + " ГБ");
        System.out.println("Цена со скидкой: " + laptop.getPrice());
    }
}