package com.blogspot.toomuchcoding.jinkubator.groovy.family

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode
@ToString(includePackage = false, includeNames = true)
class GroovyFamily {
    Map<String, GroovyFamilyMember> family
    List<GroovyFamilyMember> friends
}
