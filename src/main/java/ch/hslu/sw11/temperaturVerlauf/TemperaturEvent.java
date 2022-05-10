package ch.hslu.sw11.temperaturVerlauf;

import java.util.EventObject;

public class TemperaturEvent extends EventObject {

    private TemperaturState temperaturState;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public TemperaturEvent(Object source, TemperaturState temperaturState) {
        super(source);

        this.temperaturState = temperaturState;
    }

    public TemperaturState getTemperaturState() {
        return temperaturState;
    }
}
