package com.blogspot.toomuchcoding.jinkubator.groovy._1_semantics

import spock.lang.Specification

class _3_DefsSpec extends Specification {
       // defs
    def 'should return a value when using def'() {
        when:
            def type = new _3_Defs().methodReturningSomething(2)
        then:
            type == 1
    }

    def 'should return some type when using plenty of defs'() {
        when:
            def type = new _3_Defs().guessMyType(2)
        then:
            type instanceof Date
    }

}
