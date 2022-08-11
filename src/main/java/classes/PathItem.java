package classes;

import classesabstract.Structure;
import enums.UserAction;

import java.util.Objects;

public class PathItem {

    public Structure structure;
    public UserAction action;

    public PathItem() {
    }

    public PathItem(Structure structure, UserAction action) {
        this.structure = structure;
        this.action = action;
    }
}
