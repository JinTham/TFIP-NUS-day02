package day02.source;

public class Porche extends Car{
    private String turbo = "off";
    private int speed = 0;

    public Porche(){
        super.setColour("red");
    }
    public Porche(String colour, String registration){
        super.setColour(colour);
        setRegistration(registration);
    }
    public String getTurbo(){
        return turbo;
    }
    //Disabled the method to change colour for Porche class after instantiated
    @Override()
    public void setColour(String c){}

    public void accelerate(){
        this.speed++;
        if (this.speed >4){
            this.turbo = "on:";
        }
    }
    public void decelerate(){
        this.speed--;
        if (this.speed <=4){
            this.turbo = "off";
        }
    }
}
