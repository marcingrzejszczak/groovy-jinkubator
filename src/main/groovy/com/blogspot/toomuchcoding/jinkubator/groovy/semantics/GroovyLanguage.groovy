package com.blogspot.toomuchcoding.jinkubator.groovy.semantics

import groovy.transform.EqualsAndHashCode
import groovy.transform.PackageScope
/**
 * Class is public by default
 * No semicolons needed
 */
class GroovyLanguage {

    // Scopes
    void publicByDefault() {}

    private void privateMethod() {}

    protected void protectedMethod() {}

    @PackageScope void packageScopedMethod() {}

    // Method returning
    String stringReturningMethod() {
        return 'OK'
    }

    String stringReturningMethodWithoutReturnKeyword() {
        'OK'
    }

    boolean methodWithMistakeThatManyGroovyBegginersWillMake() {
        if(1 == 1){
            true
        }
        false
    }

    String methodWithEvenWorseMistakeThatManyGroovyBegginersWillMake() {
        if(1 == 1){
            true
        }
        false
    }

    SomeClass methodReturningAnObjectWithoutToString() {
        if(1 == 1){
            return true
        }
        return false
    }

    //@CompileStatic
    //@TypeChecked
    SomeClass methodReturningAnObjectWithoutToStringWithCompileStatic() {
        if(1 == 1){
            return true
        }
        return false
    }

    // Defs
    def methodReturningSomething(int value) {
        if(value > 0) {
            return 1
        }
        return 'hello'
    }

    def guessMyType(int value) {
        if(value > 0) {
            return showingDefNested(value)
        }
        return 'hello'
    }

    def showingDefNested(int value) {
        return value < 0 ? new SomeClass() : someOtherValues(value)
    }

    def someOtherValues(int value) {
        return value > 0 ? new Date() : 'string value'
    }

    @EqualsAndHashCode
    static class SomeClass {}

}
