package com.otaviojava.workshop.microstream.helidon.music;

@MusicalInstrument(InstrumentType.PERCUSSION)
class Xylophone implements Instrument {
    @Override
    public String sound() {
        return "xylophone";
    }
}
