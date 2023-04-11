package json.deserialization;

import chapter15.json.deserialization.CatDeserializer;
import chapter15.json.serialization.Cat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class CatDeserializerTest {

   private  String catJson;
   private DateTimeFormatter formatter;

   private final LocalDateTime dateOfBirth = LocalDateTime.now().minusYears(20);


    @BeforeEach
    void setUp() {
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        catJson = "{\name\":\"Tom\",\"age\":20,\"dateOfBirth\":"+"\""+formatter.format(dateOfBirth)+"\""+"}";

    }

//    @Test
//   public void deserializationTest(){
//       Cat ologbo = CatDeserializer.deserializeJsonToCat(catJson);
//        assertNotNull(ologbo);
//        assertEquals("Morenike",ologbo.);
//
////
////    }
}