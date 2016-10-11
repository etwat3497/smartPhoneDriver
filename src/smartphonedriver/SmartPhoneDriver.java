/**
 * Created by Ethan Watt
 * On October 11, 2016
 * Use classes to simplify a program that creates apps for a specific smartphone
 */
package smartphonedriver;

import javax.swing.*;
/*
 * This is the class for the smart phone driver that contains the main method
 */
public class SmartPhoneDriver {
    
  /**
   * pre: String array
   * post: void
   * Main method to print and display smart phone program
   */
  public static void main(String[] args) {
    SmartPhone sp;

    //Ask for random phone
    String choice = JOptionPane.showInputDialog(
      "Creating SmartPhone object:\n"
      + "1 - Enter the type of smartphone you own\n"
      + "2 - Generate a random smartphone");

    if(choice.equals("2")){
      //Use the default constructor
      sp = new SmartPhone();
    } else if(choice.equals("1")) {
      //Ask user phone type
      String phoneType = JOptionPane.showInputDialog(
        "What type of phone do you own?\nFor example: iPhone");
      //Use the alternate constructor
      sp = new SmartPhone(phoneType);
    } else {
        //Catch bad user response
      System.out.println("Invalid selection! Generating random"
        + " smartphone.");
      //Use the default constructor
      sp = new SmartPhone();
    }

    //Menu to add apps
    boolean done = false;
    String myApp;
    //While done is set to false
    while(!done) {
        //Get user apps
      myApp = JOptionPane.showInputDialog(
        "Please type the name of an app to add to your phone.\n"
        + "Type DONE when finished");
      if(myApp.equalsIgnoreCase("done")){
          //End while loop
        done = true;
      } else {
          //Run app constructor
        sp.addApp(myApp);
      }
    }

    //Display phone with app list
    JOptionPane.showMessageDialog(null, sp);
  }
}

