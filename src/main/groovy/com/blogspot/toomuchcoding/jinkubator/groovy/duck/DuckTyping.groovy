package com.blogspot.toomuchcoding.jinkubator.groovy.duck

class DuckTyping {
    static class Duck {
        def quack() {
            println "A duck quacks"
        }
    }

    static class Person {
        def quack() {
            println "A drunk person quacks too"
        }

        def sing() {
            println "A person can sing"
        }
    }

}

