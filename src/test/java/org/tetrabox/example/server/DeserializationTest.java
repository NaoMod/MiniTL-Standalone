package org.tetrabox.example.server;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.tetrabox.example.server.lrp.CheckBreakpointArguments;
import org.tetrabox.example.server.lrp.InitArguments;
import org.tetrabox.example.server.lrp.ParseArguments;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializationTest {

    private ObjectMapper mapper;

    @Before
    public void initialize() {
        mapper = new ObjectMapper();
    }

    @Test
    public void parseArgumentsDeserialize() throws IOException {
        String json = fileContentAsString("/server/parseArguments.json");
        ParseArguments args = mapper.readValue(json, ParseArguments.class);
        assertNotNull(args);

        ParseArguments expected = new ParseArguments();
        expected.setSourceFile("file.extension");

        assertEquals(expected, args);
    }

    @Test
    public void initArgumentsDeserialize() throws IOException {
        String json = fileContentAsString("/server/initArguments.json");
        InitArguments args = mapper.readValue(json, InitArguments.class);
        assertNotNull(args);

        InitArguments expected = new InitArguments();
        expected.setSourceFile("file.extension");
        Map<String, Object> additionalArgs = new HashMap<>();
        additionalArgs.put("a", 1);
        additionalArgs.put("b", "B");
        additionalArgs.put("c", true);
        additionalArgs.put("d", List.of(1, 2, 3));
        Map<String, Object> e = new HashMap<>();
        e.put("e1", true);
        e.put("e2", 1);
        additionalArgs.put("e", e);
        expected.setAdditionalArgs(additionalArgs);

        assertEquals(expected, args);
    }

    @Test
    public void checkBreakpointArgumentsDeserialize() throws IOException {
        String json = fileContentAsString("/server/checkBreakpointArguments.json");
        CheckBreakpointArguments args = mapper.readValue(json, CheckBreakpointArguments.class);
        assertNotNull(args);

        CheckBreakpointArguments expected = new CheckBreakpointArguments();
        expected.setSourceFile("file.extension");
        expected.setTypeId("bt");
        expected.setElementId("elemId");

        assertEquals(expected, args);
    }

    private String fileContentAsString(String name) throws IOException {
        return Files.readString(Path.of(getClass().getResource(name).getPath()));
    }
}
