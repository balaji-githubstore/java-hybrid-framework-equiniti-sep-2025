package com.eq.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ZDemo3Json {

	public static void main(String[] args) throws IOException {
	    
		FileInputStream file=new FileInputStream("test-data/data.json");

        ObjectMapper mapper=new ObjectMapper();
        JsonNode json=mapper.readTree(file);
        
        System.out.println(json.get("browser").asText());
        
        System.out.println(json.get("validData").get(0).get("username").asText());
        
        System.out.println(json.get("validData1"));
        System.out.println(json.get("validData1").get(0));
        
        int testCaseCount=json.get("validData1").size();
        int parameterCount=json.get("validData1").get(0).size();
        Object[][] data=new Object[testCaseCount][parameterCount];
        
       for(int i=0;i<testCaseCount;i++)
       {
    	   		for(int j=0;j<parameterCount;j++)
    	   		{
    	   			data[i][j]=json.get("validData1").get(i).get(j).asText();
    	   			
    	   		}
       }
       
       System.out.println();
	}
}
