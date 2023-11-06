import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Задание 10");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер квартиры");
        int noumber = sc.nextInt();
        var podezd = (noumber + 35) / 36;
        noumber -= (podezd - 1) * 36;
        var etag = (noumber + 3) / 4;
        System.out.println("podezd " + podezd);
        System.out.println("etag " + etag);
    }
}
