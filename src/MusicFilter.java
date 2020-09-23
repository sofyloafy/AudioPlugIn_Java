import java.util.ArrayList;
import java.util.List;

public class MusicFilter {
    public static List<Integer> checkBandwidth(ArrayList<Integer> frequency){
        int minFrequency = 5;
        int maxFrequency = 10;
        List<Integer> frequencies = new ArrayList<Integer>();
        if (frequency.get(0) < minFrequency) {
            frequencies.add(minFrequency);
        } else if(frequency.get(0) >= maxFrequency) {
            frequencies.add(maxFrequency);
        } else {
            return frequency;
        }
        return frequencies;
    }
}
