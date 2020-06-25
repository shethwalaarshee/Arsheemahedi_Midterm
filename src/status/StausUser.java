/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * june 24th
 * @author srinivsi
 * @modifier Arsheemahedi shethwala
 */
public class StausUser 
{
    
    //Declaring enums for the Choice
    public enum Choice{ZERO,ONE,TWO,THREE,DEFAULT};
    
    public Choice choice;

    public Choice getChoice() {
        return choice;
    }
    
    
   public void statusDetail(Choice code)
{
    
switch(code.toString().toUpperCase())
        {
        case "ZERO": System.out.println("REJECTED");
        break;
        case "ONE": System.out.println("PENDING");
        break;
        case "TWO":
        System.out.println("PROCESSING");
        break;
        case "THREE": 
            System.out.println("APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}
 
}