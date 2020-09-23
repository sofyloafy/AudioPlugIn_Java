import java.util.ArrayList;
import java.util.List;

public class MusicFilter {
    public static List<Integer> checkBandwidth(ArrayList<Integer> frequency){
        int minFrequency = 5;
        int maxFrequency = 10;
        List<Integer> frequencies = new ArrayList<Integer>();

        for (int i = 0; i < frequency.size(); i++) {
            if (frequency.get(i) < minFrequency) {
                frequencies.add(minFrequency);
            } else if(frequency.get(i) >= maxFrequency) {
                frequencies.add(maxFrequency);
            } else {
                frequencies.add(frequency.get(i));
            }
        }
        return frequencies;
    }
}
