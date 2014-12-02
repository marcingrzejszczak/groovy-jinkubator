package com.blogspot.toomuchcoding.jinkubator.groovy._1_semantics

import spock.lang.Specification

class _8_ClosureSpec extends Specification {

    def 'should show what a closure is on the example of a void method'() {
        given:
            int someValue = 100
            Closure closure = {
                println 'hello'
                someValue = 200
            }
        when:
            closure()
        then:
            someValue == 200
    }

    def 'should return a value from a closure'() {
        given:
            Closure closure = {
                return 100
            }
        expect:
            closure() == 100
    }

    def 'should return a value from a closure having an argument'() {
        given:
            Closure closure = { int arg ->
                return 100 + arg
            }
        expect:
            closure(200) == 300
    }

    def 'should show syntax of a method with a closure'() {
        given:
            Closure closure = { int arg ->
                return 100 + arg
            }
        when:
            int result = calculate {
                println it
                return it + 200
            }
        then:
            result == 300
    }

    Integer calculate(Closure closure) {
        return closure(100)
    }

}
