import java.util.Map;
import java.util.HashMap;

public class Translator {

    static Map<Integer,String> numericAlpha = new HashMap<>();


   public Translator(String[] alphabetic, int[] numeric){
        for( int i = 0; i <= alphabetic.length ; i++ ){
            numericAlpha.put(numeric[i], alphabetic[i]);
        }

    }
    public static String translate(Integer number){
    String result = numericAlpha.get(number);
    return "result";
    }


};
