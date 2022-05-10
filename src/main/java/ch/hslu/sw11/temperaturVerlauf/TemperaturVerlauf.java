package ch.hslu.sw11.temperaturVerlauf;

import ch.hslu.sw11.temperaturVerlauf.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemperaturVerlauf {

    List<Temperatur> temperaturArrayList = new ArrayList<>();

    // Datenstruktur zur Speicherung aller Listener.
    private final List<TemperaturEventListener> changeListeners = new ArrayList<TemperaturEventListener>();

    public final void add(final Temperatur temperatur){

        temperaturArrayList.add(temperatur);

        if (temperaturArrayList.size() > 1){
            Temperatur minTemperatur = min();
            Temperatur maxTemperatur = max();

            if (minTemperatur.equals(temperatur)){
                final TemperaturEvent pcEvent = new TemperaturEvent(this, TemperaturState.MIN);
                this.fireTemperaturEvent(pcEvent);
            } else if (maxTemperatur.equals(temperatur)){
                final TemperaturEvent pcEvent = new TemperaturEvent(this, TemperaturState.MAX);
                this.fireTemperaturEvent(pcEvent);
            }
        }
    }

    public final void clear(){
        temperaturArrayList.clear();
    }

    public final int getCount(){
        return temperaturArrayList.size();
    }

    public final Temperatur get(final int index){
        return temperaturArrayList.get(index);
    }

    public final Temperatur max(){
        List<Temperatur> list = temperaturArrayList;

        if (list.size() > 0){
            Collections.sort(list, Collections.reverseOrder());
            return list.get(0);
        } else {
            return null;
        }
    }

    public final Temperatur sortMax(){
        if (temperaturArrayList.size() > 0){
            Collections.sort(temperaturArrayList, Collections.reverseOrder());
            return temperaturArrayList.get(0);
        } else {
            return null;
        }
    }

    public final Temperatur min(){
        List<Temperatur> list = temperaturArrayList;

        if (list.size() > 0){
            Collections.sort(list);
            return list.get(0);
        } else {
            return null;
        }
    }

    public final Temperatur sortMin(){
        if (temperaturArrayList.size() > 0){
            Collections.sort(temperaturArrayList);
            return temperaturArrayList.get(0);
        } else {
            return null;
        }
    }

    public final Temperatur durchschnitt(){
        float total = 0;
        int anz = 0;

        if (temperaturArrayList.size() > 0){
            for(final Temperatur temperatur : temperaturArrayList) {
                total += temperatur.getTempCelsius();
                anz++;
            }

            return Temperatur.createFromCelsius(total / anz);
        } else {
            return null;
        }
    }

    /**
     * Registriert einen TemperaturEventListener.
     * @param listener TemperaturEventListener.
     */
    public void addTemperaturEventListener(final TemperaturEventListener listener) {
        this.changeListeners.add(listener);
    }

    /**
     * Deregistriert einen TemperaturEventListener.
     * @param listener TemperaturEventListener.
     */
    public void removePropertyChangeListener(final TemperaturEventListener listener) {
        this.changeListeners.remove(listener);
    }

    /**
     * Informiert alle TemperaturEventListener über TemperaturEvent.
     * @param pcEvent TemperaturEvent.
     */
    private void fireTemperaturEvent(final TemperaturEvent pcEvent) {
        for (final TemperaturEventListener listener : this.changeListeners) {
            listener.temperaturEvent(pcEvent);
        }
    }
}
