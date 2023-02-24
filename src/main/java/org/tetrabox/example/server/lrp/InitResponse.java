package org.tetrabox.example.server.lrp;

import java.util.List;

public class InitResponse {
    private boolean isExecutionDone;
    private List<BreakpointType> breakpointTypes;

    public boolean isExecutionDone() {
        return isExecutionDone;
    }

    public void setExecutionDone(boolean isExecutionDone) {
        this.isExecutionDone = isExecutionDone;
    }

    public List<BreakpointType> getBreakpointTypes() {
        return breakpointTypes;
    }

    public void setBreakpointTypes(List<BreakpointType> breakpointTypes) {
        this.breakpointTypes = breakpointTypes;
    }
}
