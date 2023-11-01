import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("Задание 7");
        Scanner sc = new Scanner( System.in);
        System.out.println(" Введите символ: ");
        String simvol = sc.nextLine();
        Pattern patLatletter = Pattern.compile("[a-zA-Z]");
        Matcher matLatletter = patLatletter.matcher(simvol);

        Pattern patKirletter = Pattern.compile("[а-яА-Я]");
        Matcher matKirletter = patKirletter.matcher(simvol);

        Pattern patNumber = Pattern.compile("[0-9]");
        Matcher matNumber = patNumber.matcher(simvol);

        if (matLatletter.matches()) {
            System.out.println("Латиница");
        } else if (matKirletter.matches()) {
            System.out.println("Кириллица");
        }else if (matNumber.matches()) {
            System.out.println("Цифра");
        }else {
            System.out.println("Невозможно определить");
        }
    }
}
