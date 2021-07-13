package com.persist.eurosport

import android.content.Intent
import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.persist.eurosport.adapter.TeamAdapter
import com.persist.eurosport.domain.Team
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initList()
    }

    var teamAdapter: TeamAdapter? = null
    var linearLayoutManager: LinearLayoutManager? = null
    var teamList = arrayListOf<Team>(
        Team(1, "Sport"),
        Team(1, "Santa Cruz"),
        Team(1, "Nautico"),
        Team(1, "Ceara")
    )


    private fun initList(){
        teamAdapter = TeamAdapter(teamList, this, this::onSetItemClickListener)
        linearLayoutManager = LinearLayoutManager(this)
        rvTeams.layoutManager = linearLayoutManager
        rvTeams.adapter = teamAdapter
    }

    fun onSetItemClickListener(team: Team){
//        val intentBook = Intent(this, BookActivity::class.java).apply {
//            flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
//            putExtra(BOOK_ACTIVITY_OBJECT_BOOK, book)
//        }
//        startActivityForResult(intentBook, BOOK_ACTIVITY_EDT_BOOK)
    }
}