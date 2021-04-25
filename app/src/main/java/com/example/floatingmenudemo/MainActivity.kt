package com.example.floatingmenudemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.floatingmenudemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        registerForContextMenu(binding.btnOpenMenu)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.floating_context_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.item1 -> Toast.makeText(this, "Item 1", Toast.LENGTH_LONG).show()
            R.id.item2 -> Toast.makeText(this, "Item 2", Toast.LENGTH_LONG).show()
            R.id.item3 -> Toast.makeText(this, "Item 3", Toast.LENGTH_LONG).show()
            R.id.item4 -> Toast.makeText(this, "Item 4", Toast.LENGTH_LONG).show()
        }
        return super.onContextItemSelected(item)
    }
}