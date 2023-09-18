
package lab6_engce117;

public class Lab6_engce117 {

  
   public static void main(String[] args) {
    car myCar = new car("Toyota", "Corolla", 2020);
    myCar.printInfo("My car is a");
    myCar.start();
    myCar.stop();
    myCar.drift();
    myCar.drive();
    System.out.println(myCar.equals(new car("Toyota", "Corolla", 2020)));
}

    
    
}
