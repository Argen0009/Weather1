package mbk.io.weather.data.remote

import mbk.io.weather.data.response.WeatherModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("data/2.5/weather")
  suspend  fun getWeather(): Response<WeatherModel>
}