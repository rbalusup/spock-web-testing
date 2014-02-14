package com.batey.examples.testing.spock.web

import groovyx.net.http.RESTClient
import spock.lang.Specification

class ExampleWebAppSpecification extends Specification {
    def "Should return 200 & a message with the input appended"() {
        setup:
        def primerEndpoint = new RESTClient( 'http://localhost:8080/' )
        when:
        def resp = primerEndpoint.get([ path: 'exampleendpoint', query : [ input : 'Get a hair cut' ]])
        then:
        with(resp) {
            status == 200
            contentType == "application/json"
        }
        with(resp.data) {
            payload == "Something really important: Get a hair cut"
        }
    }
}