package data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {


    public static String generateCity(String locale) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Москва");
        cities.add("Санкт-Петербург");
        cities.add("Майкоп");
        cities.add("Саранск");
        cities.add("Барнаул");
        Random random = new Random();
        int indexCity = random.nextInt(cities.size());
        String city = cities.get(indexCity);
        return city;
    }

    public static String generateName(String locale) {
        Faker faker = new Faker(new Locale(locale));
        String fullName = faker.name().fullName();
        return fullName;
    }

    public static String generatePhone(String locale) {
        Faker faker = new Faker(new Locale(locale));
        String number = faker.phoneNumber().phoneNumber();
        return number;
    }

    public static String chooseDate(int days) {
        LocalDate today = LocalDate.now();
        LocalDate meetingDay = today.plusDays(days);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String textDate = meetingDay.format(formatter);
        return textDate;

    }

}
