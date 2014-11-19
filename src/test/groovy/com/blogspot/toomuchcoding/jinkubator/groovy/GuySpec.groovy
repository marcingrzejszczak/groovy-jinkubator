package com.blogspot.toomuchcoding.jinkubator.groovy

import spock.lang.Specification

class GuySpec extends Specification {

    def 'should prove that Java code works as expected'() {
        given:
            JavaGuy javaGuy = new JavaGuy();
        and:
            Integer expectedAge = 10;
        when:
            javaGuy.setAge(expectedAge);
        then:
            expectedAge.equals(javaGuy.getAge());
    }

    def 'should prove that you can write it cleaner in Groovy by removing semicolons'() {
        given:
            JavaGuy javaGuy = new JavaGuy()
        and:
            Integer expectedAge = 10
        when:
            javaGuy.setAge(expectedAge)
        then:
            expectedAge.equals(javaGuy.getAge())
    }

    def 'should prove that you can write it cleaner in Groovy by using accessors'() {
        given:
            JavaGuy javaGuy = new JavaGuy()
        and:
            Integer expectedAge = 10
        when:
            javaGuy.age = expectedAge
        then:
            expectedAge.equals(javaGuy.age)
    }

    def 'should prove that you can write it cleaner in Groovy by using == as equality comparator'() {
        given:
            JavaGuy javaGuy = new JavaGuy()
        and:
            Integer expectedAge = 10
        when:
            javaGuy.age = expectedAge
        then:
            expectedAge == javaGuy.age
    }

    def 'should further remove boilerplate code thanks to Groovy map constructor'() {
        given:
            Integer expectedAge = 10
        and:
            JavaGuy javaGuy = new JavaGuy(age: expectedAge)
        expect:
            expectedAge == javaGuy.age
    }

    def 'should prove Groovy class looks much nicer and cleaner than Java one'() {
        expect:
            new JavaGuy(age: 10).age == new GroovyGuy(age: 10).age
    }
}
