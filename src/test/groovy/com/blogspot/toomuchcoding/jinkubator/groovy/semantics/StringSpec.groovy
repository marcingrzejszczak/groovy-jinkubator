package com.blogspot.toomuchcoding.jinkubator.groovy.semantics

import spock.lang.Specification

class StringSpec extends Specification {

    def 'should show how to use a String and a GString'() {
        given:
            String value = ' with appended value'
        and:
            String string = 'some String ' + value
            GString gString = "some String $value"
        expect:
            string == gString
            !string.is(gString)
            string instanceof String
            gString instanceof GString
    }

    def 'should show how to create multiline String in Groovy'() {
        given:
            String groupId = 'com.blogspot.toomuchcoding'
            String artifactId = 'groovy-jinkubator'
            String version = '0.0.1-SNAPSHOT'
        and:
            String javaMultilineString = '<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n'+
                                         '<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n' +
                                         '         xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\n' +
                                         '    <modelVersion>4.0.0</modelVersion>\n' +
                                         '    <groupId>' + groupId + '</groupId>\n' +
                                         '    <artifactId>' + artifactId + '</artifactId>\n' +
                                         '    <version>' + version + '</version>\n'+
                                         '    <packaging>jar</packaging>\n' +
                                         '    <name>Groovy Jinkubator</name>\n' +
                                         '    <description>Groovy Jinkubator</description>\n' +
                                         '</project>'
        and:
            String groovyMultilineString = """\
                                            <?xml version="1.0" encoding="UTF-8"?>
                                            <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                                                     xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
                                                <modelVersion>4.0.0</modelVersion>
                                                <groupId>$groupId</groupId>
                                                <artifactId>$artifactId</artifactId>
                                                <version>$version</version>
                                                <packaging>jar</packaging>
                                                <name>Groovy Jinkubator</name>
                                                <description>Groovy Jinkubator</description>
                                            </project>"""
        expect:
            javaMultilineString.stripIndent() == groovyMultilineString.stripIndent()
    }

}
