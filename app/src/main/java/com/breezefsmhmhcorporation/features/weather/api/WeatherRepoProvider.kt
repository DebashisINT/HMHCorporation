package com.breezefsmhmhcorporation.features.weather.api

import com.breezefsmhmhcorporation.features.task.api.TaskApi
import com.breezefsmhmhcorporation.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}