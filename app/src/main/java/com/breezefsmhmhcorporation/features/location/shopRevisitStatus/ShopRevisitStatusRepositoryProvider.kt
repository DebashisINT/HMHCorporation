package com.breezefsmhmhcorporation.features.location.shopRevisitStatus

import com.breezefsmhmhcorporation.features.location.shopdurationapi.ShopDurationApi
import com.breezefsmhmhcorporation.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}