package classesabstract;

import interfaces.ITransition;
import interfaces.Operational;

import java.util.ArrayList;

public abstract class System implements Operational {
    @Override
    public void build() {

    }

    @Override
    public void run() {

    }

    public ArrayList<Structure> getStructures(){
        return null;
    }

    public ArrayList<ITransition> getTransitions(){
        return null;
    }
}
