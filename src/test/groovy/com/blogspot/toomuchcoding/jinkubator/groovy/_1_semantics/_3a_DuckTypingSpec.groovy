package com.blogspot.toomuchcoding.jinkubator.groovy._1_semantics

import com.blogspot.toomuchcoding.jinkubator.groovy._1_semantics._3a_DuckTyping
import spock.lang.Specification

class _3a_DuckTypingSpec extends Specification {

    def 'should show duck typing'() {
        given:
            def duck = new _3a_DuckTyping.Duck()
            def person = new _3a_DuckTyping.Person()
        expect:
            executeQuacking(duck)
            executeQuacking(person)
    }

    void executeQuacking(def something) {
        something.quack()
    }

}
