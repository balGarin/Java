import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        System.out.println("Добро пожаловать в Step Tracker!!!");
        int command = -1;
        while (command != 0) {
            printMenu();
            command = scanner.nextInt();
            switch (command) {
                case 1:
                    stepTracker.addNewNumberStepsPerDay();
                    break;
                case 2:
                    stepTracker.changeStepGoal();
                    break;
                case 3:
                    stepTracker.printStatistic();
                    break;
                case 0:
                    System.out.println("До встречи!!");
                    break;
                default:
                    System.out.println("Такой команды пока еще нет...\n");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Выберите действия : ");
        System.out.println("1 - Ввести количество шагов за определенный день.");
        System.out.println("2 - Изменить цель по колличеству шагов в день.");
        System.out.println("3 - Напечатать статистику за определеннный месяц.");
        System.out.println("0 - Выйти из приложения.");
    }
}