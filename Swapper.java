import java.util.Arrays;
import java.util.List;

public class Swapper {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,5,6,4,7,3,5);
        System.out.println(getNumbersSwapped(numbers,0,5));

    }
    public static List<Integer> getNumbersSwapped(List<Integer> numbers,int i,int j){
        Integer index1 = numbers.get(i);
        Integer index2 = numbers.get(j);
        numbers.set(j,index1);
        numbers.set(i,index2);
        return numbers;
    }

}

