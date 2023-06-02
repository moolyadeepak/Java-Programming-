package Arrayprograms;

import java.util.Arrays;

public class array{
    public static void main(String[] args) {




        int[] nums = {3,5,6,7,8,2};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

        
    }



   static void change(int abc[]){

        abc[0]=44;
        abc[3]=77;
        

    }
}

