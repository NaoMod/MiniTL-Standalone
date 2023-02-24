package org.tetrabox.example.server;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;
import org.tetrabox.example.MinitlStandaloneSetup;
import org.tetrabox.example.server.exceptions.ParseException;
import org.tetrabox.example.server.lrp.ParseArguments;

public class LRPHandlerTest {
    
    private ILRPHandler lrpHandler;

    @Before
    public void initialize() {
        lrpHandler = new LRPHandler();
    }

    @Test
    public void parseTest() throws FileNotFoundException, ParseException {
        MinitlStandaloneSetup.doSetup();
        
        String transfoPath = getClass().getResource("/server/simpleAtoB.minitl").getPath();
        ParseArguments args = new ParseArguments();
        args.setSourceFile(transfoPath);

        lrpHandler.parse(args);
    }

    /* @Test
    public void parseTest() throws FileNotFoundException, ParseException {
        MinitlStandaloneSetup.doSetup();
        
        String transfoPath = getClass().getResource("/smallTransfo.xmi").getPath();
        ParseArguments args = new ParseArguments();
        args.setSourceFile(transfoPath);

        lrpHandler.parse(args);
    } */
}
