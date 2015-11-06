package com.selau.algorithms.amazon;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem A: Concatenate chars until word delimiter is found.
 * Then store the found and the already found words in a set
 * with access O(1) and also verify if this word was already added.
 *
 * @author selau
 *
 */
public class LastRepeatedWordSearcher {

    private static final String EMPTY = "";
    private static final String NON_WORD_REGEX = "\\W";

    public static String lastRepeated(final Stream input) {
        final Set<String> wordsRead = new HashSet<String>();

        String lastRepeated = EMPTY;
        StringBuffer wordBuffer = new StringBuffer();

        while (input.hasNext()) {
            final String nextCharacter = String.valueOf(input.next());

            if (nextCharacter.matches(NON_WORD_REGEX)) {
                if (wordBuffer.length() > 0) {
                    final String newWord = wordBuffer.toString();

                    if (wordsRead.contains(newWord)) {
                        lastRepeated = newWord;
                    }
                    wordsRead.add(newWord);
                }
                wordBuffer = new StringBuffer();
            } else {
                wordBuffer.append(nextCharacter);
            }
        }
        return lastRepeated;
    }

}
