package com.eq.test;

import com.eq.model.TestData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ZAPIMapperModelTest {
    @Test
    public void mapModel() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        // read JSON into model
        TestData testData = mapper.readValue(new File("test-data/data.json"), TestData.class);

        System.out.println("Browser: " + testData.getBrowser());
        System.out.println("Browser: " + testData.getValidData().get(0).getUsername());
    }
}
