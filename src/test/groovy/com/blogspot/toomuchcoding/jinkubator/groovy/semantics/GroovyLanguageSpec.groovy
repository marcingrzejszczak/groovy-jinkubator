package com.blogspot.toomuchcoding.jinkubator.groovy.semantics

import spock.lang.Specification

class GroovyLanguageSpec extends Specification {
    // different method scopes
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

    // returns
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

    // defs
    def 'should return a value when using def'() {
        when:
            def type = new GroovyLanguage().methodReturningSomething(2)
        then:
            type == 1
    }

    def 'should return some type when using plenty of defs'() {
        when:
            def type = new GroovyLanguage().guessMyType(2)
        then:
            type instanceof Date
    }

    // Equality
    def 'should show that two objects are the same using is() and == operator'() {
        given:
            String first = new GroovyLanguage.SomeClass()
            String second = new GroovyLanguage.SomeClass()
        expect:
            first == second
            !first.is(second)
    }

    // Check http://groovy.codehaus.org/Groovy+Truth for more info
    def 'should show Groovy Truth example on String'() {
        given:
            String blankString = ''
        expect:
            !blankString
    }


}
