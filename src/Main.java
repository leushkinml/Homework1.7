import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();


        /*String phone = "960-415 50+60";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");

        if (phone.length() == 10) {
         //   phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        }
        System.out.println("phone = " + phone);

        String expectedPhon = "79604155060";
        if (phone.equals(expectedPhon)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        System.out.println("Hello world!");*/
    }

    public static void task1() {
        String firstNam = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstNam + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println(fullName.toUpperCase());
    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        String fullEName = fullName.replace('ё', 'е');
        String fullEeName = fullEName.replace('Ё', 'Е');

        System.out.println("Данные ФИО сотрудника — " + fullEeName);
    }
}

