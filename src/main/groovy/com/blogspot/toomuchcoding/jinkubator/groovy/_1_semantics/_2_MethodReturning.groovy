package com.blogspot.toomuchcoding.jinkubator.groovy._1_semantics

import com.blogspot.toomuchcoding.jinkubator.groovy._1_semantics.model.GroovyExample

class _2_MethodReturning {

    String stringReturningMethod() {
        return 'OK'
    }

    String stringReturningMethodWithoutReturnKeyword() {
        'OK'
    }

    boolean methodWithMistakeThatManyGroovyBeginnersWillMake() {
        if(1 == 1){
            true
        }
        false
    }

    String methodWithEvenWorseMistakeThatManyGroovyBeginnersWillMake() {
        if(1 == 1){
            true
        }
        false
    }

    GroovyExample methodReturningAnObjectWithoutAsType() {
        if(1 == 1){
            return true
        }
        return false
    }

    // Uncomment either of the below to see a compilation error
    // @CompileStatic
    // @TypeChecked
    GroovyExample methodReturningAnObjectWithoutToStringWithCompileStatic() {
        if (1 == 1) {
            return true
        }
        return false
    }

}
