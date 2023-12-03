package com.example.miaplicacion;

import android.graphics.Color;

import java.util.HashMap;
import java.util.Map;

public class ColorNameMapper {
    private static final Map<String, String> colorMap = new HashMap<>();
// Colores en formato HEX
    static {
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
        colorMap.put("FA8072", "Salmón");
        colorMap.put("FF6347", "Tomate");
        colorMap.put("FF4500", "Naranja Rojizo");
        colorMap.put("2E8B57", "Verde Mar");
        colorMap.put("4682B4", "Azul Acero");
        colorMap.put("D2B48C", "Bronceado");
        colorMap.put("008B8B", "Cian Oscuro");
        colorMap.put("B8860B", "Dorado");
        colorMap.put("32CD32", "Lima");
        colorMap.put("FFD700", "Oro");
        colorMap.put("DA70D6", "Orquídea");
        colorMap.put("7B68EE", "Azul Medianoche");
        colorMap.put("6B8E23", "Verde Oliva");
        colorMap.put("FFB6C1", "Rosa Claro");
        colorMap.put("FF69B4", "Rosa Caliente");
        colorMap.put("CD5C5C", "Rojo Indio");
        colorMap.put("4B0082", "Índigo");
        colorMap.put("F0FFF0", "Miel");
        colorMap.put("F5FFFA", "Menta");
        colorMap.put("FFE4E1", "Rosa Niebla");
        colorMap.put("FFE4B5", "Melocotón");
        colorMap.put("FFDEAD", "Blanco Navajo");
        colorMap.put("FFF8DC", "Maíz");
        colorMap.put("F5F5DC", "Beige");
        colorMap.put("FFFACD", "Limón Chiffon");
        colorMap.put("FAFAD2", "Luz Dorada");
        colorMap.put("D3D3D3", "Gris Claro");
        colorMap.put("90EE90", "Verde Claro");
        colorMap.put("FFB6C1", "Rosa Claro");
        colorMap.put("FFA07A", "Salmón Claro");
        colorMap.put("20B2AA", "Verde Mar Claro");
        colorMap.put("87CEFA", "Azul Cielo Claro");
        colorMap.put("778899", "Gris Pizarra Claro");
        colorMap.put("B0C4DE", "Azul Acero Claro");
        colorMap.put("FFFFE0", "Amarillo Claro");
        colorMap.put("00FF7F", "Primavera");
        colorMap.put("7CFC00", "Verde Césped");
        colorMap.put("00FA9A", "Verde Primavera Medio");
        colorMap.put("48D1CC", "Turquesa Medio");
        colorMap.put("C71585", "Rojo Violeta Medio");
        colorMap.put("191970", "Azul Medianoche");
        colorMap.put("F5F5F5", "Blanco Humo");
        colorMap.put("FFE4B5", "Moca");
        colorMap.put("FFDEAD", "Blanco Antiguo");
        colorMap.put("FDF5E6", "Blanco Viejo");
        colorMap.put("6B8E23", "Oliva Drab");
        colorMap.put("FF4500", "Rojo Naranja");
        colorMap.put("DA70D6", "Orquídea Mediana");
        colorMap.put("EEE8AA", "Paja");
        colorMap.put("98FB98", "Verde Pálido");
        colorMap.put("AFEEEE", "Turquesa Pálido");
        colorMap.put("DB7093", "Violeta Pálido");
        colorMap.put("FFEFD5", "Papaya");
        colorMap.put("FFDAB9", "Melocotón Pálido");
        colorMap.put("CD853F", "Perú");
        colorMap.put("FFC0CB", "Rosa");
        colorMap.put("DDA0DD", "Ciruela");
        colorMap.put("B0E0E6", "Azul Polvo");
        colorMap.put("BC8F8F", "Rosa Marrón");
        colorMap.put("4169E1", "Azul Real");
        colorMap.put("8B4513", "Saddlebrown");
        colorMap.put("FA8072", "Salmón");
        colorMap.put("F4A460", "Sandybrown");
        colorMap.put("2E8B57", "Verde Mar");
        colorMap.put("A0522D", "Sienna");
        colorMap.put("C0C0C0", "Plata");
        colorMap.put("87CEEB", "Azul Cielo");
        colorMap.put("6A5ACD", "Pizarra Azul");
        colorMap.put("708090", "Pizarra Gris");
        colorMap.put("FFFAFA", "Nieve");
        colorMap.put("00FF7F", "Primavera Verde");
        colorMap.put("4682B4", "Azul Acero");
        colorMap.put("D2B48C", "Bronceado");
        colorMap.put("D8BFD8", "Thistle");
        colorMap.put("FF6347", "Tomate");
        colorMap.put("40E0D0", "Turquesa");
        colorMap.put("EE82EE", "Violeta");
        colorMap.put("F5DEB3", "Trigo");
        colorMap.put("FFFFFF", "Blanco");
        colorMap.put("F5F5F5", "Blanco Humo");
        colorMap.put("FFFF00", "Amarillo");
        colorMap.put("9ACD32", "Amarillo Verde");
        colorMap.put("D8F8B8", "Verde lanquecino");
        //colorMap.put("F80000", " Rojo brillante");
        //colorMap.put("181018", " Oscuro magenta.");
        //colorMap.put("F0F0F0", "Blanco");


    }

    public static String getColorNameFromHex(String hexColor) {
        return colorMap.getOrDefault(hexColor.toUpperCase(), "Una variante de color sin nombre");
    }

    // Convierte un color RGB a formato HEX
    public static String rgbToHex(int rgbColor) {
        return String.format("%06X", (0xFFFFFF & rgbColor));
    }
    public static String getClosestColorName(int color) {
        int minDistance = Integer.MAX_VALUE;
        String closestColorName = "Una variante de color sin nombre";

        for (Map.Entry<String, String> entry : colorMap.entrySet()) {
            int distance = colorDistance(color, Color.parseColor("#" + entry.getKey()));
            if (distance < minDistance) {
                minDistance = distance;
                closestColorName = entry.getValue();
            }
        }
        return closestColorName;
    }

    // Método para calcular la distancia del color
    private static int colorDistance(int color1, int color2) {
        int red1 = Color.red(color1);
        int green1 = Color.green(color1);
        int blue1 = Color.blue(color1);
        int red2 = Color.red(color2);
        int green2 = Color.green(color2);
        int blue2 = Color.blue(color2);

        int redDistance = red1 - red2;
        int greenDistance = green1 - green2;
        int blueDistance = blue1 - blue2;

        return (redDistance * redDistance + greenDistance * greenDistance + blueDistance * blueDistance);
    }
}
