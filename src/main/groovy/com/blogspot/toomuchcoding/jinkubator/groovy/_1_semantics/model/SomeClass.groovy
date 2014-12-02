package com.blogspot.toomuchcoding.jinkubator.groovy._1_semantics.model

class SomeClass implements Comparable<SomeClass> {
    Integer someValue
    void doSth() {}
    void shout() {
        println('hello!')
    }

    Object asType(Class type) {
        switch(type) {
            case SomeClass:
                return this
            case String:
                return 'String'
            default:
                throw new ClassCastException()
        }
    }

    boolean isCase(Object switchValue) {
        return false
    }

    @Override
    int compareTo(SomeClass o) {
        return someValue <=> o.someValue
    }
}
