package id.web.nanangmaxfi.footballclub.api

import java.net.URL


class ApiRepository {
    fun doRequest(url: String): String{
        return URL(url).readText()
    }
}