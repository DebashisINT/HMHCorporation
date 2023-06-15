package com.breezefsmhmhcorporation.features.reimbursement.api.deleteimageapi

import com.breezefsmhmhcorporation.app.Pref
import com.breezefsmhmhcorporation.base.BaseResponse
import io.reactivex.Observable

/**
 * Created by Saikat on 08-02-2019.
 */
class DeleteImageRepo(val apiService: DeleteImageApi) {
    fun deleteReimbursementImage(Id: String): Observable<BaseResponse> {
        return apiService.deleteReimbursementImage(Pref.user_id!!, Pref.session_token!!, Id)
    }
}