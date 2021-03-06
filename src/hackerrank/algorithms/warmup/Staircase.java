package hackerrank.algorithms.warmup;

import java.util.Scanner;

/*

Your teacher has given you the task of drawing a staircase structure. Being an expert programmer, you decided to make a program to draw it for you instead. Given the required height, can you print a staircase as shown in the example?

Input 

You are given an integer N depicting the height of the staircase.

Output 

Print a staircase of height N that consists of # symbols and spaces. For example for N=6, here's a staircase of that height:

     #
    ##
   ###
  ####
 #####
######

Note: The last line has 0 spaces before it.

*/

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n ;j++){
                if((i+j) >= n-1){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        in.close();
    }
}
