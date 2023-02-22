package org.tetrabox.example.server.lrp;

import java.util.List;

public class InitResponse {
    private List<BreakpointType> breakpointTypes;
    //private Step nextCompletedStep;

    public List<BreakpointType> getBreakpointTypes() {
        return breakpointTypes;
    }

    public void setBreakpointTypes(List<BreakpointType> breakpointTypes) {
        this.breakpointTypes = breakpointTypes;
    }
}
