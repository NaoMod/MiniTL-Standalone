package org.tetrabox.example.server;

import java.util.HashMap;
import java.util.Map;

import org.tetrabox.example.minitl.Transformation;

public class ASTRegistry {

    private Map<String, Transformation> loadedSources;

    public ASTRegistry() {
        loadedSources = new HashMap<>();
    }

    public void setAST(String sourceFile, Transformation transformation) {
        loadedSources.put(sourceFile, transformation);
    }
}
