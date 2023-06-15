package com.breezefsmhmhcorporation.features.weather.api

import com.breezefsmhmhcorporation.base.BaseResponse
import com.breezefsmhmhcorporation.features.task.api.TaskApi
import com.breezefsmhmhcorporation.features.task.model.AddTaskInputModel
import com.breezefsmhmhcorporation.features.weather.model.ForeCastAPIResponse
import com.breezefsmhmhcorporation.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}