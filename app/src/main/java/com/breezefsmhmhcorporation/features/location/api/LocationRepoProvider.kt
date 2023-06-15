package com.breezefsmhmhcorporation.features.location.api

import com.breezefsmhmhcorporation.features.location.shopdurationapi.ShopDurationApi
import com.breezefsmhmhcorporation.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}