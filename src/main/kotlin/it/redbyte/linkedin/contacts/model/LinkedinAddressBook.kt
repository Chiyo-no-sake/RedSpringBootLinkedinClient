package it.redbyte.linkedin.contacts.model

import com.fasterxml.jackson.annotation.JsonProperty

data class LinkedinPhoneNumber(
    val number: String
)

data class LinkedinContact(
    val emailAddress: String,
    val name: String,
    val phoneNumber: LinkedinPhoneNumber
)

data class LinkedinAddressBook(
    val contacts: List<LinkedinContact>,
    val expiresAt: Long,
    val id: String
)

data class LinkedinAddressBookResponse(
    val id: String,
    val owner: String,
    val status: String,

    @JsonProperty("result~")
    val result: LinkedinAddressBook

)