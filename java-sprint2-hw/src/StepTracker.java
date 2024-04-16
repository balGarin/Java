import java.util.Scanner;

public class StepTracker {
    MonthData[] monthToData;
    Scanner scanner;
    int goalByStepsPerDay;

    Converter converter;

    StepTracker(Scanner scanner) {
        converter = new Converter();
        monthToData = new MonthData[12];
        this.scanner = scanner;
        goalByStepsPerDay = 10000;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Выберете месяц, цифрой от 1 до 12.");
        int month = scanner.nextInt();
        if (month > 12 || month <= 0) {
            System.out.println("Введено не корректное значение...\n");
            return;
        }
        System.out.println("Выберете  день, цифрой от 1 до 30.");
        int day = scanner.nextInt();
        if (day > 30 || day <= 0) {
            System.out.println("Введено не корректное значение...\n");
            return;
        }
        System.out.println("Укажите количество шагов за выбранный день.");
        int steps = scanner.nextInt();
        if (steps < 0) {
            System.out.println("Введено не корректное значение...\n");
            return;
        }
        monthToData[month - 1].days[day - 1] = steps;
        System.out.println("Ваши шаги записаны успешно!\n");
    }

    void changeStepGoal() {
        System.out.println("Введите новую цель по шагам за день");
        int goal = scanner.nextInt();
        if (goal <= 0) {
            System.out.println("Цель не может быть отрицательной или нулевой...\n ");
        } else {
            goalByStepsPerDay = goal;
            System.out.println("Новая цель зафиксированна, так держать!!!\n");
        }
    }

    void printStatistic() {
        System.out.println("Введите номер месяца цифрой от 1 до 12.");
        int month = scanner.nextInt();
        if (month > 12 || month <= 0) {
            System.out.println("Введено не корректное значение...\n");
            return;
        }
        int sumSteps = monthToData[month - 1].sumStepsFromMonth();
        System.out.println("Количество пройденных шагов по дням :\n");
        monthToData[month - 1].printDaysAndStepsFromMonth();
        System.out.println();
        System.out.println("Общее количество шагов за месяц : " + sumSteps + "\n");
        System.out.println("Максимальное пройденное количество шагов в месяце :" + monthToData[month - 1].maxSteps()
                + "\n");
        System.out.println("Среднее количество шагов : " + monthToData[month - 1].averageNumbersOfSteps() + "\n");
        System.out.println("Пройденная дистанция в киллометрах : " + converter.convertToKm(sumSteps) + "\n");
        System.out.println("Количество сожженных килокалорий : " + converter.convertStepsToKilocalories(sumSteps) + "\n");
        if (monthToData[month - 1].bestSeries(goalByStepsPerDay) <= 1) {
            System.out.println("У вас пока нет успешных серий :(\n");
        } else {
            System.out.println("Лучшая серия : " + monthToData[month - 1].bestSeries(goalByStepsPerDay) + "\n");
        }


    }


}
