package com.example.myfitness.utility

import android.content.ContentValues.TAG
import android.util.Log
import org.json.JSONObject
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder


class HTTPHandler {

    private val PARTIAL_URL = "http://10.0.2.2:8080"


    fun postCall(action: String, arg: JSONObject): String? {
        var result: String? = null
        val dataPost: String
        val writer: OutputStreamWriter
        val client: HttpURLConnection
        val response: InputStream
        val server: URL
        val url = PARTIAL_URL + action

        try {
            server = URL(url)
            Log.d(TAG, server.toString())
            client = server.openConnection() as HttpURLConnection
            dataPost = URLEncoder.encode("data", "UTF-8") + "=" + URLEncoder.encode(arg.toString(), "UTF-8")
            client.doOutput = true
            client.setChunkedStreamingMode(0)
            writer = OutputStreamWriter(client.outputStream)
            writer.write(dataPost)
            writer.flush()
            response = client.inputStream
            result = response.bufferedReader().use(BufferedReader::readText)

        } catch (e: IOException) {
            println(e.message)
        }
        return result
    }

    fun getCallLogin(email: String, pwd: String): Boolean {
        val result: String
        var status = false
        val client: HttpURLConnection
        val response: InputStream
        val server: URL
        var json_result: JSONObject
        val url = PARTIAL_URL + "/api/member/exists/" + email + "/"

        try {
            server = URL(url)
            Log.d(TAG, server.toString())
            client = server.openConnection() as HttpURLConnection
            client.setRequestProperty("Content-Type", "text/plain; charset=utf-8")
            //client.setRequestProperty("Authorization", "Bearer $accessToken")
            response = client.inputStream
            result = response.bufferedReader().use(BufferedReader::readText)
            json_result = JSONObject(result)

            if (email == json_result.get("mail") && pwd == json_result.get("password")) {
                status = true
                Log.d(TAG, json_result.toString())
            } else if (email != json_result.get("mail") && pwd == json_result.get("password"))
                Log.d(TAG, "email is wrong")
            else if (email == json_result.get("mail") && pwd != json_result.get("password"))
                Log.d(TAG, "password is wrong")
            else
                Log.d(TAG, "email and password are wrong")

        } catch (e: IOException) {
            System.out.println(e.message)
        }

        return status
    }
}