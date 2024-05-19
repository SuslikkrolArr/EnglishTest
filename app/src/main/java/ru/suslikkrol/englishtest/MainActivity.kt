package ru.suslikkrol.englishtest

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ru.suslikkrol.englishtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(R.id.frTestLocation, StartFragment.newInstance()).commit()

        binding.apply {
            nvTopic.setNavigationItemSelectedListener {
                when(it.itemId){

                    R.id.itemFood -> supportFragmentManager.beginTransaction().replace(R.id.frTestLocation, FoodTestFragment.newInstance()).commit()

                    R.id.itemSpace -> supportFragmentManager.beginTransaction().replace(R.id.frTestLocation, SpaceTestFragment.newInstance()).commit()

                    R.id.itemAnimale -> supportFragmentManager.beginTransaction().replace(R.id.frTestLocation, AnimaleTestFragment.newInstance()).commit()

                    R.id.itemCountries -> supportFragmentManager.beginTransaction().replace(R.id.frTestLocation, CountriesTestFragment.newInstance()).commit()
                }
                drawer.closeDrawer(GravityCompat.START)
                true
            }
        }

        }
    }