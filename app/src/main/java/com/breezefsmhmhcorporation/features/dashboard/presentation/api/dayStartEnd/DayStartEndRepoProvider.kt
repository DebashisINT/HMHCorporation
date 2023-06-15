package com.breezefsmhmhcorporation.features.dashboard.presentation.api.dayStartEnd

import com.breezefsmhmhcorporation.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefsmhmhcorporation.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}