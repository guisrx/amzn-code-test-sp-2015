package com.selau.algorithms.amazon;

/**
 * Implementation of the interface {@link Stream} using a simple string.
 * @author selau
 *
 */
public class CharStream implements Stream {

    private final String input;
    private int index = 0;

    public CharStream(final String input) {
        this.input = input;
    }

    @Override
    public char next() {
        if ((this.index >= this.input.length()) || (this.input == null))
            throw new IllegalArgumentException();

        final char character = input.charAt(this.index);
        this.index++;

        return character;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.input.length();
    }
}
