package com.blogspot.toomuchcoding.jinkubator.groovy.beans.family

import spock.lang.Specification

class FamilySpec extends Specification {

    def "should build and set values of the Java family (didn't refactor the code on purpose)"() {
        given:
            Map<String, JavaFamilyMember> family = new HashMap<>();
            List<JavaFamilyMember> friends = new ArrayList<>();
        and:
            JavaFamilyMember mum = new JavaFamilyMember();
            mum.setAge(50);
            mum.setName("Anna");
            family.put("mum", mum);
        and:
            JavaFamilyMember daddy = new JavaFamilyMember();
            daddy.setAge(55);
            daddy.setName("John");
            family.put("daddy", daddy);
        and:
            JavaFamilyMember friend = new JavaFamilyMember();
            friend.setAge(20);
            friend.setName("Andrew");
            friends.add(friend);
        and:
            JavaFamily javaFamily = new JavaFamily();
            javaFamily.setFamily(family);
            javaFamily.setFriends(friends);
        expect:
            javaFamily.toString() == '''
                                    JavaFamily{family={daddy=JavaFamilyMember{name='John', age=55}, mum=JavaFamilyMember{name='Anna', age=50}}, friends=[JavaFamilyMember{name='Andrew', age=20}]}
                                    '''.trim();
    }

    def "should build and set values of the Groovy family much easier"() {
        given:
            Map<String, GroovyFamilyMember> family = [:]
            List<GroovyFamilyMember> friends = []
        and:
            family << [mum: new GroovyFamilyMember(age: 50, name: 'Anna')]
        and:
            family << [daddy: new GroovyFamilyMember(age: 55, name: 'John')]
        and:
            friends << new GroovyFamilyMember(age: 20, name: 'Andrew')
        and:
            GroovyFamily javaFamily = new GroovyFamily(family: family, friends: friends)
        expect:
            javaFamily.toString() == '''
                                    GroovyFamily(family:[mum:GroovyFamilyMember(name:Anna, age:50), daddy:GroovyFamilyMember(name:John, age:55)], friends:[GroovyFamilyMember(name:Andrew, age:20)])
                                    '''.trim()
    }

    def "should build and set values of the Groovy family with even less boilerplate code"() {
        given:
            GroovyFamily groovyFamily = new GroovyFamily(family: [mum: new GroovyFamilyMember(age: 50, name: 'Anna'),
                                                                  daddy: new GroovyFamilyMember(age: 55, name: 'John')],
                                                         friends: [new GroovyFamilyMember(age: 20, name: 'Andrew')])
        expect:
            groovyFamily.toString() == '''
                                        GroovyFamily(family:[mum:GroovyFamilyMember(name:Anna, age:50), daddy:GroovyFamilyMember(name:John, age:55)], friends:[GroovyFamilyMember(name:Andrew, age:20)])
                                        '''.trim()
    }
}
