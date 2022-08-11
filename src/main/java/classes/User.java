package classes;

import classesabstract.Structure;
import classesabstract.Vehicle;

public class User {

    public Structure origin;
    public Structure destination;
    public int cycleOfAppearance;
    public int cycleOfArrivalOnDestination;

    //Constructors
    public User() {
    }

    public User(Structure origin, Structure destination, int cycleOfAppearance, int cycleOfArrivalOnDestination) {
        this.origin = origin;
        this.destination = destination;
        this.cycleOfAppearance = cycleOfAppearance;
        this.cycleOfArrivalOnDestination = cycleOfArrivalOnDestination;
    }

    //Functions
    public void initiateMyTravel(){

    }

    public void enterOn(Structure structure){

    }

    public void enterOn(Vehicle vehicle){

    }

    public void exitFrom(Vehicle vehicle){

    }

    public void arriveOn(Structure structure){

    }

    public PathQueue getMyPath(){
        return null;
    }

}
