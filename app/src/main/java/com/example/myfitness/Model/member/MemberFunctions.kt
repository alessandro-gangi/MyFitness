package com.example.myfitness.Model.member

import com.example.myfitness.utility.HTTPHandler
import org.json.JSONObject

class MemberFunctions {

    fun perform_registration(mail: String, usr: String, pwd: String): String? {
        val registration = JSONObject()

        registration.put("mail", mail)
        registration.put("username", usr)
        registration.put("password", pwd)

        return HTTPHandler().postCall("/api/insert/member", registration)

    }

    fun perform_login(mail: String, pwd: String): Boolean {
        return HTTPHandler().getCallLogin(mail, pwd)
    }
}
