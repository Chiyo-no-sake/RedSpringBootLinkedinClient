package it.redbyte.linkedin

import it.redbyte.linkedin.contacts.model.LinkedinAddressBook

/**
 * Defines the base functionalities of an addressBook cacher.
 * It defines how to store and retrieve the cached version of an AddressBook
 */
interface LinkedinAddressBookCacher {
    fun getAddressBook(): LinkedinAddressBook
}