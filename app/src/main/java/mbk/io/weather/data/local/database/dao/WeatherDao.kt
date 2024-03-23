package mbk.io.weather.data.local.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import mbk.io.weather.data.local.model.WeatherEntity

@Dao
interface WeatherDao {
    @Query("SELECT*FROM Current")
    suspend fun getAll(): WeatherEntity

    @Insert
    suspend fun insertWeather(weatherEntity: WeatherEntity)

}