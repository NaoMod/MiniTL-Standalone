package org.tetrabox.example.server;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.tetrabox.example.server.lrp.BreakpointType;
import org.tetrabox.example.server.lrp.ModelElement;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializationTest {

    private ObjectMapper mapper;

    @Before
    public void initialize() {
        mapper = new ObjectMapper();
    }

    @Test
    public void breakpointTypeDeserialize() throws JsonMappingException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
		BreakpointType bpt = mapper.readValue("{\"id\": \"a\", \"name\": \"A\", \"targetElementTypeId\": \"b\", \"description\": \"descr\", \"isDefault\": true}", BreakpointType.class);
        assertNotNull(bpt);
    }

    @Test
    public void modelElementDeserialize() throws JsonMappingException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
		ModelElement element = mapper.readValue("{\"id\": \"a\", \"type\": \"type\", \"children\": [], \"refs\": [], \"attributes\": [{ \"key\": \"k\", \"value\": 1}]}", ModelElement.class);
        assertNotNull(element);
    }
    
}
