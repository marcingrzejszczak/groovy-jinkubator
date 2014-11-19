package com.blogspot.toomuchcoding.jinkubator.groovy.semantics

import spock.lang.Specification

class GroovyLanguageSpec extends Specification {
    def "should call a public method"() {
        expect:
            new GroovyLanguage().publicByDefault()
    }

    def "should call a protected method"() {
        expect:
            new GroovyLanguage().protectedMethod()
    }

    def "should call a package scope method"() {
        expect:
            new GroovyLanguage().packageScopedMethod()
    }

    def "should return a string from a method with return keyword"() {
        expect:
            new GroovyLanguage().stringReturningMethod() == 'OK'
    }

    def "should return a string from a method without return keyword"() {
        expect:
            new GroovyLanguage().stringReturningMethodWithoutReturnKeyword() == 'OK'
    }

    def "should return last line from a method without return keyword"() {
        expect:
            new GroovyLanguage().methodWithMistakeThatManyGroovyBegginersWillMake() == false
    }

    def "should return String value of last line from a method without return keyword"() {
        expect:
            new GroovyLanguage().methodWithEvenWorseMistakeThatManyGroovyBegginersWillMake() == 'false'
    }

    def "should throw a runtime class cast exception when not being able to cast your object to return type"() {
        when:
            new GroovyLanguage().methodReturningAnObjectWithoutToString()
        then:
            thrown(ClassCastException)
    }
}
