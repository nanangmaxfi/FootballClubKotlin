package id.web.nanangmaxfi.footballclub.ui.home.fragment.teams

import id.web.nanangmaxfi.footballclub.model.Team

interface TeamsView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}