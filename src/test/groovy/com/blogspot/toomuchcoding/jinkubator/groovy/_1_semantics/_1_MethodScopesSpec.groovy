package com.blogspot.toomuchcoding.jinkubator.groovy._1_semantics

import spock.lang.Specification

class _1_MethodScopesSpec extends Specification {

    def "should call a public method"() {
        expect:
            new _1_MethodScopes().publicByDefault()
    }

    def "should call a protected method"() {
        expect:
            new _1_MethodScopes().protectedMethod()
    }

    def "should call a package scope method"() {
        expect:
            new _1_MethodScopes().packageScopedMethod()
    }

}
