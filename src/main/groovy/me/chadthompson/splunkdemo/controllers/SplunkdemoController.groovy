package me.chadthompson.splunkdemo.controllers

import groovy.json.JsonOutput
import me.chadthompson.splunkdemo.model.Contact
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class SplunkdemoController {

    def logger = LoggerFactory.getLogger('json')

    @GetMapping('/')
    String getContacts(){
        def contact = Contact.newInstance()
        contact.setFirstName('Chad')
        contact.setLastName('Thompson')
        contact.setCity('Urbandale')
        contact.setState('IA')
        JsonOutput.toJson(contact)
    }

    @PostMapping('/')
    postContact(@ModelAttribute Contact contact){

        //logger.info(append("metric", time), time.toString());

        logger.info(JsonOutput.toJson(contact))
        //logger.info(contact.firstName);
    }





}
