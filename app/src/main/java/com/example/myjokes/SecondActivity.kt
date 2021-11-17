package com.example.myjokes
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val arrayAdapter: ArrayAdapter<*>
        val category = arrayOf("animal","career","celebrity","dev","explicit",
            "fashion","food","history","money",
            "movie","music","political","religion","science","sport","travel")

        var mListView = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, category)
        mListView.adapter = arrayAdapter

        userlist.setOnItemClickListener{
                parent, view, position,id->
            val activityIntent = Intent(this,MainActivity::class.java )
            activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
            startActivity(activityIntent)

        }
    }
}




