package HW34A;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String>linkedList = new LinkedList<>();
        linkedList.add("Ветер с моря дул");//0
        linkedList.add("Нагонял беду");//1
        linkedList.add("И сказал ты мне");//2
        linkedList.add("Больше не приду");//3

        for (int i=0; i<8;i++){
            linkedList.add(linkedList.get(i));
            System.out.println(linkedList.get(i)+ " ");
        }
// не понял реализацию последних двух условий

    }
}
