import tree.BTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {

    private static String pathName = "sets/set";

    public static BTree<Integer> readSet(int setNumber, int m) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(pathName + setNumber + ".txt"));

        BTree<Integer> bTree = new BTree<>(m - 1);

        while (scanner.hasNext()) {
            bTree.add(scanner.nextInt());
        }

        return bTree;
    }
}