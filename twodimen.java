import java.util.Arrays;
import java.util.Scanner;

public class twodimen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //for direct declaration
        int[][] arr = {{1,2,6,3},{3},{5,6,7}};

        for(int i=0;i<3;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
        //for user input
        int[][] arr1 = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]= in.nextInt();
            }
            System.out.print("\n");
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.print("\n");
        }
  }
}
