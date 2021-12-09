package org.me.howtocreateanoptionsmenuinandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        Log.d("abc","onCreateOptionsMenu")
        menuInflater.inflate(R.menu.nav_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Log.d("abc", "onOptionsItemSelected:$item")
        when (item.itemId) {
            R.id.nav_delete -> Toast.makeText(this,"Delete selected",Toast.LENGTH_SHORT).show()
            R.id.nav_favourite -> Toast.makeText(this,"Favourite selected",Toast.LENGTH_SHORT).show()
            R.id.nav_third_item1 -> Toast.makeText(this,"Third item selected", Toast.LENGTH_SHORT).show()
            R.id.nav_third_item2-> Toast.makeText(this,"Third item selected", Toast.LENGTH_SHORT).show()
            R.id.nav_third_item3-> Toast.makeText(this,"Third item selected", Toast.LENGTH_SHORT).show()
            R.id.nav_third_item4-> Toast.makeText(this,"Third item selected", Toast.LENGTH_SHORT).show()
            R.id.nav_third_item5-> Toast.makeText(this,"Third item selected", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}