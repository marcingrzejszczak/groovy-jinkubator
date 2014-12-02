package com.blogspot.toomuchcoding.jinkubator.groovy._1_semantics

import spock.lang.Specification

class _7_ConstructorSpec extends Specification {

    def 'should show that a class has a default map constructor'() {
        when:
            ClassWithFields classWithFields = new ClassWithFields(someField: 'someValue', someOtherField: 3)
        then:
            classWithFields.someField == 'someValue'
            classWithFields.someOtherField == 3
    }

    def 'should show that a class has a default map constructor and print method executions to console'() {
        when:
            ClassWithFieldsAndExplicitSetter classWithFields = new ClassWithFieldsAndExplicitSetter(someField: 'someValue')
        then:
            classWithFields.someField == 'someValue'
    }


    class ClassWithFields {
        String someField
        Integer someOtherField
    }

    class ClassWithFieldsAndExplicitSetter {
        String someField
        boolean reachedGetter
        boolean reachedSetter

        String getSomeField() {
            println 'In a getter'
            reachedGetter = true
            return someField
        }

        void setSomeField(String someField) {
            println 'In a setter'
            reachedSetter = true
            this.someField = someField
        }
    }
}
