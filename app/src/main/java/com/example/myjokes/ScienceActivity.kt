package com.example.myjokes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class ScienceActivity : AppCompatActivity() {


    //  val URL = "https://api.icndb.com/jokes/random"
    //  var okHttpClient: OkHttpClient = OkHttpClient()
    override fun onCreate(savedInstanceState: Bundle?) {

        val actionBar = supportActionBar
        actionBar!!.title = "SCIENCE"
        actionBar.setDisplayHomeAsUpEnabled(true)


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadRandomFact()
    }
    private fun loadRandomFact() {
        val urL = "https://api.icndb.com/jokes/random/"
        val request = Request.Builder().url(urL).build()

        val client = OkHttpClient()
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {

            }

            override fun onResponse(call: Call, response: Response) {
                val json = response?.body()?.string()
                val txt = (JSONObject(json).getJSONObject("value").get("joke")).
                toString()

                runOnUiThread{
                    progressBar.visibility = View.GONE
                    factTv.text = Html.fromHtml(txt)



                }
            }
        })

    }
}

















//nextBtn.setOnClickListener {
//      loadRandomFact()
//}
//}
// private fun loadRandomFact() {
//  runOnUiThread {
//    progressBar.visibility = View.VISIBLE
//}
//val request: Request = Request.Builder().url(URL).build()
//okHttpClient.newCall(request).enqueue(object: Callback {
//  override fun onFailure(call: Call?, e: IOException?) {
//}
//override fun onResponse(call: Call?, response: Response?) {
//  val json = response?.body()?.string()
//val txt = (JSONObject(json).getJSONObject("value").get("joke")).toString()
//runOnUiThread {
//  progressBar.visibility = View.GONE
//factTv.text = Html.fromHtml(txt)
//        }
//      }
//    })
//  }
//}
