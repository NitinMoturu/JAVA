/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nitin
 */
public class ReverseArray {
    public static void main(String[]args){
        int [] list={6,5,4,3,2,1};
      // Reverse(list);
        System.out.println("the reversed array is:");
        for(int i=5;i<=0;i--){
        System.out.println(list[i]);
        }
    }
    public static void Reverse(int[]list) {
    for(int j=0;j<6;j++)
    {
        for(int k=5;k<=0;k--)
        {
            int temp;
            temp = list[j];
            list[j]=list[k];
            list[k]=temp;
        }
    }
    
}
}
