import calculation.Calculation;
import tree.BTree;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        final int m = 4;
        final int countIterations = 10;
        final int maxValue = 10000;

        String pathName = "results/";

        PrintWriter resultsN = new PrintWriter(new File(pathName + "n.txt"));

        PrintWriter resultsTimeAdd = new PrintWriter(new File(pathName + "timeAdd.txt"));
        PrintWriter resultsTimeRemove = new PrintWriter(new File(pathName + "timeRemove.txt"));
        PrintWriter resultsTimeContains = new PrintWriter(new File(pathName + "timeContains.txt"));


        // Scanning and printing result of every set
        for (int i = 1; i <= 100; i++) {

            // Add
            // Timing an algorithm 10 times
            for (int j = 0; j < countIterations; j++) {
                BTree<Integer> bTree = Input.readSet(i, m);

                int valueToAdd = Calculation.getRandomNumber(maxValue);

                long start = System.nanoTime();
                bTree.add(valueToAdd);
                long end = System.nanoTime();

                long time = end - start;
                resultsTimeAdd.print(time + " ");
            }
            resultsTimeAdd.println();

            // Remove
            // Timing an algorithm 10 times
            for (int j = 0; j < countIterations; j++) {
                BTree<Integer> bTree = Input.readSet(i, m);

                int valueToRemove = Calculation.getRandomNumber(maxValue);

                long start = System.nanoTime();
                bTree.remove(valueToRemove);
                long end = System.nanoTime();

                long time = end - start;
                resultsTimeRemove.print(time + " ");
            }
            resultsTimeRemove.println();

            // Contains
            // Timing an algorithm 10 times
            for (int j = 0; j < countIterations; j++) {
                BTree<Integer> bTree = Input.readSet(i, m);

                int valueToCheck = Calculation.getRandomNumber(maxValue);

                long start = System.nanoTime();
                bTree.contains(valueToCheck);
                long end = System.nanoTime();

                long time = end - start;
                resultsTimeContains.print(time + " ");
            }
            resultsTimeContains.println();

            // Size
            BTree<Integer> bTree = Input.readSet(i, m);
            resultsN.println(bTree.size());
        }

        resultsN.close();
        resultsTimeAdd.close();
        resultsTimeRemove.close();
        resultsTimeContains.close();

    }
}