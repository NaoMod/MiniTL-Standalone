package org.tetrabox.example.server.lrp;

public class BreakpointType {
    private String id;
    private String name;
    private String targetElementTypeId;
    private String description;
    private boolean isDefault;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTargetElementTypeId() {
        return targetElementTypeId;
    }

    public void setTargetElementTypeId(String targetElementTypeId) {
        this.targetElementTypeId = targetElementTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }
}
