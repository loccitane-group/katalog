package com.katas.helloWorld

import spock.lang.Specification

class HelloWorldTest extends Specification {

    def "application has a greeting"() {
        setup:
        def app = new HelloWorld()

        when:
        def result = app.greeting

        then:
        result == "Hello World!"
    }
}
