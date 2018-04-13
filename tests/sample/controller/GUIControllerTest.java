package sample.controller;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GUIControllerTest {

    @Test
    void isPrimeTest() {
        GUIController guiController = new GUIController();
        int[] potentialPrimes = new int[]{2, 3, 5, 7, 11, 13, 17, 23, 29};
        int[] notPotentialPrimes = new int[]{4, 10, 12, 15, 21, 35};

        for (int prime : potentialPrimes
                ) {
            assertTrue(guiController.isPrime(prime));
        }

        for (int prime : notPotentialPrimes
                ) {
            assertFalse(guiController.isPrime(prime));
        }
    }
}
