package com.hassanwasfy.zekri.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.fragment.app.Fragment
import com.hassanwasfy.zekri.R
import com.hassanwasfy.zekri.databinding.ActivityMainHolderBinding
import com.hassanwasfy.zekri.ui.controllers.AddFragment
import com.hassanwasfy.zekri.ui.controllers.HomeFragment

class MainHolder : AppCompatActivity() {

    private lateinit var binding: ActivityMainHolderBinding
    private val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainHolderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpDefaultSelection()
    }

    override fun onStart() {
        super.onStart()

        binding.mainActivityBottomNav.setOnItemSelectedListener { it ->
            val frag: Any
            when(it.itemId){
                R.id.menu_home -> {
                    frag = HomeFragment()
                    fragmentReplacer(frag)
                    true
                }
                R.id.menu_read -> {
                    frag = HomeFragment()
                    fragmentReplacer(frag)
                    Toast.makeText(baseContext,"Coming Soon!",Toast.LENGTH_LONG).show()
                    true
                }
                R.id.menu_mosque -> {
                    frag = HomeFragment()
                    fragmentReplacer(frag)
                    Toast.makeText(baseContext,"Coming Soon!",Toast.LENGTH_LONG).show()
                    true
                }
                R.id.menu_favorite -> {
                    Toast.makeText(baseContext,"Coming Soon!",Toast.LENGTH_LONG).show()
                    true
                }
                R.id.menu_settings -> {
                    true
                }
                else -> false
            }
        }


    }


    private fun fragmentReplacer(fragment: Fragment){
        fragmentManager.beginTransaction().apply {
            replace(binding.mainFragmentsContainer.id,fragment)
            commit()
        }
    }

    private fun setUpDefaultSelection(){
        binding.mainActivityBottomNav.selectedItemId = R.id.menu_home
        fragmentManager.beginTransaction().apply {
            val homeFragment = HomeFragment()
            replace(binding.mainFragmentsContainer.id,homeFragment)
            commit()
        }
    }




}