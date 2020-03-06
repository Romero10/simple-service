package com.spring.service;

public class CheckNumberService {

    private int number;

    public CheckNumberService(int number) {
        this.number = number;
    }

    public String oddOrEvenNumber() {
        if (isEven()) {
            return "Число " + number + " - четное!";
        } else {
            return "Число " + number + " - нечетное!";
        }
    }

    private boolean isEven() {
        return number % 2 == 0;
    }

}
