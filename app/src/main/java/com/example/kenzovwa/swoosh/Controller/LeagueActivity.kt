package com.example.kenzovwa.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kenzovwa.swoosh.Model.Player
import com.example.kenzovwa.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player=Player("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null){
            player=savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun menClicked(view: View){
        womenToggleBtn.isChecked=false
        coedToggleBtn.isChecked=false
        player.league="mens"
    }

    fun womenClicked(view: View){
        coedToggleBtn.isChecked=false
        menToggleBtn.isChecked=false
        player.league="womens"
    }

    fun coedClicked(view: View){
        womenToggleBtn.isChecked=false
        menToggleBtn.isChecked=false
        player.league="coed"
    }

    fun leagueNextClicked(view: View){
        if (player.league!="") {
            val skillActivity = Intent(this, SkillSelectionActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this," Select a League ",Toast.LENGTH_LONG).show()
        }
    }
}
