/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author brianobioha
 */
public class ConvertibleB extends CarB{
    private boolean topState;
    
    public void PutTopUp(){
        if(!topState){
            System.out.println("Putting top up");
            topState = true;
        }
        else if(topState)
            System.out.println("Top is already up");
            
    }
    
    public void PutTopDown(){
        if(topState){
            System.out.println("Putting top down");
            topState = false;
        }
        else if(!topState)
            System.out.println("Top is already down");
    }
    
    public static void main(String [] args){
        ConvertibleB ferrari = new ConvertibleB();
        
        ferrari.Start();
    }
}
