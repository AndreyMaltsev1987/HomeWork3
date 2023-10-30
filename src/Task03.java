import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание 3 ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите животное: ");
        System.out.println("1.Кошка");
        System.out.println("2.Собака");
        System.out.println("3.Корова");
        System.out.println("4.Коза");
        System.out.println("5.Овца");
        System.out.println("6.Свинья");
        System.out.println("7.Мышь");
        System.out.println("8.Сова");
        System.out.println("9.Воробей");
        System.out.println("10.Осел");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Мяу");
                break;
            case 2:
                System.out.println("Гав");
                break;
            case 3:
                System.out.println("Муу");
                break;
            case 4:
                System.out.println("Меее");
                break;
            case 5:
                System.out.println("Бее");
                break;
            case 6:
                System.out.println("Вииии");
                break;
            case 7:
                System.out.println("Пи-пи");
                break;
            case 8:
                System.out.println("Угу");
                break;
            case 9:
                System.out.println("Чик-чирик");
                break;
            case 10:
                System.out.println("Иа");
                break;
            default:
                System.out.println("Введите номер от 1 до 10");

        }
    }
}
