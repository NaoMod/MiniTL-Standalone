package org.tetrabox.example.server;

import org.tetrabox.example.server.lrp.CheckBreakpointArguments;
import org.tetrabox.example.server.lrp.CheckBreakpointResponse;
import org.tetrabox.example.server.lrp.GetRuntimeStateArguments;
import org.tetrabox.example.server.lrp.GetRuntimeStateResponse;
import org.tetrabox.example.server.lrp.InitArguments;
import org.tetrabox.example.server.lrp.InitResponse;
import org.tetrabox.example.server.lrp.ParseArguments;
import org.tetrabox.example.server.lrp.ParseResponse;
import org.tetrabox.example.server.lrp.StepArguments;
import org.tetrabox.example.server.lrp.StepResponse;

import com.googlecode.jsonrpc4j.JsonRpcParam;

public interface ILRPHandler {

   ParseResponse parse(@JsonRpcParam(value = "params") ParseArguments args);

   InitResponse initExecution(@JsonRpcParam(value = "params") InitArguments args);

   StepResponse nextStep(@JsonRpcParam(value = "params") StepArguments args);

   GetRuntimeStateResponse getRuntimeState(@JsonRpcParam(value = "params") GetRuntimeStateArguments args);

   CheckBreakpointResponse checkBreakpoint(@JsonRpcParam(value = "params") CheckBreakpointArguments args);
}
