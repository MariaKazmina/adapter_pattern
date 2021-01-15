package com.company;

public class OldPiano implements Piano {
    @Override
    public void makeSound() {
        System.out.println("Там там там");
    }

    @Override
    public void open() {
        System.out.println("Открытие крышки");
    }

    @Override
    public void close() {
        System.out.println("Закрытие крышки");
    }
}
