package id.web.nanangmaxfi.footballclub.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.web.nanangmaxfi.footballclub.R
import id.web.nanangmaxfi.footballclub.ui.home.fragment.FavoriteTeamsFragment
import id.web.nanangmaxfi.footballclub.ui.home.fragment.teams.TeamsFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottom_navigation.setOnNavigationItemSelectedListener {
            item ->
            when (item.itemId) {
                R.id.teams -> {
                    loadTeamsFragment(savedInstanceState)
                }
                R.id.favorites -> {
                    loadFavoritesFragment(savedInstanceState)
                }
            }
            true
        }
    }

    private fun loadTeamsFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_container,
                    TeamsFragment(), TeamsFragment::class.java.simpleName)
                .commit()
        }
    }

    private fun loadFavoritesFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_container, FavoriteTeamsFragment(), FavoriteTeamsFragment::class.java.simpleName)
                .commit()
        }
    }
}
