package org.tetrabox.example.server;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.tetrabox.example.server.lrp.Either;
import org.tetrabox.example.server.lrp.ModelElement;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationTest { 
    private ObjectMapper mapper;

    @Before
    public void initialize() {
        mapper = new ObjectMapper();
    }

    @Test
    public void eitherSerialize() throws IOException {
        Either<String, String[]> leftEither = Either.forLeft("a");
        assertEquals("\"a\"", mapper.writeValueAsString(leftEither));

        String[] s = {"a", "b"};
        Either<String, String[]> rightEither = Either.forRight(s);
        assertEquals("[\"a\",\"b\"]", mapper.writeValueAsString(rightEither));
    }

    @Test
    public void modelElementSerialize() throws IOException {
        ModelElement element = new ModelElement();
        element.setId("a");
        element.setType("type");
        element.setChildren(new HashMap<>());
        element.setRefs(new HashMap<>());

        Map<String, Either<Object, Object[]>> attributes = new HashMap<>();
        attributes.put("k", Either.forLeft(1));
        element.setAttributes(attributes);
    }
}
