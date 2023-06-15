package com.breezefsmhmhcorporation.features.login.model.productlistmodel

import com.breezefsmhmhcorporation.app.domain.ModelEntity
import com.breezefsmhmhcorporation.app.domain.ProductListEntity
import com.breezefsmhmhcorporation.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}