package com.example.kenzovwa.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kenzovwa.swoosh.Model.Player
import com.example.kenzovwa.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        player=intent.getParcelableExtra(EXTRA_PLAYER)

        searchLeagueTxt.text="Looking for ${player.league} ${player.skill} league near you ..."
    }
}
