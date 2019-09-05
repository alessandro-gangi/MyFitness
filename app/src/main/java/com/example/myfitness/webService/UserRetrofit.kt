package com.example.myfitness.webService

class UserRetrofit {
    private val id: String? = null
    private val phone: String? = null
    private val username: String? = null
    private val website: String? = null
    private val address: Address? = null
    private val email: String? = null
    private val company: Company? = null
    private val name: String? = null

    override fun toString(): String {
        return "UserRetrofit(id=$id, phone=$phone, username=$username, website=$website, address=$address, email=$email, company=$company, name=$name)"
    }

}

class Company {
    private val catchPhrase: String? = null
    private val name: String? = null
    private val bs: String? = null
}

class Address {
    private val geo: Geo? = null
    private val zipcode: String? = null
    private val street: String? = null
    private val suite: String? = null
    private val city: String? = null
}

class Geo {
    private val lng: String? = null
    private val lat: String? = null
}