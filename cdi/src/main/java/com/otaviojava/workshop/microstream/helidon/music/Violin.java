package com.otaviojava.workshop.microstream.helidon.music;

@MusicalInstrument(InstrumentType.STRING)
class Violin implements Instrument {
    @Override
    public String sound() {
        return "violin";
    }
}
