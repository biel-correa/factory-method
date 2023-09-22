package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneFactoryTest {

    @Test
    public void shouldReturnSmartPhone() {
        SmartPhone phone = (SmartPhone) PhoneFactory.getPhone("Smart");
        phone.setBatteryPercentage(100f);
        assertEquals(100f, phone.getBatteryPercentage());
    }

    @Test
    public void shouldReturnTelePhone() {
        TelePhone phone = (TelePhone) PhoneFactory.getPhone("Tele");
        phone.setInUse(true);
        assertEquals(true, phone.isInUse());
    }

    @Test
    public void shouldReturnPhoneDoesntExist() {
        try {
            IPhone phone = PhoneFactory.getPhone("NotExists");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Phone doesn't exist", e.getMessage());
        }
    }

    @Test
    public void shouldReturnPhoneInvalid() {
        try {
            IPhone phone = PhoneFactory.getPhone("Alien");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid phone", e.getMessage());
        }
    }
}