/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testoop;

/**
 *
 * @author Pasan Yasara
 */
public class TDArray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        
        int total=0;
        int k=arr.length-1;
        
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
//                if(i==j )
//                {
//                    total=+arr[i][j];
//                    //System.out.println("j="+i+" || i="+j);
//                    
//                }
                if(j==k)
                {
                    total+=arr[i][j];
                    System.out.println("i="+i+" || j="+j+"  -> "+arr[i][j]);
                    k--;
                }
                
                
                
            }
            
            
        }
        
        System.out.println(total);
    }
    
}
