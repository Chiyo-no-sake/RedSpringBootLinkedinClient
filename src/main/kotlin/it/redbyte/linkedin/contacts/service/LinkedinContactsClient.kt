package it.redbyte.linkedin.contacts.service

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient

/**
 * KIM:
 * 1) expose a method to set the auth token
 *
 *
 */
@Component
class LinkedinContactsClient(
    webClient: WebClient
) {

    fun getAddressBook(){

    }
}