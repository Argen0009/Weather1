package mbk.io.weather

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import mbk.io.weather.presentora.ConditionFragment
import mbk.io.weather.presentora.SearchFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main, SearchFragment())
        transaction.addToBackStack(null) // Добавить транзакцию в стек возврата
        transaction.commit()

    }


}