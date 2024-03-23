package mbk.io.weather.data.response

data class WeatherModel(
    val current: Current,
    val lat: Double,
    val lon: Double,
    val timezone: String,
    val timezone_offset: Int,
)

data class Current(
    val clouds: Int,
    val dew_point: Double,
    val dt: Int,
    val feels_like: Double,
    val humidity: Int,
    val temp: Double,
    val weather: List<Weather>,
    val wind_deg: Int,
    val wind_speed: Double,
)

data class Weather(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String,
)

data class Location(
    val country: String,
    val localtime: String,
    val name: String,
    val region: String,
    val tz_id: String,
)
data class Condition(
    val code: Int,
    val icon: String,
    val text: String,
)