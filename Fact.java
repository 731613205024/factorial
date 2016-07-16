/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fact;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Fact {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        int fact=a.nextInt();
        int b=fact;
        for(int i=(b-1);i>1;i--)
        {
            fact=fact*i;
        }
        System.out.println("factorial of num is: "+fact);
    }
}
