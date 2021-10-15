package utils.helper;

import com.github.javafaker.Faker;

public class DataHelper {

    public static Faker faker = new Faker();

    public static String getRandomString(int numberOfString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= numberOfString; i++) {
            stringBuilder.append(faker.bothify("?"));
        }
        return stringBuilder.toString();
    }
}
