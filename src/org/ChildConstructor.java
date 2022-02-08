package org;

public class ChildConstructor extends ConstructorMain {

    private String maritalStatus;

    public ChildConstructor() {}

    public ChildConstructor(String maritalStatus) {
        this.maritalStatus=maritalStatus;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
