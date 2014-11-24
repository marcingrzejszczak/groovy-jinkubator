package com.blogspot.toomuchcoding.jinkubator.groovy.duck

import spock.lang.Specification

class DuckTypingSpec extends Specification {

    def 'should show duck typing'() {
        given:
            def duck = new DuckTyping.Duck()
            def person = new DuckTyping.Person()
        expect:
            executeQuacking(duck)
            executeQuacking(person)
    }


    void executeQuacking(def something) {
        something.quack()
    }
}
