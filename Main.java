import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static ArrayList<cards> massive = new ArrayList<>();
    static int i = 1;

    public static void main(String[] args) {
        while (true) {

            Scanner input = new Scanner(System.in);

            System.out.println("   // TRACKER // v1.0");
            System.out.println("");
            System.out.println("  ❯ 1. Добавить задачу");
            System.out.println("  ❯ 2. Посмотреть список");
            System.out.println("  ❯ 3. Изменить задачу");
            System.out.println("  ❯ 4. Удалить задачу");
            System.out.println("");
            System.out.print("[Ввод] ➔ ");
            int action = input.nextInt();
            String lmao = input.nextLine();
            if (action == 1) {
                System.out.println("Введите задачу");
                String firstTask = input.nextLine();
                addCard(firstTask);
            } else if (action == 2) {
                System.out.println("----------------------");
                System.out.println("ВАШИ ТЕКУЩИЕ ЗАДАЧИ");
                System.out.println("----------------------");
                getCard();
                System.out.println("----------------------");
            } else if (action == 4) {
                System.out.println("----------------------");
                System.out.println("ВВЕДИТЕ НОМЕР ЗАДАЧИ КОТОРУЮ ХОТИТЕ УДАЛИТЬ:");
                System.out.println("----------------------");
                int numberCard = input.nextInt();
                deleteCard(numberCard);
                System.out.println("----------------------");
                System.out.println("ЗАДАЧА УСПЕШНО УДАЛЕНА");
                System.out.println("----------------------");

            } else if (action == 3) {
                System.out.println("ВВЕДИТЕ НОМЕР ЗАДАЧИ КОТОРУЮ ХОТИТЕ ИЗМЕНИТЬ:");
                int numberChangeCard = input.nextInt();
                String p = input.nextLine();
                System.out.println("----------------------");
                System.out.println("ВВЕДИТЕ НОВУЮ ЗАДАЧУ:");
                System.out.println("----------------------");
                String non = input.nextLine();
                changeCard(numberChangeCard, non);
                System.out.println("----------------------");
                System.out.println("ЗАДАЧА УСПЕШНО ИЗМЕНЕНА");
                System.out.println("----------------------");
            }
        }};
        public static void addCard (String a){
            cards b = new cards();
            b.number = i;
            b.task = a;
            massive.add(b);
            System.out.println("Карточка успешно добавлена");
            i++;
        };

        public static void getCard () {
            for (int i = 0; i < massive.size(); i++) {
                cards item = massive.get(i);
                System.out.print(item.number + ".");
                System.out.println(item.task);


            }
        };
        public static void deleteCard(int deleteNumberr){
            for (int i = 0;i < massive.size(); i++){
                cards current = massive.get(i);
                if (current.number == deleteNumberr){
                    massive.remove(i);
                    break;
                };
            }
        };
        public static void changeCard(int changeNumber, String task) {
            for (int i = 0;i < massive.size(); i++){
                cards current = massive.get(i);
                if (current.number == changeNumber){
                    current.task = task;
                    break;
                };
            }
        }
    }

