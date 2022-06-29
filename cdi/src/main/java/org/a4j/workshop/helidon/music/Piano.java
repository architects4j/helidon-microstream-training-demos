package org.a4j.workshop.helidon.music;

import javax.enterprise.inject.Default;

@MusicalInstrument(InstrumentType.KEYBOARD)
@Default
class Piano implements Instrument {
    @Override
    public String sound() {
        return "piano";
    }
}
