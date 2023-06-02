import java.util.Scanner;
public class primewitharray {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < 5; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println(array[i] + "Is a prime no");
            } else {
                System.out.println("its not");
            }
        }
    }
}

















