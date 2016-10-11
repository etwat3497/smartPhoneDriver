package smartphonedriver;
//Add imports
import java.util.*;

/*
 * Class of smartPhoneDriver that creates the phone object
 */
public class SmartPhone {
  //Global variables to be used in constructing the phone
  int numApps;
  ArrayList<String> appList;
  String typeOfPhone;

  /**
   * pre: none
   * post: none
   * Method of the default constructor to choose a random smart phone type
   */
  public SmartPhone() {
    appList = new ArrayList<String>();
    numApps = 0;

    //No phone type was sent - pick random
    int randType = (int)(Math.random() * 3 + 1);
    if(randType == 1){
      typeOfPhone = "iPhone";
    }
    else if(randType == 2) {
      typeOfPhone = "Android";
    }
    else {
      typeOfPhone = "Blackberry";
    }
  }

  /**
   * pre: smart phone type string
   * post: none
   * Method of an alternate constructor to determine the users smart phone type
   */
  public SmartPhone(String smrtPhnType) {
    appList = new ArrayList<String>();
    numApps = 0;
    typeOfPhone = smrtPhnType;
  }

  /**
   * pre: app name string
   * post: none
   * Method to add apps to the phone
   */
  public void addApp(String appName){
    appList.add(appName);
    numApps++;
  }

  /**
   * pre: location int
   * post: none
   * Method to remove apps from the phone
   */
  public void removeApp(int location){
    appList.remove(location);
    numApps--;
  }

  /**
   * pre: none
   * post: return the phone object
   * Method to return the phone object to the smart phone driver
   */
  public String toString() {
    String output = "The following apps are installed on your "
      +typeOfPhone+":\n";
    for(int i = 0; i < numApps; i++){
      output += "App #" + i + " - " + appList.get(i) + "\n";
    }
    return output;
  }
}
