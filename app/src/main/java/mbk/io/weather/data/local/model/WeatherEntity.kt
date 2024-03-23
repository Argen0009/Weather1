package mbk.io.weather.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import mbk.io.weather.data.response.Weather
import java.io.Serializable

@Entity(tableName = "Current")
data class WeatherEntity(
    @PrimaryKey(autoGenerate = true)
    val clouds: Int? = null,
    val dew_point: Double? = null,
    val dt: Int? = null,
    val feels_like: Double? = null,
    val humidity: Int? = null,
    val temp: Double? = null,
    val weather: List<Weather>? = null,
    val wind_deg: Int? = null,
    val wind_speed: Double? = null,
) : Serializable

@Entity(tableName = "location")
data class LocationEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long? = null,
    val country: String? = "",
    val localtime: String? = "",
    val name: String? = "",
    val region: String? = "",
    val tz_id: String? = "",
) : Serializable