import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MusicFilterTest {
    private MusicFilter musicFilter = new MusicFilter();

    @Test
    public void testBandwidthFilter(){
        int[] result = {3};
        assertEquals(result, musicFilter.checkBandwidth(result));
    }
}
