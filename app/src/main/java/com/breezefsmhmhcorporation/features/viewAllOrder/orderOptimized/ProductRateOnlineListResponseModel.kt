package com.breezefsmhmhcorporation.features.viewAllOrder.orderOptimized

import com.breezefsmhmhcorporation.app.domain.ProductOnlineRateTempEntity
import com.breezefsmhmhcorporation.base.BaseResponse
import com.breezefsmhmhcorporation.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}