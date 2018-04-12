package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.*;
import java.util.List;

public class GUIController {

    @FXML private TextField limit;

    public List<Integer> generatePrimes() {
        int n = Integer.parseInt(limit.getText());
        List<Integer> primeNumbers = new LinkedList<>();
        if (n >= 2) {
            primeNumbers.add(2);
        }
        for (int i = 3; i <= n; i += 2) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        for (int i : primeNumbers
             ) {
            System.out.println(i);

        }
        return primeNumbers;
    }

    private boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}


