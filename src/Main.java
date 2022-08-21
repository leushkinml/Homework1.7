import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task41();
        task42();
        task51();
        task52();
        task6();
        task7();


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
        // Задача 4. Первый вариант
    public static void task41() {
        String fullName = "Ivanov Ivan Ivanovich";
        int index1 = fullName.indexOf(' '); // 6
        int index2 = fullName.lastIndexOf(' '); //11

        String firstMiddleName = fullName.substring(index1 + 1); //Ivan Ivanovich
        int index3 = firstMiddleName.indexOf(' '); //4
        String firstName = firstMiddleName.substring(0,index3); //Ivan
        String middleName = fullName.substring(index2 + 1); //Ivanovich
        String lastName = fullName.substring(0,index1); //Ivanov

        /*System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);*/

        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
    }
        // Задача 4. Второй вариант
    public static void task42() {
        String fullName = "Ivanov Ivan Ivanovich";
        String[] names = fullName.split(" ");

        System.out.println("Имя сотрудника — " + names[1]);
        System.out.println("Фамилия сотрудника — " + names[0]);
        System.out.println("Отчество сотрудника — " + names[2]);
    }

        // Задача 5. Первый вариант
    public static void task51() {
        String fullName = "ivanov ivan ivanovich";
        String[] names = fullName.split(" ");
        String firstName = names[1]; //ivan
        String middleName = names[2]; //ivanovich
        String lastName = names[0]; //ivanov

        String firstNameUp = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1).toLowerCase(); //Ivan
        String middleNameUp = Character.toUpperCase(middleName.charAt(0)) + middleName.substring(1).toLowerCase(); //Ivanovich
        String lastNameUp = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1).toLowerCase(); //Ivanov

        String fullNameUp = lastNameUp + " " + firstNameUp + " " + middleNameUp;

        System.out.println(fullNameUp);

    }

    // Задача 5. Второй вариант
    public static void task52() {
        String fullName = "ivanov ivan ivanovich";
        String[] names = fullName.split(" ");
        String firstName = names[1]; //ivan
        String middleName = names[2]; //ivanovich
        String lastName = names[0]; //ivanov

        StringBuilder sbFirstName = new StringBuilder(firstName.toLowerCase());
        sbFirstName.setCharAt(0, Character.toUpperCase(sbFirstName.charAt(0)));
        String firstNameUp = sbFirstName.toString();

        StringBuilder sbMiddleName = new StringBuilder(middleName.toLowerCase());
        sbMiddleName.setCharAt(0, Character.toUpperCase(sbMiddleName.charAt(0)));
        String middleNameUp = sbMiddleName.toString();

        StringBuilder sbLastName = new StringBuilder(lastName.toLowerCase());
        sbLastName.setCharAt(0, Character.toUpperCase(sbLastName.charAt(0)));
        String lastNameUp = sbLastName.toString();

        String fullNameUp = lastNameUp + " " + firstNameUp + " " + middleNameUp;

        System.out.println(fullNameUp);
    }

    public static void task6() {

        String firstString = "135";
        String secondString = "246";

        String[] numbers = secondString.split("");

        StringBuilder therdString = new StringBuilder(firstString);

        therdString.insert(1,numbers[0]);
        therdString.insert(3, numbers[1]);
        therdString.insert(5, numbers[2]);

        System.out.println(therdString.toString()); //123456

    }

    public static void task7() {
        String doubleLatter = "aabccddefgghiijjkk";
        StringBuilder shortString = new StringBuilder();
        for (int i = 0; i < doubleLatter.length() - 1; i++) {
            if (doubleLatter.charAt(i) == doubleLatter.charAt(i+1)) {
                shortString.append(doubleLatter.charAt(i));
            }
        }
        System.out.println(shortString.toString()); //acdgijk
    }
}

