package com.blogspot.toomuchcoding.jinkubator.groovy.semantics

import spock.lang.Specification

class MethodScopesSpec extends Specification {

    def "should call a public method"() {
        expect:
            new MethodScopes().publicByDefault()
    }

    def "should call a protected method"() {
        expect:
            new MethodScopes().protectedMethod()
    }

    def "should call a package scope method"() {
        expect:
            new MethodScopes().packageScopedMethod()
    }

}
