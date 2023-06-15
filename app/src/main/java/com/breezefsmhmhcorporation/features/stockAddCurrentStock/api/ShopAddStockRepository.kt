package com.breezefsmhmhcorporation.features.stockAddCurrentStock.api

import com.breezefsmhmhcorporation.base.BaseResponse
import com.breezefsmhmhcorporation.features.location.model.ShopRevisitStatusRequest
import com.breezefsmhmhcorporation.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefsmhmhcorporation.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefsmhmhcorporation.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefsmhmhcorporation.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}