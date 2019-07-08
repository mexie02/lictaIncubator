/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antonchessboard;

import java.util.Scanner;

/**
 *
 * @author Admini
 */
public class AntonChessBoard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
  
        System.out.println("Enter any Time(secs) to see the index position of the Ant at the time");
        int time = in.nextInt();
        
        int nextmove =1;
        int i = 1;
        int j = 1;
        int i1 = 1;
        int j1 = 1;
                    
        if(time == 1){
            System.out.println("i, j = "+i+"  "+j);
            }
            else
               {
                   while(time != nextmove)
                   {
                       j++;
                       nextmove++;
                       j1=j;
                           if(time == nextmove)
                              {
                                  System.out.println("i, j ="+i+" "+j);
                                  break;
                              }
                   
           for (; i<(i1+1); i++, nextmove++)
                {
                    if(nextmove == time)
                       {
                           System.out.println(" i, j ="+i+" "+j);
                           break;
                       }
                }
          if(nextmove == time)
               {
              break;
          }
        
                   j1=j;
                     for(; j>1;)
                     {
                         j--;
                         nextmove++;
                         
                       if(nextmove == time)
                             System.out.println(" i, j ="+i+" "+j);
                       break;
                       
                     }
               
        {
        i1 = i;
        i++;
        nextmove++;
        
         if(nextmove == time)
         break;
         
              }
           }
        }
               
    }
}


                
                
            
           
        
    

               
           
       

    
    

