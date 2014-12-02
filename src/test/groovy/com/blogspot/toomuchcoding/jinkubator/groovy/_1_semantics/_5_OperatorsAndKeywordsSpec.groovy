package com.blogspot.toomuchcoding.jinkubator.groovy._1_semantics

import com.blogspot.toomuchcoding.jinkubator.groovy._1_semantics.model.SomeClass
import spock.lang.Specification

class _5_OperatorsAndKeywordsSpec extends Specification {

    def 'should cast object using as keyword (as)'() {
        given:
            Object someClass = new SomeClass()
        expect:
            (someClass as SomeClass).doSth()
    }

    def 'should cast object using as keyword and asType method (as)'() {
        expect:
            (new SomeClass() as String) == 'String'
    }

    def 'should execute a method on all elements of the collections with the Spread operator (*.)'() {
        given:
            List<SomeClass> classes = [new SomeClass(), new SomeClass()]
        expect:
            classes*.shout()
    }

    def 'should access a field via the field reference operator (@)'() {
        given:
            JavaClassWithPrivateField someClass = new JavaClassWithPrivateField()
        expect:
            someClass.@hiddenField == 'hidden'
            someClass.hiddenField == 'Surprise!'
    }

    def 'should verify that element is in the collection by using the in operator (in)'() {
        given:
            List<String> elements = ['one', 'two', 'three']
        expect:
            'one' in elements
    }

    def 'should compare two objects using the spaceship operator (<=>)'() {
        when:
            Integer comparisonResult = new SomeClass(someValue: 0) <=> new SomeClass(someValue: 1)
        then:
            comparisonResult == -1
    }

    def 'should navigate safely by using safe navigation operator (?.)'() {
        given:
            ParentClass parentClass = new ParentClass()
        when:
            Integer value = parentClass.someClass?.someValue
        then:
            !value
    }

    def 'should iterate over a range by using the range operator (..)'() {
        given:
            Range range = 1..5
            int result = 0
        when:
            range.each { result++ }
        then:
            result == 5
    }

    def 'should check that a value is in the range using in and range oprators (in, ..)'() {
        given:
            Range range = 1..5
            int value = 3
        expect:
            value in range
    }

    def 'should address a given value in a map by using the getAt operator ([])'() {
        given:
            Map<String, String> map = [key: 'value', "'anotherKey'":'anotherValue']
        expect:
            map["'anotherKey'"] == 'anotherValue'
    }

    def "should return a value if it's there using the elvis operator (?:)"() {
        given:
            String value = 'someValue'
        when:
            String result = value ?: ''
        then:
            result == 'someValue'
    }

    def "should set a value if it's missing using the elvis operator (?:)"() {
        given:
            String missingValue = null
        when:
            String result = missingValue ?: 'empty'
        then:
            result == 'empty'
    }

    class ParentClass {
        SomeClass someClass
    }


}
