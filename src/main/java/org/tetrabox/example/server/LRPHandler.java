package org.tetrabox.example.server;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.tetrabox.example.minitl.Transformation;
import org.tetrabox.example.server.lrp.CheckBreakpointArguments;
import org.tetrabox.example.server.lrp.CheckBreakpointResponse;
import org.tetrabox.example.server.lrp.GetRuntimeStateArguments;
import org.tetrabox.example.server.lrp.GetRuntimeStateResponse;
import org.tetrabox.example.server.lrp.InitArguments;
import org.tetrabox.example.server.lrp.InitResponse;
import org.tetrabox.example.server.lrp.ModelElement;
import org.tetrabox.example.server.lrp.ParseArguments;
import org.tetrabox.example.server.lrp.ParseResponse;
import org.tetrabox.example.server.lrp.StepArguments;
import org.tetrabox.example.server.lrp.StepResponse;

public class LRPHandler implements ILRPHandler {

    private ASTRegistry astRegistry;

    public LRPHandler() {
        astRegistry = new ASTRegistry();
    }

    @Override
    public ParseResponse parse(ParseArguments args) {
        // Loading transformation model
        URI transfoFileURI = URI.createFileURI(args.getSourceFile());
        ResourceSet rs = new ResourceSetImpl();
        Resource transfoResource = rs.getResource(transfoFileURI, true);
        Transformation transformation = (Transformation) transfoResource.getContents().get(0);

        astRegistry.setAST(args.getSourceFile(), transformation);

        return new ParseResponse(new ModelElement(transformation));
    }

    /* @Override
    public ParseResponse parse(ParseArguments args) {
        // Loading transformation model
        URI transfoFileURI = URI.createFileURI(args.getSourceFile());
        ResourceSet rs = new ResourceSetImpl();
        Resource transfoResource = rs.getResource(transfoFileURI, true);
        Transformation transformation = (Transformation) transfoResource.getContents().get(0);

        astRegistry.setAST(args.getSourceFile(), transformation);

        return new ParseResponse(new ModelElement(transformation));
    } */

    @Override
    public InitResponse initExecution(InitArguments args) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StepResponse nextStep(StepArguments args) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetRuntimeStateResponse getRuntimeState(GetRuntimeStateArguments args) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CheckBreakpointResponse checkBreakpoint(CheckBreakpointArguments args) {
        // TODO Auto-generated method stub
        return null;
    }
}
