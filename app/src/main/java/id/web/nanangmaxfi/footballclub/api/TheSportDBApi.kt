package id.web.nanangmaxfi.footballclub.api

import android.net.Uri
import id.web.nanangmaxfi.footballclub.BuildConfig

object TheSportDBApi {
    fun getTeams(league: String?): String{
        return Uri.parse(BuildConfig.BASE_URL).buildUpon()
            .appendPath("api")
            .appendPath("v1")
            .appendPath("json")
            .appendPath(BuildConfig.TSDB_API_KEY)
            .appendPath("search_all_teams.php")
            .appendQueryParameter("l", league)
            .build()
            .toString()
    }
}