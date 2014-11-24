package com.blogspot.toomuchcoding.jinkubator.groovy.semantics

import spock.lang.Specification

class DefsSpec extends Specification {
       // defs
    def 'should return a value when using def'() {
        when:
            def type = new Defs().methodReturningSomething(2)
        then:
            type == 1
    }

    def 'should return some type when using plenty of defs'() {
        when:
            def type = new Defs().guessMyType(2)
        then:
            type instanceof Date
    }

}
