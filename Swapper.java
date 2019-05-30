import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Swapper {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 6, 4, 7, 3, 9);
        List<String> names = Arrays.asList("zoyaa", "divya", "danny", "deepa", "akshay", "vamakshi");
        System.out.println(swapped(numbers, 0, 6));
        System.out.println(swapped(names, 0, 5));
        System.out.println(add(2,7));
        System.out.println(add("zoyaa","patel"));
    }

    public static <T> List<T> swapped(List<T> elements, int i, int j) {
        List <T> copyOfElements = new ArrayList<>(elements);
        T index2 = copyOfElements.get(j);
        copyOfElements.set(j, copyOfElements.get(i));
        copyOfElements.set(i, index2);
        return copyOfElements;
    }

    public static int add(int x,int y){
        int total = x+y;
        return total;
    }
    public static String add(String x,String y){
        String total = x + " " +y;
        return total;
    }
    //    public static <T> List<T> swapped(List<T> names, int i, int j) {
//        List<T> copyOfNames = new ArrayList<>(names);
//        T index2 = copyOfNames.get(j);
//        copyOfNames.set(j, copyOfNames.get(i));
//        copyOfNames.set(i, index2);
//        return copyOfNames;
//    }
}

