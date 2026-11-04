package lr13;

public class Hotel {
    private String name;
    private String city;
    private int stars;
    private int rooms;
    private int availableRooms;

    public Hotel(String name, String city, int stars, int rooms) throws InvalidHotelDataException {
        if (stars < 1 || stars > 5) {
            throw new InvalidHotelDataException("Неверное количество звезд: " + stars);
        }
        if (rooms <= 0) {
            throw new InvalidHotelDataException("Неверное количество комнат: " + rooms);
        }
        this.name = name;
        this.city = city;
        this.stars = stars;
        this.rooms = rooms;
        this.availableRooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void bookRoom() throws RoomNotAvailableException {
        if (availableRooms == 0) {
            throw new RoomNotAvailableException("Свободных комнат нет в отеле " + name);
        }
        availableRooms--;
        System.out.println("Комната забронирована, свободно: " + availableRooms);
    }

    public void checkOut() throws RoomNotAvailableException {
        if (availableRooms == rooms) {
            throw new RoomNotAvailableException("Выселять некого в отеле " + name);
        }
        availableRooms++;
        System.out.println("Выселение выполнено, свободно: " + availableRooms);
    }

    public void displayInfo() {
        System.out.println("Отель: " + name);
        System.out.println("Город: " + city);
        System.out.println("Звезд: " + stars);
        System.out.println("Комнат: " + rooms + ", свободно: " + availableRooms);
    }
}
