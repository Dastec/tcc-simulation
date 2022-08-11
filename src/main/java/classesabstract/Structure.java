package classesabstract;

import classes.User;
import interfaces.ITransition;
import interfaces.UserReceiver;

import java.util.ArrayList;

public abstract class Structure implements UserReceiver {

    public void receiverUser(User user){

    }

    public void createTransition(Structure structure, Boolean mirror){

    }

    public ITransition getTransitions(){
        return null;
    }

    public ArrayList<InnerTransition> getInnerTransitions(){
        return null;
    }

    public ArrayList<OuterTransition> getOuterTransitions(){
        return null;
    }




}
