import java.util.ArrayList;
import java.util.List;

public class MusicFilter {
    public static List<Integer> checkBandwidth(ArrayList<Integer> frequency){
        List<Integer> frequencies = new ArrayList<Integer>();
        if (frequency.get(0) >= 5) {
            frequencies.add(frequency.get(0));
        } else {
            frequencies.add(5);
        }
        return frequencies;
    }
}
