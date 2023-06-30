package streams;

import java.util.*;
import java.util.stream.*;

import static java.util.List.of;

public class Main_3 {

    static class User {
        private List<Phone> phones;

        public List<Phone> getPhones() {
            return phones;
        }

        public void setPhones(List<Phone> phones) {
            this.phones = phones;
        }
    }

    static class Phone {
        private String number;

        public Phone(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }


    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();


        List<Phone> phones1 = new ArrayList<>();
        phones1.add(new Phone("2222222"));
        phones1.add(new Phone("3333333"));

        List<Phone> phones2 = new ArrayList<>();
        phones2.add(new Phone("1111111"));
        phones2.add(new Phone("5555555"));

        user1.setPhones(phones1);
        user2.setPhones(phones2);

        List<User> users = new ArrayList<>(of(user1, user2));


        // Необходимо проверить есть ли телефон "1111111" в списке у пользователей.

        boolean hasSpecifiedNumber = users.stream()
            .flatMap(el -> el.getPhones().stream())
            .map(Phone::getNumber)
            .anyMatch(el -> el.equals("1111111"));


        System.out.println("hasSpecifiedNumber: " + hasSpecifiedNumber);


    }



}
