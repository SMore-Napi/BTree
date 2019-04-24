import tree.BTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Creates list of second array's elements which are not contained in the first array
 */
public class Task {
    public static void main(String[] args) {

        int [] a = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int [] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};


        BTree<Integer> bTree = new BTree<>(3);
        for (int i = 0; i < a.length; i++) {
            bTree.add(a[i]);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            if (!bTree.contains(b[i])){
                list.add(b[i]);
            }
        }

        System.out.println("A array:");
        System.out.println(Arrays.toString(a));

        System.out.println("B array:");
        System.out.println(Arrays.toString(b));

        System.out.println("Elements from B array which aren't contained in A array:");
        System.out.println(list.toString());




    }
}
