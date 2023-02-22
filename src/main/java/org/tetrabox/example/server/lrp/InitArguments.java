package org.tetrabox.example.server.lrp;

import java.util.List;

public class InitArguments {
    private String sourceFile;
    private List<Entry<Object>> additionalArgs;

    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    public List<Entry<Object>> getAdditionalArgs() {
        return additionalArgs;
    }

    public void setAdditionalArgs(List<Entry<Object>> additionalArgs) {
        this.additionalArgs = additionalArgs;
    }
}
