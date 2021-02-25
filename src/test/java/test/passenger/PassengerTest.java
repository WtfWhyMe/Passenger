package test.passenger;

import main.passenger.Passenger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerTest {
    List<Passenger> l1 = new ArrayList<>();
    @BeforeEach
    void setup(){
        Passenger p1 = new Passenger("Mr", "Sergey", "0123456789", "9876543210", 20);
        Passenger p2 = new Passenger("Dr", "df", "456", "156", 10);
        l1.add(p1);
        l1.add(p2);
    }

    @Test
    void testVerifyWrongTitle(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                l1.get(1).verifyTitle();
            }
        };
        assertThrows(IllegalArgumentException.class, ex);
    }
    @Test
    void testVerifyRightTitle(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                l1.get(0).verifyTitle();
            }
        };
        assertDoesNotThrow(ex);
    }


    @Test
    void testVerifyWrongName(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                l1.get(1).verifyName();
            }
        };
        assertThrows(IllegalArgumentException.class, ex);
    }
    @Test
    void testVerifyRightName(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                l1.get(0).verifyName();
            }
        };
        assertDoesNotThrow(ex);
    }

    @Test
    void testVerifyWrongId(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                l1.get(1).verifyId();
            }
        };
        assertThrows(IllegalArgumentException.class, ex);
    }
    @Test
    void testVerifyRightId(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                l1.get(0).verifyId();
            }
        };
        assertDoesNotThrow(ex);
    }

    @Test
    void testVerifyWrongPhone(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                l1.get(1).verifyPhone();
            }
        };
        assertThrows(IllegalArgumentException.class, ex);
    }
    @Test
    void testVerifyRightPhone(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                l1.get(0).verifyPhone();
            }
        };
        assertDoesNotThrow(ex);
    }

    @Test
    void testVerifyWrongAge(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                l1.get(1).verifyAge();
            }
        };
        assertThrows(IllegalArgumentException.class, ex);
    }
    @Test
    void testVerifyRightAge(){
        Executable ex = new Executable() {
            @Override
            public void execute() throws Throwable {
                l1.get(0).verifyAge();
            }
        };
        assertDoesNotThrow(ex);
    }

}
