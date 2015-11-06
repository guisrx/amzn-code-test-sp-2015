package com.selau.algorithms.amazon;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests of {@link LastRepeatedWordSearcher}.
 * @author selau
 *
 */
public class LastRepeatedWordSearcherTest {


    @Test
    public void shouldFindLastRepeatedWordsCorrectly() {

        final Stream streamA = new CharStream("The angry dog was red. And the cat was angry too.");
        Assert.assertEquals("angry", LastRepeatedWordSearcher.lastRepeated(streamA));

        final Stream streamB = new CharStream("The angry dog was red.");
        Assert.assertEquals("", LastRepeatedWordSearcher.lastRepeated(streamB));

        final Stream streamC = new CharStream("The angry dog was red. The angry dog was red.");
        Assert.assertEquals("red", LastRepeatedWordSearcher.lastRepeated(streamC));

        final Stream streamD = new CharStream("The angry dog was red! The angry dog was red.");
        Assert.assertEquals("red", LastRepeatedWordSearcher.lastRepeated(streamD));

        final Stream streamE = new CharStream("The angry dog was red? The angry dog was red.");
        Assert.assertEquals("red", LastRepeatedWordSearcher.lastRepeated(streamE));

        final Stream streamF = new CharStream("");
        Assert.assertEquals("", LastRepeatedWordSearcher.lastRepeated(streamF));
    }

}
