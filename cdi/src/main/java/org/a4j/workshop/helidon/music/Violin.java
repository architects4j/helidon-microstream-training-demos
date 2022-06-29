package org.a4j.workshop.helidon.music;

@MusicalInstrument(InstrumentType.STRING)
class Violin implements Instrument {
    @Override
    public String sound() {
        return "violin";
    }
}
