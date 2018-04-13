package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.*;
import java.util.List;

public class GUIController {

    private LocationChooser locationChooser = new LocationChooser(new FileCreater());
    @FXML private TextField limit;
    @FXML private Label wrongInput;


    public List<Integer> generatePrimes() {
        List<Integer> primeNumbers = new LinkedList<>();
        wrongInput.setText("");
        try{
            int n = Integer.parseInt(limit.getText());

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
            locationChooser.chooseLocation(primeNumbers);
        }
        catch(NumberFormatException nfe){
            wrongInput.setText("Wrong Input!");
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


