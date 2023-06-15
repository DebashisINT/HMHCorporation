package com.breezefsmhmhcorporation.features.nearbyuserlist.api

import com.breezefsmhmhcorporation.app.Pref
import com.breezefsmhmhcorporation.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefsmhmhcorporation.features.newcollection.model.NewCollectionListResponseModel
import com.breezefsmhmhcorporation.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}