package homework14;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

@Test
public class TestRunner {
    public static void main(String[] args) {


        Faker faker = new Faker();

        String country = faker.country().name();
        String city = faker.address().city();
        String street = faker.address().streetName();
        String phone = faker.phoneNumber().phoneNumber();

        System.out.println(country  + "\n" + city + "\n" + street + "\n" + phone);
    }
}