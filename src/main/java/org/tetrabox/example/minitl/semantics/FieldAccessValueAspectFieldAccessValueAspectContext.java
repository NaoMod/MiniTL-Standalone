package org.tetrabox.example.minitl.semantics;

import java.util.Map;
import org.tetrabox.example.minitl.FieldAccessValue;

@SuppressWarnings("all")
public class FieldAccessValueAspectFieldAccessValueAspectContext {
  public static final FieldAccessValueAspectFieldAccessValueAspectContext INSTANCE = new FieldAccessValueAspectFieldAccessValueAspectContext();
  
  public static FieldAccessValueAspectFieldAccessValueAspectProperties getSelf(final FieldAccessValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.minitl.semantics.FieldAccessValueAspectFieldAccessValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FieldAccessValue, FieldAccessValueAspectFieldAccessValueAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.minitl.FieldAccessValue, org.tetrabox.example.minitl.semantics.FieldAccessValueAspectFieldAccessValueAspectProperties>();
  
  public Map<FieldAccessValue, FieldAccessValueAspectFieldAccessValueAspectProperties> getMap() {
    return map;
  }
}
