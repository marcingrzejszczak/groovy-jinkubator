package com.blogspot.toomuchcoding.jinkubator.groovy.semantics

import spock.lang.Specification

class CollectionsSpec extends Specification {

    def 'should create a list with Groovy syntax'() {
        when:
            List<String> strings = ['a', 'b', 'c', 'a']
        then:
            strings instanceof List
            strings.size() == 4
            strings[3] == 'a'
    }

    def 'should create a set with Groovy syntax'() {
        when:
            Set<String> strings = ['a', 'b', 'c', 'a'] as HashSet<String>
        then:
            strings instanceof HashSet
            strings.size() == 3
            strings[0] == 'a'
    }

    def 'should create a map with Groovy syntax'() {
        when:
            Map<String, String> map = [key: 'Value', anotherKey: 'AnotherValue']
        then:
            map instanceof Map
            map.size() == 2
            map.key == 'Value'
            map['key'] == 'Value'
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

    def 'should find all elements that are applicable to the given function (filter)'() {
        given:
            List<Integer> integers = [1, 2, 3, 4, 5, 6]
        when:
            List<Integer> results = integers.findAll { it > 3 }
        then:
            results == [4, 5, 6]
    }

    def 'should execute a function on all elements of a collection (map)'() {
        given:
            List<Integer> integers = [1, 2, 3, 4, 5, 6]
        when:
            List<Integer> results = integers.collect { it * 2 }
        then:
            results == [2, 4, 6, 8, 10 , 12]
    }

    def 'should merge all elements of the collection into a single result (reduce)'() {
        given:
            List<Integer> integers = [1, 2, 3, 4, 5, 6]
        when:
            Integer result = integers.inject { Integer accumulator, Integer value -> accumulator + value }
        then:
            result == (1 + 2 + 3 + 4 + 5 + 6)
    }

    def 'should show full filter map reduce approach in Groovy'() {
        given:
            List<Integer> integers = [1, 2, 3, 4, 5, 6]
        when:
            Integer result = integers.findAll { it < 3 }.
                                      collect { it * 2 }.
                                      inject { Integer accumulator, Integer value -> accumulator + value }
        then:
            result == 6
    }


}
