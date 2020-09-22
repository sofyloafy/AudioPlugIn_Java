import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MusicFilterTest {
    private MusicFilter musicFilter = new MusicFilter();

    @Test
    public void testBandwidthFilter(){
        assertEquals("Hello", musicFilter.checkBandwidth());
    }
}
