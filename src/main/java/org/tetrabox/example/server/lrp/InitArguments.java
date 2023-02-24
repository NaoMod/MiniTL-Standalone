package org.tetrabox.example.server.lrp;

import java.util.Map;

public class InitArguments extends Arguments {
    private Map<String, Object> additionalArgs;

    public Map<String, Object> getAdditionalArgs() {
        return additionalArgs;
    }

    public void setAdditionalArgs(Map<String, Object> additionalArgs) {
        this.additionalArgs = additionalArgs;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof InitArguments))
            return false;

        InitArguments castObj = (InitArguments) obj;

        return getSourceFile().equals(castObj.getSourceFile()) && this.additionalArgs.equals(castObj.getAdditionalArgs());
    }
}
