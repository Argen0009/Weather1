package mbk.io.weather.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import mbk.io.weather.data.local.database.dao.WeatherDao

@Database(entities = [WeatherDao::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun WeatherDao(): WeatherDao
}