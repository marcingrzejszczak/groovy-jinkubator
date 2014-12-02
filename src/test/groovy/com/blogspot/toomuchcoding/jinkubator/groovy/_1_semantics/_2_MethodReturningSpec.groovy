package com.blogspot.toomuchcoding.jinkubator.groovy._1_semantics

import spock.lang.Specification

class _2_MethodReturningSpec extends Specification {

    def "should return a string from a method with return keyword"() {
        expect:
            new _2_MethodReturning().stringReturningMethod() == 'OK'
    }

    def "should return a string from a method without return keyword"() {
        expect:
            new _2_MethodReturning().stringReturningMethodWithoutReturnKeyword() == 'OK'
    }

    def "should return last line from a method without return keyword"() {
        expect:
            new _2_MethodReturning().methodWithMistakeThatManyGroovyBeginnersWillMake() == false
    }

    def "should return String value of last line from a method without return keyword"() {
        expect:
            new _2_MethodReturning().methodWithEvenWorseMistakeThatManyGroovyBeginnersWillMake() == 'false'
    }

    def "should throw a runtime class cast exception when not being able to cast your object to return type"() {
        when:
            new _2_MethodReturning().methodReturningAnObjectWithoutAsType()
        then:
            thrown(ClassCastException)
    }

    def 'should show that you can call methods in groovy without passing parentheses to arguments'() {
        given:
            TestClass testClass = new TestClass()
        when:
            int result = testClass.someMethod 1, 2l, 'string'
        then:
            result == 1

    }

    class TestClass {
        int someMethod(int a, long b, String c) { return 1 }
    }

}

