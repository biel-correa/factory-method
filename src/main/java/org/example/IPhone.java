package org.example;

// Diagrams on resources folder
public abstract class IPhone {
    public String number;

    public String makeCall(String number) {
        return "Calling: " + this.number;
    };

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
