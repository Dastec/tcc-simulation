package classesabstract;

import interfaces.ITransition;

public abstract class InnerTransition implements ITransition {

    public Structure getStructureA(){
        return null;
    }
    public Structure getStructureB(){
        return null;
    }
    public ITransition getInverse(){
        return null;
    }
}
