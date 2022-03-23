/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw03;

/**
 *
 * @author Flavio Waser
 */
public class Temperatur {
    
    /*
    * Attributte 
    */
    private double tempCelsius;
    private double tempKelvin;
    private double tempFahrenheit;
    private double relativeChange;
    
    public Temperatur(){
        this.tempCelsius = 20;
        tempFahrenheit = getTempFahrenheitFromCelsius(tempCelsius);
        tempKelvin = getTempKelvinFromCelsius(tempCelsius);
    }
    
    public Temperatur(double tempCelsius){
        this.tempCelsius = tempCelsius;
        tempFahrenheit = getTempFahrenheitFromCelsius(tempCelsius);
        tempKelvin = getTempKelvinFromCelsius(tempCelsius);        
    }
    
    public double getTempKelvinFromCelsius(double tempCelsius){
        this.tempCelsius = tempCelsius;
        tempKelvin = tempCelsius+273.15;
        return tempKelvin;
    }
    
    public double getTempFahrenheitFromCelsius(double tempCelsius){
        this.tempCelsius = tempCelsius;
        tempFahrenheit = tempCelsius * 1.8 +32;
        return tempFahrenheit;
    }
    
    public double getTempCelsiusFromFahrenheit(double tempFahrenheit){
        this.tempFahrenheit = tempFahrenheit;
        tempCelsius = tempFahrenheit / 1.8 - 32;
        return tempCelsius;
    }
    
    public double getTempCelsiusFromKelvin(double tempKelvin){
        this.tempKelvin = tempKelvin;
        tempCelsius = tempKelvin - 273.15;
        return tempCelsius;
    }

    public double getTempCelsius() {
        return tempCelsius;
    }

    public double getTempKelvin() {
        return tempKelvin;
    }

    public double getTempFahrenheit() {
        return tempFahrenheit;
    }

    public void setTempCelsius(double tempCelsius) {
        this.tempCelsius = tempCelsius;
    }
    
    public void setTempCelsiusRelative(double relativeChange){
        this.relativeChange = relativeChange;
        tempCelsius = tempCelsius + (relativeChange);
        
        // Umrechnen der anderen zwei Varianten
        tempFahrenheit = getTempFahrenheitFromCelsius(tempCelsius);
        tempKelvin = getTempKelvinFromCelsius(tempCelsius);
    }
    
    public void setTempFahrenheitRelative(double relativeChange){
        this.relativeChange = relativeChange;
        tempFahrenheit = tempFahrenheit + (relativeChange);
        
        // Umrechnen der anderen zwei Varianten
        tempCelsius = getTempCelsiusFromFahrenheit(tempFahrenheit);
        tempKelvin = getTempKelvinFromCelsius(tempCelsius);
    }
    
    public void setTempKelvinRelative(double relativeChange){
        this.relativeChange = relativeChange;
        tempKelvin = tempKelvin + (relativeChange);
        
        // Umrechnen der anderen zwei Varianten
        tempCelsius = getTempCelsiusFromKelvin(tempKelvin);
        tempFahrenheit = getTempFahrenheitFromCelsius(tempCelsius);
    }
    
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
