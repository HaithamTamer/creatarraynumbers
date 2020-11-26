package creatarraynumbers;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class creatnumberspro {

 

       public static void main(String[] args) {

 

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream 

         

        int arr[] = new int [1];

        int counter ;

         for( counter=1;;counter++){

              System.out.println("Please enter the numbers and if you wants to close the program and get the result please enter 0");

              int value= sc.nextInt();

              if(value==0){

                     break;

              }

              arr[0]+=value;

         }

         System.out.println("The sum is:" +arr[0]);

        

         System.out.println("The average  is:" +arr[0]/(counter-1));

        

         

}

}