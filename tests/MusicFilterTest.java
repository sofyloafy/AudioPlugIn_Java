import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MusicFilterTest {
    private MusicFilter musicFilter = new MusicFilter();

    @Test
    public void testBandwidthFilter(){
        int[] frequency = {6};
        ArrayList<Integer> minFrequency = new ArrayList<>(Arrays. asList(5));
        assertEquals(minFrequency, musicFilter.checkBandwidth(frequency));
    }
}
