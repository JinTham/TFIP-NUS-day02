package day02.source;

public class CarMain {
    //entry point
    public static void main(String[] args){
        //Instantiate an instance of car
        Car myCar = new Car();
        myCar.setColour("grey");
        myCar.setRegistration("sdf1234B");
        myCar.start();
        System.out.printf("Is the car started? %b\n",myCar.isStarted());
        myCar.getOutOfMyWay();
        
        Car yourCar = new Car();
        yourCar.setColour("red");
        System.out.printf("What color is your car? %s\n",yourCar.getColour());
        
        //casting a car to be a porche
        Car c = new Porche("yellow","sdfe");
        Porche p = (Porche)c;
        p.accelerate();
        
        c = new Car();
        if (c instanceof Porche){
            System.out.println("You have a Porche");
        } else {
            System.out.println("Your car is not a Porche");
        }
    }
}
