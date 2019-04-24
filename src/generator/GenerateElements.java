package generator;

import java.io.FileNotFoundException;

/**
 * Generates sets and writes into the files
 */
public class GenerateElements {
    public static void main(String[] args) throws FileNotFoundException {
        ElementsGenerator generator = new ElementsGenerator(100, 100, 10000);
        generator.generate();
    }
}