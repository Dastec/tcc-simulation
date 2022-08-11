package classes;

import classesabstract.OuterTransition;
import classesabstract.Structure;
import classesabstract.System;
import interfaces.Operational;

import java.util.ArrayList;

public class Simulation implements Operational {
    private ArrayList<User> usersToEnter = new ArrayList<>();
    private ArrayList<User> usersOnTheRun = new ArrayList<>();
    private ArrayList<User> usersThatFinished = new ArrayList<>();

    @Override
    public void build() {

    }

    @Override
    public void run() {

    }

    public void registerSystem(System system){

    }

    public void registerStructure(Structure structure){

    }

    public void registerTransition(OuterTransition transition){

    }

    public void registerUser(User user){

    }

    public void registerIntervention(int startCycle, int endCycle){

    }

    public void registerUserMapping(UserMapping mapping){

    }

    public ArrayList<User> getUsersOnTheRun(){
        return null;
    }

    public ArrayList<User> getUsersToBe(){
        return null;
    }

    public ArrayList<User> getUsersThatFinished(){
        return null;
    }

    public ArrayList<System> getSystems(){
        return null;
    }

    public SystemState getState(){
        return null;
    }

    public DefaultDirectedWeightedGraph<Structure, LabeledWeightedEdge> getGraph(){
        return null;
    }

}
