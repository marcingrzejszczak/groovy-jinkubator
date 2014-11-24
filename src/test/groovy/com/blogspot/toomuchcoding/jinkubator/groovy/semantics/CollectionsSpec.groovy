package com.blogspot.toomuchcoding.jinkubator.groovy.semantics

import spock.lang.Specification

class CollectionsSpec extends Specification {

    def 'should create a list with Groovy syntax'() {
        expect:
            ['a', 'b', 'c'] instanceof List
    }

    def 'should create a set with Groovy syntax'() {
        expect:
            (['a', 'b', 'c'] as HashSet<String>) instanceof Set
    }

    def 'should create a map with Groovy syntax'() {
        expect:
            [key: 'Value', anotherKey: 'AnotherValue'] instanceof Map
    }

    def 'should iterate over a collection'() {
        given:
            int counter = 0
        when:
            ['a', 'b', 'c'].each { counter++ }
        then:
            counter == 3
    }

    def 'should find a first entry in the collection'() {
        when:
            String result = ['a', 'b', 'c'].find { it == 'a'}
        then:
            result == 'a'
    }

    def 'should return null if entry is missing in the collection'() {
        when:
            String result = ['a', 'b', 'c'].find { it == 'd'}
        then:
            result == null
    }
}
