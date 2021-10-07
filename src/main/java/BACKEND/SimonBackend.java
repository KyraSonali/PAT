/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND;

/**
 *
 * @author Kyra Balliram
 */
import java.util.Timer;
import UI.Simon;
import java.awt.Color;

import java.util.Random;
public class SimonBackend {
    
 static Timer timer = new Timer();
 static int seconds = 0; 
 public static int chosenButton;
 public static int valueRed;
 public static int valueBlue;
 public static int valueYellow;
 public static int valueGreen;
 public static int buttonValue;

 public static String[] buttonStr = { "redFrame","blueFrame","yellowFrame","greenFrame"};
 

 
 public static int assignButtonValue(String buttonStr){
     buttonValue =0;
     switch(buttonStr){
         case "redFrame"-> buttonValue=1;
         case "blueFrame"-> buttonValue = 2;
         case "yellowFrame"-> buttonValue=3;
         case "greenFrame"-> buttonValue=4;
         
         
     }
     return buttonValue;
 }
 
 public static int randomValue(){
    int [] buttonArray = new int[] {valueRed, valueBlue,valueYellow,valueGreen};
    //chosenButton= buttonArray[new Random().nextInt(buttonArray.length)]; 
    chosenButton= buttonArray[new Random().nextInt(Simon.levelnbr)]; 
    return chosenButton; 
 }
 

public static void getButtonValue(){
     valueRed = assignButtonValue("redFrame");
     valueBlue = assignButtonValue("blueFrame");
     valueYellow =assignButtonValue("yellowFrame");
     valueGreen = assignButtonValue("greenFrame");
    

}

public static void waitTimer(){
    seconds=5; 
    
}




}





 

   
    
    

  
  
 
  

