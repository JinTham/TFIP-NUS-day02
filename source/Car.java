package day02.source;

public class Car {
    private String registration;
    private String colour;
    private int year;
    private boolean started;

    //Constructors
    public Car(){
        this.colour = "white";
    }
    public Car(String colour, String registration){
        this.colour = colour;
        this.registration = registration;
    }

    //Getters and Setters
    public String getRegistration(){
        return this.registration;
    }
    public void setRegistration(String r){
        this.registration = r;
    }
    public String getColour(){
        return this.colour;
    }
    public void setColour(String newColour){
        this.colour = newColour;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int newYear){
        this.year = newYear;
    }

    public boolean isStarted(){
        return started;
    }

    //methods
    public void start(){
        this.started = true;
    }
    public void stop(){
        this.started = false;
    }
    public void getOutOfMyWay(){
        System.out.println("HONK!!!");
    }

}