package com.cs2340.WaterNet.Model;

/**
 * Created by pulki on 2/27/2017.
 */

public enum Virus {
    VIRUS("Contaminant", 0);
    String value;
    int ppm;
    Virus(String value, int ppm) {
        this.value = value;
        this.ppm = ppm;
    }
    void setPPM(int ppm) {
        this.ppm = ppm;
    }
    int getPPM() {
        return ppm;
    }
    String getValue() {
        return value;
    }
}