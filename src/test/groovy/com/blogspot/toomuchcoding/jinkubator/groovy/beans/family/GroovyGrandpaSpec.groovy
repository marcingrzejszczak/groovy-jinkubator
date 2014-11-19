package com.blogspot.toomuchcoding.jinkubator.groovy.beans.family

import spock.lang.Specification

class GroovyGrandpaSpec extends Specification {

    def 'should produce a lot of code to check for null safety with Java'() {
        given:
            String expectedGrandsonName = 'John'
        and:
            JavaGrandpa javaGrandpa = new JavaGrandpa(new JavaGrandson(expectedGrandsonName))
        and:
            String grandsonName = null
            if(javaGrandpa.getJavaGrandson() != null) {
                grandsonName = javaGrandpa.getJavaGrandson().getName()
            }
        expect:
            grandsonName == expectedGrandsonName

    }

    def 'should make your life a beauty with Groovy'() {
        given:
            String expectedGrandsonName = 'John'
        and:
            GroovyGrandpa groovyGrandpa = new GroovyGrandpa(new GroovyGrandson(expectedGrandsonName))
        expect:
            groovyGrandpa.groovyGrandson?.name == expectedGrandsonName

    }

    def 'should prove that Java has a ternary operator'() {
        given:
            String expectedGrandsonName = 'Nameless'
        and:
            JavaGrandpa javaGrandpa = new JavaGrandpa(new JavaGrandson(null))
        and:
            String grandsonName = javaGrandpa.getJavaGrandson().getName() == null ? expectedGrandsonName : javaGrandpa.getJavaGrandson().getName()
        expect:
            grandsonName == expectedGrandsonName

    }

    def 'should prove that Groovy is as cool as Elvis'() {
        given:
            String expectedGrandsonName = 'John'
        and:
            GroovyGrandpa groovyGrandpa = new GroovyGrandpa(new GroovyGrandson(null))
        and:
            String grandsonName = groovyGrandpa.groovyGrandson.name ?: expectedGrandsonName
        expect:
            grandsonName == expectedGrandsonName

    }
}
