package esercizi.esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static List<Integer> generaRandomList (int n){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(101));
        }
        return list;
    }

    public static List<Integer> mirroredList(List<Integer>list){
        List<Integer> mirroredList = new ArrayList<>();
        for (int i =  list.size(); i >= 0; i--) {
            mirroredList.add(list.get(i));

        }
        return mirroredList;
    }

    public static void printByPosition(List<Integer> list, boolean printEven){
        for (int i = 0; i < list.size(); i++) {
            if ((printEven && i % 2 == 0)||(!printEven && i % 2 !=0)){
                System.out.println(list.get(i));
            }

        }
    }

    public static void main(String[] args) {
        List<Integer> newList = generaRandomList(10);

    }
}
