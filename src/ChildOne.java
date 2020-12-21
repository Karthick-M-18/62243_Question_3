import java.util.ArrayList;
import java.util.stream.Collectors;

public class ChildOne extends Solution{
//    public static StringBuilder prime = new StringBuilder();
    public static ArrayList< Integer > prime2 = new ArrayList< Integer >();
    public static String filter(int startElement, int endElement){
        for (int i = startElement; i <= endElement; i++) {
            int temp = 0;
            for (int j = 1; j < i; j++) {
                if(i%j == 0){
                    temp+=1;
                }
                if(temp>1) {
                    break;
                }
            }
            if(temp==1){
                prime2.add(i);
            }
        }
        String listString1 = prime2.stream().map(Object::toString)
                .collect(Collectors.joining(" "));
    return (listString1);
}}
