package classesabstract;

import classes.User;
import interfaces.ITransition;
import interfaces.Operational;
import interfaces.UserReceiver;

public abstract class OuterTransition implements ITransition, Operational, UserReceiver {
    public Structure getStructureA(){
        return null;
    }
    public Structure getStructureB(){
        return null;
    }
    public ITransition getInverse(){
        return null;
    }

    public void build(){

    }

    public void run(){

    }

    public void receiverUser(User user){

    }
}
