package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautifulText (String text, PoemDecorator poemDecorator) {
        return poemDecorator.decorate(text);
    }
}
