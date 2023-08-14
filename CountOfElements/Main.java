import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers =  {10, 20, 20, 10, 10, 20, 5, 20};
        String[] cities = {"Ankara", "İzmir", "Istanbul", "İzmir", "Ankara", "Manisa","Ankara","Bolu"};
        CountOfElements(numbers);
        CountOfElements(cities);
    }

    public static void CountOfElements(Object []values) {
        List<Object> myList = Arrays.asList(values);
        Set<Object> uniqueValues = new HashSet<>(myList);
        System.out.println("Tekrar Sayıları");
        for(Object value:uniqueValues) {
            Object count = Collections.frequency(myList,value);
            System.out.println(value + " : " + count + " kere tekrar edildi.");
        }

    }
}
