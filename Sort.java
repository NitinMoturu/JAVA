
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nitin
 */
public class Sort {
    public static void main(String[]args){
        int []a={6,5,3,7,2,4,1};
        System.out.println("the index of 7 is:"+Arrays.binarySearch(a, 8));
        
        Arrays.sort(a);
        for(int i:a)
            System.out.println(i);
    }
}
