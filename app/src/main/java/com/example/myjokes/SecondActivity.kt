package com.example.myjokes
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val arrayAdapter: ArrayAdapter<*>

        //array of items to be displayed in Listview
        val category = arrayListOf("animal","career","celebrity","dev","explicit",
            "fashion","food","history","money",
            "movie","music","political","religion","science","sport","travel")

        //ListView
        var mListView = findViewById<ListView>(R.id.userlist)

        //adapter
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, category)

        //set adapter
        mListView.adapter = arrayAdapter

        //List Item Click
        userlist.setOnItemClickListener { parent:AdapterView<*>, view: View, position: Int, id:Long ->
          //if(position==0){
            //  Toast.makeText(this@SecondActivity, "Give me a fuckn joke", Toast.LENGTH_SHORT
             //     ).show()}

            if (position == 0) {
                val activityIntent = Intent(this,MainActivity::class.java )
                activityIntent.putExtra(EXTRA_NOTE_POSITION, position)

                startActivity(activityIntent)
        }
            if (position == 1) {
                val activityIntent = Intent(this,CareerActivity::class.java )
                activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
                startActivity(activityIntent)
            }
            if (position == 2) {
                val activityIntent = Intent(this,CelebrityActivity::class.java )
                activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
                startActivity(activityIntent)
            }
            if (position == 3) {
                val activityIntent = Intent(this,DevActivity::class.java )
                activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
                startActivity(activityIntent)
            }
            if (position == 4) {
                val activityIntent = Intent(this,ExplicitActivity::class.java )
                activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
                startActivity(activityIntent)
            }

            if (position == 5) {
                val activityIntent = Intent(this,FashionActivity::class.java )
                activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
                startActivity(activityIntent)
            }
            if (position == 6) {
                val activityIntent = Intent(this,FoodActivity::class.java )
                activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
                startActivity(activityIntent)
            }
            if (position == 7) {
                val activityIntent = Intent(this,HistoryActivity::class.java )
                activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
                startActivity(activityIntent)
            }
            if (position == 8) {
                val activityIntent = Intent(this,MoneyActivity::class.java )
                activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
                startActivity(activityIntent)
            }
            if (position == 9) {
                val activityIntent = Intent(this,MovieActivity::class.java )
                activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
                startActivity(activityIntent)
            }
            if (position == 10) {
                val activityIntent = Intent(this,MusicActivity::class.java )
                activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
                startActivity(activityIntent)
            }
            if (position == 11) {
                val activityIntent = Intent(this,PoliticalActivity::class.java )
                activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
                startActivity(activityIntent)
            }
            if (position == 12) {
                val activityIntent = Intent(this,ReligionActivity::class.java )
                activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
                startActivity(activityIntent)
            }
            if (position == 13) {
                val activityIntent = Intent(this,ScienceActivity::class.java )
                activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
                startActivity(activityIntent)
            }
            if (position == 14) {
                val activityIntent = Intent(this,SportActivity::class.java )
                activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
                startActivity(activityIntent)
            }
            if (position == 15) {
                val activityIntent = Intent(this,TravelActivity::class.java )
                activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
                startActivity(activityIntent)
            }


        }

    }}





