package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String input, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(input);
        System.out.println("Decorated text: " + result);
    }
}
