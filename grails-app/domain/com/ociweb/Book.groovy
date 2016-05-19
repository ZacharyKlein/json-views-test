package com.ociweb

import grails.rest.Resource

@Resource(uri='/book', formats=['json'])
class Book {

    String title

    static constraints = {
    }
}
