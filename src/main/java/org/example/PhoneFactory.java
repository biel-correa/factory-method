package org.example;

// Diagrams on resources folder
public class PhoneFactory {
    public static IPhone getPhone(String type) {
        Class phone = null;
        Object object = null;

        try {
            phone = Class.forName(String.format("org.example.FactoryMethod.%sPhone", type));
            object = phone.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Phone doesn't exist");
        }

        if (!(object instanceof IPhone)) {
            throw new IllegalArgumentException("Invalid phone");
        }

        return (IPhone) object;
    }
}
