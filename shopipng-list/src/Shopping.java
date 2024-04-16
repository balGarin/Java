import java.util.ArrayList;

public class Shopping {

    private String[] list = new String[8]; /* Здраствуйте! , извиняюсь , думал что в доп задание
    под названием - используйте "Динамический массив" имелся ввиду именно List  */
    private int productCount = 0;


    public void add(String newPurchase) {
        for (int i = 0; i < list.length; i++) {
            if (newPurchase.equals(list[i])) {
                System.out.println("Такой товар уже есть в вашей корзине. \n");
                return;
            }
        }
        if (productCount == list.length) {
            list = createArray(list);
        }
        list[productCount] = newPurchase;
        System.out.print("Товар " + newPurchase + " добавлен в список под номером " + (productCount + 1) + "\n");
        productCount++;
    }

    public void showList() {
        if (productCount != 0) {
            for (int i = 0; i < list.length; i++) {
                if (list[i] != null) {
                    System.out.println("Товар №" + (i + 1) + " - " + list[i]);
                }
            }
        } else {
            System.out.println("Ваш список еще пуст, попробуйте добавтьь что-то. \n");
        }
    }

    public void clearList() {
        for (int i = 0; i < list.length; i++) {
            list[i] = null;
        }
        productCount = 0;
        System.out.println("Ваш список очищен! \n");

    }

    public String[] createArray(String[] oldList) {
        String[] newList = new String[productCount * 2];
        for (int i = 0; i < oldList.length; i++) {
            newList[i] = oldList[i];
        }
        return newList;
    }

}
