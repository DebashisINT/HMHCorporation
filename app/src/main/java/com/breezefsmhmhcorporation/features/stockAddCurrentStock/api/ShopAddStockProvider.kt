package com.breezefsmhmhcorporation.features.stockAddCurrentStock.api

import com.breezefsmhmhcorporation.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefsmhmhcorporation.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}