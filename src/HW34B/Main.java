package HW34B;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        Random random = new Random();
        System.out.println("Random numbers: ");
        for (int i = 0;i<50;i++){
            arrayList.add(random.nextInt(100-1)+1);
            System.out.print(arrayList.get(i)+ " \n");
        }

        ArrayList<Integer>evenNumbers=new ArrayList<>();
        for(int number: arrayList){
            if(number%2==0){
                evenNumbers.add(number);
            }
        }
        System.out.println("Even numbers: " + evenNumbers);

        ArrayList<Integer>oddNumbers=new ArrayList<>();
        for (int odd: arrayList){
            if(odd%2!=0){
                oddNumbers.add(odd);
            }
        }      System.out.println("Odd numbers: " + oddNumbers);
    }
}
