package com.blogspot.toomuchcoding.jinkubator.groovy._1_semantics

import com.blogspot.toomuchcoding.jinkubator.groovy._1_semantics.model.GroovyExample
import spock.lang.Specification

class _4_GroovyEqualitySpec extends Specification {

    // Equality
    def 'should show that two objects are the same using is() and == operator'() {
        given:
            GroovyExample first = new GroovyExample()
            GroovyExample second = new GroovyExample()
        expect:
            first == second
            !first.is(second)
            first.is(first)
    }

    // Check http://groovy.codehaus.org/Groovy+Truth for more info
    def 'should show Groovy Truth example on String'() {
        given:
            String blankString = ''
        expect:
            !blankString
    }
}
