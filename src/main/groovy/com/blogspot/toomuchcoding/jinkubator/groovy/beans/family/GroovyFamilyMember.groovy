package com.blogspot.toomuchcoding.jinkubator.groovy.beans.family

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode
@ToString(includePackage = false, includeNames = true)
class GroovyFamilyMember {
    String name
    Integer age
}
