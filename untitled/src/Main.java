import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N=");
        int N = in.nextInt();
        switch (N) {
            case 1:
                System.out.println("Пн");
                break;
            case 2:
                System.out.println("Вт");
                break;
            case 3:
                System.out.println("Ср");
                break;
            case 4:
                System.out.println("Чт");
                break;
            case 5:
                System.out.println("Пт");
                break;
            case 6:
                System.out.println("Сб");
                break;
            case 7:
                System.out.println("Вс");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}