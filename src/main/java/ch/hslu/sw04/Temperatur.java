/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw04;

/**
 *
 * @author Flavio Waser
 */
public class Temperatur {
    
    /*
    * Attributte definieren
    */
    private double tempCelsius;
    private double tempKelvin;
    private double tempFahrenheit;
    private double relativeChange;
    
    /**
     * Konstruktor der Klasse Temperatur
     */
    public Temperatur(){
        this.tempCelsius = 20;
        tempFahrenheit = getTempFahrenheitFromCelsius(tempCelsius);
        tempKelvin = getTempKelvinFromCelsius(tempCelsius);
    }
    
    /**
     * Überladener Konstruktor der Klasse Temperatur
     * @param tempCelsius der Wert, welcher als Starttemperatur dienen soll in Celsius
     */
    public Temperatur(double tempCelsius){
        this.tempCelsius = tempCelsius;
        tempFahrenheit = getTempFahrenheitFromCelsius(tempCelsius);
        tempKelvin = getTempKelvinFromCelsius(tempCelsius);        
    }
    
    /**
     * Die Temperatur von Celsius in umrechnen
     * @param tempCelsius  Temperatur in Celsius mitgeben
     * @return Temperatur in Klevin
     */
    public double getTempKelvinFromCelsius(double tempCelsius){
        this.tempCelsius = tempCelsius;
        tempKelvin = tempCelsius+273.15;
        return tempKelvin;
    }
    
    /**
     * Die Termpatur von Celsius in Fahrenheit umrechnen
     * @param tempCelsius  Temperatur in Celsius mitgeben
     * @return Temperatur in Fahrenheit 
     */
    public double getTempFahrenheitFromCelsius(double tempCelsius){
        this.tempCelsius = tempCelsius;
        tempFahrenheit = tempCelsius * 1.8 +32;
        return tempFahrenheit;
    }
    
    /**
     * Die Termpatur von Fahrenheit in Celsius umrechnen
     * @param tempFahrenheit Temperatur in Fahrenheit mitgeben
     * @return Temperatur in Celsius
     */
    public double getTempCelsiusFromFahrenheit(double tempFahrenheit){
        this.tempFahrenheit = tempFahrenheit;
        tempCelsius = tempFahrenheit / 1.8 - 32;
        return tempCelsius;
    }
    
    /**
     * Die Termpatur von Kelvin in Celsius umrechnen
     * @param tempKelvin Temperatur in Kelvin mitgeben
     * @return Temperatur in Celsius
     */
    public double getTempCelsiusFromKelvin(double tempKelvin){
        this.tempKelvin = tempKelvin;
        tempCelsius = tempKelvin - 273.15;
        return tempCelsius;
    }

   /**
    * Aktueller Wert tempCelsius zurückgeben
    * @return Temperatur  Celsius
    */
    public double getTempCelsius() {
        return tempCelsius;
    }

    /**
     * Aktueller Wert tempKelvin zurückgeben
     * @return Temperatur Kelvin
     */
    public double getTempKelvin() {
        return tempKelvin;
    }

    /**
     * Aktueller Wert tempFahrenheit zurückgeben
     * @return Temperatur Fahrenheit
     */
    public double getTempFahrenheit() {
        return tempFahrenheit;
    }

    /**
     * Spezifizierter Wert als Temperatur Celsius setzen
     * @param tempCelsius Neuer Wert Temperatur Celsius
     */
    public void setTempCelsius(double tempCelsius) {
        this.tempCelsius = tempCelsius;
    }
    
    /**
     * Relativen Wert verändern in Celsius
     * @param relativeChange Parameter Veränderung
     */
    public void setTempCelsiusRelative(double relativeChange){
        this.relativeChange = relativeChange;
        tempCelsius = tempCelsius + (relativeChange);
        
        // Umrechnen der anderen zwei Varianten
        tempFahrenheit = getTempFahrenheitFromCelsius(tempCelsius);
        tempKelvin = getTempKelvinFromCelsius(tempCelsius);
    }
    
    /**
     * Relativen Wert verändern in Fahrenheit
     * @param relativeChange Parameter Veränderung
     */
    public void setTempFahrenheitRelative(double relativeChange){
        this.relativeChange = relativeChange;
        tempFahrenheit = tempFahrenheit + (relativeChange);
        
        // Umrechnen der anderen zwei Varianten
        tempCelsius = getTempCelsiusFromFahrenheit(tempFahrenheit);
        tempKelvin = getTempKelvinFromCelsius(tempCelsius);
    }
    
    /**
     * Relativen Wert verändern in Kelvin
     * @param relativeChange Parameter Veränderung
     */
    public void setTempKelvinRelative(double relativeChange){
        this.relativeChange = relativeChange;
        tempKelvin = tempKelvin + (relativeChange);
        
        // Umrechnen der anderen zwei Varianten
        tempCelsius = getTempCelsiusFromKelvin(tempKelvin);
        tempFahrenheit = getTempFahrenheitFromCelsius(tempCelsius);
    }
    
    /**
     * Aggregationsstatus zurückgeben
     * @param element die Abkürzung des Elementes als Parameter mitgeben
     * @return Den Status des Elementes mitgeben in Bezug auf die aktuelle Temperatur
     */
    public String getStateOfAggregation(String element){
        
        float meltingPoint;
        float boilingPoint;
        
        switch (element) {
            case "N":
                meltingPoint = -209.86f;
                boilingPoint = -196f;
                break;
            case "Hg":
                meltingPoint = -38.72f;
                boilingPoint = 357f;
                break;
            case "Pb":
                meltingPoint = 327.6f;
                boilingPoint = 1740f;
                break;
            default:
                return "Kein gültiges Element gefunden";
        }
        String state = "Fest";
        if(tempCelsius > boilingPoint){
            state =  "Gasförmig" ;
        } else if(tempCelsius > meltingPoint){
            state = "Flüssig";
        }
        return state;
    }
    
}
