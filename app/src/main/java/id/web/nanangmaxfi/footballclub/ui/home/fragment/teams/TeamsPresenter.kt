package id.web.nanangmaxfi.footballclub.ui.home.fragment.teams

import com.google.gson.Gson
import id.web.nanangmaxfi.footballclub.api.ApiRepository
import id.web.nanangmaxfi.footballclub.api.TheSportDBApi
import id.web.nanangmaxfi.footballclub.model.TeamResponse
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class TeamsPresenter(private val view: TeamsView,
                     private val apiRepository: ApiRepository,
                     private val gson: Gson) {

    fun getTeamList(league: String?){
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository
                .doRequest(TheSportDBApi.getTeams(league)),
                TeamResponse::class.java)

            uiThread {
                view.hideLoading()
                view.showTeamList(data.teams)
            }
        }
    }
}