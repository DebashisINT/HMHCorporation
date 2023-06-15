package com.breezefsmhmhcorporation.features.photoReg.model

import com.breezefsmhmhcorporation.features.stockAddCurrentStock.model.CurrentStockGetDataDtls

class GetUserListResponse {
    var status:String ? = null
    var message:String ? = null
    var user_list :ArrayList<UserListResponseModel>? = null
}