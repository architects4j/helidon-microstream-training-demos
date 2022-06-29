package org.a4j.workshop.helidon.cdi.music;

@MusicalInstrument(InstrumentType.PERCUSSION)
class Xylophone implements Instrument {
    @Override
    public String sound() {
        return "xylophone";
    }
}
