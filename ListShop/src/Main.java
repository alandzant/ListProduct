import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] ListOperation = new String[] { "Добавить", "Показать", "Удалить"};
        List<String> product = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);



        while (true){
            System.out.println("Выберите операцию: ");
            for (int i = 0; i < ListOperation.length; i++)
                System.out.println((i + 1) + ". " + ListOperation[i]);
            String NumberOperation = scanner.next();

           switch (NumberOperation){
               case "1":{
                   System.out.println("Какую покупку хотите добавить?");
                   product.add(scanner.next());
                   break;
               }
               case "2":{
                   System.out.println("Список покупок:");
                   for (int i = 0; i < product.size(); i++)
                       System.out.println((i + 1) + ". " + product.get(i));
                   break;
               }
               case "3":{
                   System.out.println("Список покупок");
                   for (int i = 0; i< product.size(); i++)
                       System.out.println((i + 1) + ". " + product.get(i));
                   System.out.println("Какую хотите удалить? Введите номер или название:");
                   String NameProductOrNumber = scanner.next();
                   try {
                       int numberProduct = Integer.parseInt(NameProductOrNumber) -1;
                       product.remove(numberProduct);
                   } catch (NumberFormatException e) {
                       product.remove(NameProductOrNumber);
                   }
               }
           }
        }

    }
}