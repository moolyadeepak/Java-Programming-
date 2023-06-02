import java.util.ArrayList;
import java.util.Scanner;

public class multiarraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        //int[] arrArray = new int[]{1, 2, 3, 4, 5};
        ArrayList<ArrayList<Integer>> Mlist = new ArrayList<>(5);

//        Mlist.add(64);
//        Mlist.add(3123);
//        Mlist.add(8674);

        for (int i = 0; i < 3; i++) {
            Mlist.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Mlist.get(i).add(in.nextInt());
            }
        }
    }
}