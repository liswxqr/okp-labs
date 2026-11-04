package lr13;

import java.util.ArrayList;

public class Main {

    static ArrayList<Hotel> hotels = new ArrayList<>();

    public static Hotel findHotel(String name) throws HotelNotFoundException {
        for (Hotel hotel : hotels) {
            if (hotel.getName().equals(name)) {
                return hotel;
            }
        }
        throw new HotelNotFoundException("Отель не найден: " + name);
    }

    public static void main(String[] args) {

        try {
            hotels.add(new Hotel("Минск", "Минск", 4, 3));
            hotels.add(new Hotel("Беларусь", "Минск", 3, 2));
            hotels.add(new Hotel("Турист", "Брест", 2, 1));
        } catch (InvalidHotelDataException e) {
            System.out.println("Ошибка данных: " + e.getMessage());
        }

        try {
            hotels.add(new Hotel("Космос", "Гомель", 7, 10));
        } catch (InvalidHotelDataException e) {
            System.out.println("Ошибка данных: " + e.getMessage());
        }

        for (Hotel hotel : hotels) {
            System.out.println("--------------------");
            hotel.displayInfo();
        }

        System.out.println("--------------------");

        try {
            Hotel hotel = findHotel("Турист");
            hotel.bookRoom();
            hotel.bookRoom();
        } catch (HotelNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        } catch (RoomNotAvailableException e) {
            System.out.println("Ошибка брони: " + e.getMessage());
        }

        try {
            Hotel hotel = findHotel("Турист");
            hotel.checkOut();
            hotel.checkOut();
        } catch (HotelNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        } catch (RoomNotAvailableException e) {
            System.out.println("Ошибка выселения: " + e.getMessage());
        }

        try {
            findHotel("Прага");
        } catch (HotelNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        }
    }
}
