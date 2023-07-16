
//Задача билета №3
//Напишите программу, которая разделяет любую строку на две части ровно пополам
// по количеству символов.
public class Main {
    public static void separator (String str) {
        int middle = str.length() / 2;
        String first = str.substring(0, middle);
        String second = str.substring(middle);
        System.out.println(first);
        System.out.println(second);
    }

    public static void main(String[] args) {
        separator("Тестовая строка");
        System.out.println();
        separator("Тестовая строка2");

    }
}