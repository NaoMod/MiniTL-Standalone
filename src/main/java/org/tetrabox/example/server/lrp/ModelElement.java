package org.tetrabox.example.server.lrp;

import java.util.Map;

import org.tetrabox.example.minitl.Transformation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class ModelElement {
    private String id;
    private String type;
    private Map<String, Either<ModelElement, ModelElement[]>> children;
    private Map<String, Either<String, String[]>> refs;
    private Map<String, Either<Object, Object[]>> attributes;

    @JsonInclude(Include.NON_NULL)
    private Location location;

    public ModelElement() {
        super();
    }

    public ModelElement(Transformation transformation) {
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Either<ModelElement, ModelElement[]>> getChildren() {
        return children;
    }

    public void setChildren(Map<String, Either<ModelElement, ModelElement[]>> children) {
        this.children = children;
    }

    public Map<String, Either<String, String[]>> getRefs() {
        return refs;
    }

    public void setRefs(Map<String, Either<String, String[]>> refs) {
        this.refs = refs;
    }

    public Map<String, Either<Object, Object[]>> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Either<Object, Object[]>> attributes) {
        this.attributes = attributes;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}