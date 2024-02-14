/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment3;

/**
 *
 * @author garma
 */
public class Assignment3 {

    public static void main(String[] args){
        PrimeNumbers pn = new PrimeNumbers();
        pn.computePrimes(6);
        
        System.out.println(pn.toString());
    }
    
 public static int findMax(int arr[]){  
        int max=0;  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  
}
