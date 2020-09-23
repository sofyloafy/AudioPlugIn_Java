import java.util.ArrayList;
import java.util.List;

public class MusicFilter {
    public static List<Integer> checkBandwidth(int[] frequency){
        List<Integer> frequencies = new ArrayList<Integer>();
        if(frequency[0] > 5){
            frequencies.add(5);
        } else {
            frequencies.add(frequency[0]);
        }
        return frequencies;
    }
}
