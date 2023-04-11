package chapter15.json.deserialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import chapter15.json.serialization.Cat;

import java.io.IOException;

public class CatDeserializer {


    public static void deserializeJsonToCat(String Json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.readValue(Json.getBytes(), Cat.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
