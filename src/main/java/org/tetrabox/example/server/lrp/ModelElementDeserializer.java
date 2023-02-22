package org.tetrabox.example.server.lrp;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class ModelElementDeserializer extends StdDeserializer<ModelElement> {

    public ModelElementDeserializer() {
        this(null);
    }

    public ModelElementDeserializer(Class<?> vc) {
        super(vc);
    }

    @SuppressWarnings("unchecked")
    @Override
    public ModelElement deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
        JsonNode node = p.getCodec().readTree(p);
        ModelElement modelElement = new ModelElement();

        modelElement.setId(node.get("id").asText());
        modelElement.setType(node.get("type").asText());

        modelElement.setAttributes((List<Entry<Either<Object, List<Object>>>>) node.get("attributes").traverse(p.getCodec()).readValueAs(List.class));
        /*
         * modelElement.setChildren(node.get("children").traverse().readValueAs(List.
         * class));
         * modelElement.setRefs(node.get("refs").traverse().readValueAs(List.class));
         */

        JsonNode location = node.get("location");
        modelElement.setLocation(location != null ? location.traverse().readValueAs(Location.class) : null);

        return modelElement;
    }

}
