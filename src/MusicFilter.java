import java.util.ArrayList;
import java.util.List;

public class MusicFilter {
    public static List<Integer> checkBandwidth(ArrayList<Integer> frequency){
        List<Integer> frequencies = new ArrayList<Integer>();
        if (frequency.get(0) < 5) {
            frequencies.add(5);
        } else if(frequency.get(0) >= 10) {
            frequencies.add(10);
        } else {
            frequencies.add(frequency.get(0));
        }
        return frequencies;
    }
}
