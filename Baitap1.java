/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn;

public class Baitap1 {

    public static void checkNumber( int a , int b){
        boolean primeNumber = true;
        for( int i=2; i<= a/2; i++ ){   
            if(a%i == 0)
                primeNumber = false;
        }
        boolean odd = true;
        if(b%2 == 0)
            odd = false;
       if( primeNumber == true && odd == true)
           System.out.println("a la so nguyen to, b la so le");
       if( primeNumber == false && odd == true)
           System.out.println("a khong la so nguyen to, b la so le");
       if( primeNumber == true && odd == false)
           System.out.println("a la so nguyen to, b khong la so le");
       if( primeNumber == false && odd == false)
           System.out.println("a khong la so nguyen to, b khong la so le");
    }
    public static void main(String[] args) {
        checkNumber(5,8);
    }
   
}
