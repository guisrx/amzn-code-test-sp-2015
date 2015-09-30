package com.selau.algorithms.amazon;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test class of {@link MaxCakePleasureSearcher}.
 * @author selau
 *
 */
public class MaxCakePleasureSearcherTest {

    @Test
    public void shouldFindTheCorrectPleasureValueOfTheCackes() {

        final int[] layersA = {10, -2, 5, -4, 3, -5, 1};
        Assert.assertEquals(Integer.valueOf(14), MaxCakePleasureSearcher.cake(layersA));

        final int[] layersB = {10, -2};
        Assert.assertEquals(Integer.valueOf(10), MaxCakePleasureSearcher.cake(layersB));

        final int[] layersC = {10};
        Assert.assertEquals(Integer.valueOf(10), MaxCakePleasureSearcher.cake(layersC));

        final int[] layersD = {};
        Assert.assertEquals(Integer.valueOf(0), MaxCakePleasureSearcher.cake(layersD));

        final int[] layersE = {-2};
        Assert.assertEquals(Integer.valueOf(0), MaxCakePleasureSearcher.cake(layersE));

        final int[] layersF = {-1, -5, -7, 9, 10, 8};
        Assert.assertEquals(Integer.valueOf(27), MaxCakePleasureSearcher.cake(layersF));

        final int[] layersG = {-1, -2, 1, -7};
        Assert.assertEquals(Integer.valueOf(0), MaxCakePleasureSearcher.cake(layersG));

        final int[] layersH = {-99, 100, -98};
        Assert.assertEquals(Integer.valueOf(2), MaxCakePleasureSearcher.cake(layersH));
    }

}
