package mbk.io.weather.api

import android.app.Application
import androidx.room.Room
import dagger.hilt.android.HiltAndroidApp
import mbk.io.weather.data.local.database.AppDatabase

@HiltAndroidApp
class App:Application() {
    override fun OnCreate() {
        super.onCreate()
        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "database-name"
        ).build()
    }

    companion object{
        lateinit var db: AppDatabase
    }
}