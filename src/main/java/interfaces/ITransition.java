package interfaces;

import classesabstract.Structure;

public interface ITransition {
    Structure getStructureA();
    Structure getStructureB();
    ITransition getInverse();
}
