package mobile.gan.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var firstFragment: FirstFragment
    lateinit var secondFragment: SecondFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstFragment = FirstFragment.newInstance()
        secondFragment = SecondFragment.newInstance()
    }

    fun toFirstFragment(){
        supportFragmentManager.beginTransaction().replace(R.id.container, firstFragment).commit()
    }

    fun toSecondFragment(){
        supportFragmentManager.beginTransaction().replace(R.id.container, secondFragment).commit()
    }
}