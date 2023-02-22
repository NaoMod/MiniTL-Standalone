package org.tetrabox.example;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;
import org.tetrabox.example.minitl.Transformation;
import org.tetrabox.example.minitl.semantics.TransformationAspect;

public class SimpleTransfoTest {

    @Test
    public void test() {
        MinitlStandaloneSetup.doSetup();

        // Loading transformation model
        URI transfoFileURI = URI.createFileURI(getClass().getResource("/smallTransfo.xmi").getPath());
        ResourceSet rs = new ResourceSetImpl();
        Resource transfoResource = rs.getResource(transfoFileURI, true);
        Transformation transformation = (Transformation) transfoResource.getContents().get(0);

        // Executing transformation on test input model
        String inputModelURIString = URI.createFileURI(getClass().getResource("/input_model.xmi").getPath()).toString();
        String outputModelFilePath = "src/test/out/output_model.xmi";
        List<String> transformationArgs = List.of(inputModelURIString, outputModelFilePath);
        TransformationAspect.initialize(transformation, transformationArgs);
        TransformationAspect.execute(transformation);

        int nbOutput = TransformationAspect.outputModel(transformation).size();
        assertEquals(nbOutput, 4);
    }
}
