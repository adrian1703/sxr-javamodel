package sxr.core.model.interfaces;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface XmlElement {
    String  term();
    String  btRef();
    Class   type();
    int     order();
    int     min();
    int     max();
}
