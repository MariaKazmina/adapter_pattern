package com.company;

public class ModernSynthesizer implements Synthesizer{

    @Override
    public void makeSound() {
        System.out.println("Звуки синтезатора");
    }

    @Override
    public void on() {
        System.out.println("Включение синтезатора");
    }

    @Override
    public void off() {
        System.out.println("Выключение синтезатора");
    }
}
