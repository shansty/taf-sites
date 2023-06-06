package by.itacademy.anastasiyashirochina.taf.sites.utils;

import com.github.javafaker.Faker;

public class Util {
        Faker faker;
        public String  generateEmail() {
            faker = new Faker();
            String email = faker.internet().emailAddress();
            return email;
        }
        public String generatePasswordOrIncorrectEmail() {
            faker = new Faker();
            String email = faker.internet().password();
            return email;
        }
}
