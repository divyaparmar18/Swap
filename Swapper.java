import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Swapper {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,5,6,4,7,3,9);
        System.out.println(getNumbersSwapped(numbers,0,6));
        System.out.println(numbers);
    }
    public static List<Integer> getNumbersSwapped(List<Integer> numbers,int i,int j){
        List<Integer> copyOfNumbers = new ArrayList<>(numbers);
        int index2 = copyOfNumbers.get(j);
        copyOfNumbers.set(j,copyOfNumbers.get(i));
        copyOfNumbers.set(i,index2);
        return copyOfNumbers;
    }

}

