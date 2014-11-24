package com.blogspot.toomuchcoding.jinkubator.groovy.semantics

import spock.lang.Specification

class MethodReturningSpec extends Specification {

    def "should return a string from a method with return keyword"() {
        expect:
            new MethodReturning().stringReturningMethod() == 'OK'
    }

    def "should return a string from a method without return keyword"() {
        expect:
            new MethodReturning().stringReturningMethodWithoutReturnKeyword() == 'OK'
    }

    def "should return last line from a method without return keyword"() {
        expect:
            new MethodReturning().methodWithMistakeThatManyGroovyBeginnersWillMake() == false
    }

    def "should return String value of last line from a method without return keyword"() {
        expect:
            new MethodReturning().methodWithEvenWorseMistakeThatManyGroovyBeginnersWillMake() == 'false'
    }

    def "should throw a runtime class cast exception when not being able to cast your object to return type"() {
        when:
            new MethodReturning().methodReturningAnObjectWithoutAsType()
        then:
            thrown(ClassCastException)
    }

}
