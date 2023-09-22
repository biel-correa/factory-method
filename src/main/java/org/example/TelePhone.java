package org.example;

// Diagrams on resources folder
public class TelePhone extends IPhone {
    private Boolean isInUse;

    public Boolean isInUse() {
        return isInUse;
    }

    public void setInUse(Boolean inUse) {
        isInUse = inUse;
    }
}
