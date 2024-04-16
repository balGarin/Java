public class MonthData {
    int[] days;

    MonthData() {
        days = new int[30];
    }

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + " день : " + days[i]); // видимо случайно нажал,спасибо :)
        }
    }

    int sumStepsFromMonth() {
        int sum = 0;
        for (int day : days) {
            sum += day;
        }
        return sum;
    }

    int maxSteps() {
        int max = 0;
        for (int day : days) {
            if (max < day) {
                max = day;
            }
        }
        return max;
    }

    int bestSeries(int goalByStepsPerDay) {
        int bestSeries = 0;
        int count = 0;
        for (int day : days) {
            if (day >= goalByStepsPerDay) {
                count++;
                if (count > bestSeries) {
                    bestSeries = count;
                }
            } else {
                count = 0;
            }
        }
        return bestSeries;
    }

    int averageNumbersOfSteps() {
        int sum = 0;
        for (int day : days) {
            sum += day;
        }
        return   sum / days.length;
    }


}
