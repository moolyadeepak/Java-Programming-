import java.util.Arrays;
import java.util.Scanner;

public class arrayoaddeven {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        int a= input.nextInt();

        int [] arr={12,13,15,18,52,100,201};
        
        int [] even = new int[7];
        int[] odd = new int[7];



        for(int i=0;i<7;i++){
            if( arr[i]%2==0){

                even[i]=arr[i];
            }
            else{
                odd[i]=arr[i];
            }
        }
        System.out.println(Arrays.toString(odd));

        }
    }