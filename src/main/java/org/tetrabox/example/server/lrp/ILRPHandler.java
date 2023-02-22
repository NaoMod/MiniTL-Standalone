package org.tetrabox.example.server.lrp;

import com.googlecode.jsonrpc4j.JsonRpcParam;

public interface ILRPHandler {
   ModelElement parse(@JsonRpcParam(value = "params") String sourceFile);

   InitResponse initExecution(@JsonRpcParam(value = "params") InitArguments params);

   StepResponse nextStep(@JsonRpcParam(value = "params") String sourceFile);

   ModelElement getRuntimeState(@JsonRpcParam(value = "params") String sourceFile);

   CheckBreakpointResponse checkBreakpoint(@JsonRpcParam(value = "params") CheckBreakpointArgs params);
}
