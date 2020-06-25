/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;
import status.StausUser.Choice;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * Use enumerators to avoid input errors
 * and print the status details. 
 * @author srinivsi date:June 24th
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     Scanner in =new Scanner(System.in);
    System.out.println("Enter the user status code (zero,one,two,three) in string");
    String code = in.next();
    StausUser t= new StausUser();
    
    if(code.equalsIgnoreCase("ZERO"))
        t.statusDetail(Choice.ZERO); 
    else if(code.equalsIgnoreCase("ONE"))
        t.statusDetail(Choice.ONE);
    else if(code.equalsIgnoreCase("TWO"))
        t.statusDetail(Choice.TWO);
    else if(code.equalsIgnoreCase("THREE"))
        t.statusDetail(Choice.THREE);
    else
        t.statusDetail(Choice.DEFAULT);
        
    
    }
    
}
