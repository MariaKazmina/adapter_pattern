package com.company;

public class AdapterPianoToSynthesizer implements Piano {
    Synthesizer synthesizer;

    public AdapterPianoToSynthesizer(Synthesizer synthesizer) {
        this.synthesizer = synthesizer;
    }

    @Override
    public void makeSound() {
        synthesizer.makeSound();
    }

    @Override
    public void open() {
        synthesizer.on();
    }

    @Override
    public void close() {
        synthesizer.off();
    }
}
