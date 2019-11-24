package ru.imitation.culturemap.service;

import org.json.JSONObject;


import java.util.List;
import java.util.Map;

public class DataYandexAPI {

    public static String parseDB(List<Map<String, Object>> from_db){
        String start = "{\n" +
                "\"type\": \"FeatureCollection\",\n" +
                "   \"features\": [\n";
        String first_str = "        {\"type\": \"Feature\", \"id\": ";
        String second_str = ", \"geometry\": {\"type\": \"Point\", \"coordinates\": [";
        String third_str = "]}, \"properties\": {\"balloonContentHeader\": \"<font size=3><b>";
        String fourth_str = "</b></font>\", \"balloonContentBody\": \"<p>";
        String fifth_str = "</p>\"}}";
        String comma = ", ";
        String end = "";
        StringBuilder result = new StringBuilder();
        result.append(start);
        int k = 0;
        for (Map<String, Object> line : from_db) {
            for (int i = 0; i < line.size(); i ++){
                result.append(first_str);
                result.append(k);
                result.append(second_str);
                result.append(line.get("coordinatex"));
                result.append(comma);
                result.append(line.get("coordinatey"));
                result.append(third_str);
                result.append(line.get("name"));
                result.append(fourth_str);
                result.append(line.get("description"));
                result.append(fifth_str);
                if (i != line.size()) {
                    result.append(comma);
                }
                result.append("\n");
                k++;
            }
        }
        result.append("    ]\n" + "}");

        return result.toString();
    }

}
