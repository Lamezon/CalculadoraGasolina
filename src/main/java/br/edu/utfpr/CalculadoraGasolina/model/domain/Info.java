package br.edu.utfpr.CalculadoraGasolina.model.domain;

public class Info {
    private int kml;
    private int distance;
    private int gasValue;

    public Info(int kml, int distance, int gasValue){
        this.kml = kml;
        this.distance = distance;
        this.gasValue = gasValue;

    }


    public int getKml() {
        return kml;
    }

    public int getDistance() {
        return distance;
    }

    public int getGasValue() {
        return gasValue;
    }
}
