import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MusicFilterTest {
    private MusicFilter musicFilter = new MusicFilter();

    @Test
    public void testBandwidthFilter(){
        ArrayList<Integer> frequency = new ArrayList<>(Arrays. asList(6));
        assertEquals(frequency, musicFilter.checkBandwidth(frequency));
    }

    @Test
    public void testMinBandwidthFilter(){
        ArrayList<Integer> frequency = new ArrayList<>(Arrays. asList(3));
        ArrayList<Integer> minFrequency = new ArrayList<>(Arrays. asList(5));
        assertEquals(minFrequency, musicFilter.checkBandwidth(frequency));
    }
    @Test
    public void testMaxBandwidthFilter(){
        ArrayList<Integer> frequency = new ArrayList<>(Arrays. asList(11));
        ArrayList<Integer> maxFrequency = new ArrayList<>(Arrays. asList(10));
        assertEquals(maxFrequency, musicFilter.checkBandwidth(frequency));
    }

    @Test
    public void testMultipleBandwidthFilter(){
        ArrayList<Integer> frequency = new ArrayList<>(Arrays. asList(6, 7));
        assertEquals(frequency, musicFilter.checkBandwidth(frequency));
        ArrayList<Integer> moreFrequencies = new ArrayList<>(Arrays. asList(6, 7,9, 8));
        assertEquals(moreFrequencies, musicFilter.checkBandwidth(moreFrequencies));
    }

    @Test
    public void testMultipleMinBandwidthFilter(){
        ArrayList<Integer> frequency = new ArrayList<>(Arrays. asList(2, 6));
        ArrayList<Integer> minFrequency = new ArrayList<>(Arrays. asList(5, 6));
        assertEquals(minFrequency, musicFilter.checkBandwidth(frequency));
    }

    @Test
    public void testMultipleMinimumsBandwidthFilter(){
        ArrayList<Integer> frequency = new ArrayList<>(Arrays. asList(2, 4, 4));
        ArrayList<Integer> minFrequency = new ArrayList<>(Arrays. asList(5, 5, 5));
        assertEquals(minFrequency, musicFilter.checkBandwidth(frequency));
    }
}
