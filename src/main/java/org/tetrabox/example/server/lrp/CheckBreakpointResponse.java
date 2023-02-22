package org.tetrabox.example.server.lrp;

public class CheckBreakpointResponse {
    private boolean isActivated;
    private String message;

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean isActivated) {
        this.isActivated = isActivated;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
