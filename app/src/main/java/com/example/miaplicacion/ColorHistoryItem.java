package com.example.miaplicacion;

public class ColorHistoryItem {
    private String colorName;
    private String hexValue;
    private long timestamp;

    public ColorHistoryItem() {
        // Constructor vacío requerido por Firebase
    }

    public ColorHistoryItem(String colorName, String hexValue, long timestamp) {
        this.colorName = colorName;
        this.hexValue = hexValue;
        this.timestamp = timestamp;
    }

    // Getters y setters
    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getHexValue() {
        return hexValue;
    }

    public void setHexValue(String hexValue) {
        this.hexValue = hexValue;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}

