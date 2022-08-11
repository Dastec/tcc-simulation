package classesabstract;

import classes.User;
import interfaces.UserReceiver;

public abstract class Vehicle implements UserReceiver {

    public void receiverUser(User user){

    }

    public boolean isStop(){
        return false;
    }

    public void stop(){

    }

    public void getPassengerCapacity(){

    }

    public void getCurrentAbsortionCapacity(){

    }
}
