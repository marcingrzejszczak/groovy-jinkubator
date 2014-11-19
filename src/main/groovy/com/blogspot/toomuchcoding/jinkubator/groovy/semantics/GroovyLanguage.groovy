package com.blogspot.toomuchcoding.jinkubator.groovy.semantics

import groovy.transform.PackageScope

/**
 * Class is public by default
 * No semicolons needed
 */
class GroovyLanguage {

    void publicByDefault() {}

    private void privateMethod() {}

    protected void protectedMethod() {}

    @PackageScope void packageScopedMethod() {}

    String stringReturningMethod() {
        return 'OK'
    }

    String stringReturningMethodWithoutReturnKeyword() {
        'OK'
    }

    boolean methodWithMistakeThatManyGroovyBegginersWillMake() {
        if(true){
            true
        }
        false
    }

    String methodWithEvenWorseMistakeThatManyGroovyBegginersWillMake() {
        if(true){
            true
        }
        false
    }

    SomeClass methodReturningAnObjectWithoutToString() {
        if(true){
            true
        }
        false
    }


    static class SomeClass {}

}
