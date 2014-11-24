package com.blogspot.toomuchcoding.jinkubator.groovy.beans.operators;

public class JavaClassWithPrivateField {
    private String hiddenField = "hidden";

    public String getHiddenField() {
        return "Surprise!";
    }
}
