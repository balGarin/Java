import java.util.Scanner;

public class Menu {
    private Menu() {
    }

    public static void menuGo() {
        Scanner scanner = new Scanner(System.in);
        Shopping shopping = new Shopping();
        int command = -1;
        while (command != 0) {
            System.out.println("______________________________________________________");
            System.out.println("Введите команду : \n");
            System.out.println("1 - Добавить покупку.");
            System.out.println("2 - Показать список.");
            System.out.println("3 - Очистить список.");
            System.out.println("0 - Завершить работу");
            command = scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.println("Введите название товара (вместо пробелов используйте '_') :");
                    String purchase = "";
                    purchase = scanner.next();
                    shopping.add(purchase);
                    break;
                case 2:
                    shopping.showList();
                    break;
                case 3:
                    shopping.clearList();
                    break;
                case 0:
                    System.out.println("До встречи в следующий раз!");
                    break;
                default:
                    System.out.println("К сожалению такой команды еще нет, попробуйте снова. \n");

            }
        }
    }
}
