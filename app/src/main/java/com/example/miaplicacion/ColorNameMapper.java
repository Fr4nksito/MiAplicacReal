package com.example.miaplicacion;

import java.util.HashMap;
import java.util.Map;

public class ColorNameMapper {
    private static final Map<String, String> colorMap = new HashMap<>();

    static {
        // Añade colores en formato HEX aquí
        colorMap.put("000000", "Negro");
        colorMap.put("FFFFFF", "Blanco");
        colorMap.put("FF0000", "Rojo");
        colorMap.put("00FF00", "Verde");
        colorMap.put("0000FF", "Azul");
        colorMap.put("FFFF00", "Amarillo");
        colorMap.put("FF00FF", "Magenta");
        colorMap.put("00FFFF", "Cian");
        colorMap.put("800000", "Marrón");
        colorMap.put("808000", "Oliva");
        colorMap.put("008000", "Verde Oscuro");
        colorMap.put("800080", "Púrpura");
        colorMap.put("008080", "Turquesa");
        colorMap.put("000080", "Azul Marino");
        colorMap.put("808080", "Gris");
        colorMap.put("C0C0C0", "Plata");
        colorMap.put("FFA500", "Naranja");
        colorMap.put("A52A2A", "Marrón Rojizo");
        colorMap.put("FFFFF0", "Marfil");
        colorMap.put("F0E68C", "Caqui");
        colorMap.put("E6E6FA", "Lavanda");
        colorMap.put("FFFACD", "Limón");
        colorMap.put("ADD8E6", "Azul Claro");
        colorMap.put("F08080", "Coral Claro");
        colorMap.put("E0FFFF", "Cian Claro");
        colorMap.put("D8F8B8", "Verde lanquecino");
        colorMap.put("f80000", " Rojo brillante");
        // Añadir más colores según sea necesario
    }

    public static String getColorNameFromHex(String hexColor) {
        return colorMap.getOrDefault(hexColor.toUpperCase(), "Una variante de color sin nombre");
    }

    // Convierte un color RGB a formato HEX
    public static String rgbToHex(int rgbColor) {
        return String.format("%06X", (0xFFFFFF & rgbColor));
    }
}
