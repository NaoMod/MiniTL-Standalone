package org.tetrabox.example.server.lrp;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = ModelElementDeserializer.class)
public class ModelElement {
    private String id;
    private String type;
    private List<Entry<Either<ModelElement, List<ModelElement>>>> children;
    private List<Entry<Either<String, List<String>>>> refs;
    private List<Entry<Either<Object, List<Object>>>> attributes;
    private Location location;

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

    public List<Entry<Either<ModelElement, List<ModelElement>>>> getChildren() {
        return children;
    }

    public void setChildren(List<Entry<Either<ModelElement, List<ModelElement>>>> children) {
        this.children = children;
    }

    public List<Entry<Either<String, List<String>>>> getRefs() {
        return refs;
    }

    public void setRefs(List<Entry<Either<String, List<String>>>> refs) {
        this.refs = refs;
    }

    public List<Entry<Either<Object, List<Object>>>> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Entry<Either<Object, List<Object>>>> attributes) {
        this.attributes = attributes;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

}