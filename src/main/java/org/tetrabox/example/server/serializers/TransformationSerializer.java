package org.tetrabox.example.server.serializers;

import java.io.IOException;

import org.tetrabox.example.minitl.Transformation;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class TransformationSerializer extends StdSerializer<Transformation> {

    public TransformationSerializer() {
        this(null);
    }

    public TransformationSerializer(Class<Transformation> c) {
        super(c);
    }

    @Override
    public void serialize(Transformation value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'serialize'");
    }
    
}
