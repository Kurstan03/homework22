import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        ArrayList <Integer> numbers = new ArrayList<>();
        ArrayList <Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(1,100));
            if (numbers.get(i) % 2 != 0){
                oddNumbers.add(numbers.get(i));
            }else {
                evenNumbers.add(numbers.get(i));
            }

        }

        System.out.println("All numbers: " + numbers);
        System.out.println("odd numbers: " + oddNumbers);
        System.out.println("even numbers: " + evenNumbers);
    }
}