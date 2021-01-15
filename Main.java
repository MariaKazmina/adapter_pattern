package com.company;

public class Main {

    public static void main(String[] args) {
        OldPiano oldPiano = new OldPiano();
        ModernSynthesizer modernSynthesizer = new ModernSynthesizer();

        Piano adapter = new AdapterPianoToSynthesizer(modernSynthesizer);

        System.out.println("Синтезатор: ");
        modernSynthesizer.makeSound();
        modernSynthesizer.on();
        modernSynthesizer.off();

        System.out.println("\n Пианино: ");
        testPiano(oldPiano);

        System.out.println("\n Адаптер:");
        testPiano(adapter);
    }
    static void testPiano(Piano piano){
        piano.makeSound();
        piano.open();
        piano.close();
    }
}
