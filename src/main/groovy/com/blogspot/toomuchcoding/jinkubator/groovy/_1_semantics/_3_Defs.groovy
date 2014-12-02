package com.blogspot.toomuchcoding.jinkubator.groovy._1_semantics

import com.blogspot.toomuchcoding.jinkubator.groovy._1_semantics.model.GroovyExample

class _3_Defs {

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
        return value < 0 ? new GroovyExample() : someOtherValues(value)
    }

    def someOtherValues(int value) {
        return value > 0 ? new Date() : 'string value'
    }

}
