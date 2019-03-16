package com.example.kenzovwa.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kenzovwa.swoosh.Model.Player
import com.example.kenzovwa.swoosh.R
import kotlinx.android.synthetic.main.activity_skill_selection.*

class SkillSelectionActivity : BaseActivity() {

    lateinit var player:Player

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
        setContentView(R.layout.activity_skill_selection)
        player=intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun finishClicked(view: View){
        if(player.skill!="") {
            var finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Select Skill",Toast.LENGTH_LONG).show()
        }
    }

    fun ballerClicked(view: View){
        begginerBtn.isChecked=false
        player.skill="baller"
    }

    fun beginnerClicked(view: View){
        ballerBtn.isChecked=false
        player.skill="beginner"
    }

}
