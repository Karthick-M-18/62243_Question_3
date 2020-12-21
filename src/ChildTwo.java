import java.util.ArrayList;
import java.util.stream.Collectors;

public class ChildTwo extends Solution {
    public static ArrayList< Integer > happy2 = new ArrayList< Integer >();
    public static int make_it_simple(int number){
        int rem = 0, sum = 0;
        // calculate the sum of squares of each digits
        while(number > 0)
        {
            rem = number %10;
            sum = sum+(rem*rem);
            number = number/10;
        }
        return sum;
    }
    public static String filter(int startElement, int endElement){
        for (int i = startElement; i <= endElement ; i++) {
            int result = i;
            while (result != 1 && result != 4)
            {
                result = make_it_simple(result);
            }
            if (result ==1){
                happy2.add(i);
            }}
        String listString = happy2.stream().map(Object::toString)
                .collect(Collectors.joining(" "));
        return (listString);
    }
}
