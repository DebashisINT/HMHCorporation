package com.breezefsmhmhcorporation.features.viewAllOrder.model

import com.breezefsmhmhcorporation.app.domain.NewOrderColorEntity
import com.breezefsmhmhcorporation.app.domain.NewOrderGenderEntity
import com.breezefsmhmhcorporation.app.domain.NewOrderProductEntity
import com.breezefsmhmhcorporation.app.domain.NewOrderSizeEntity
import com.breezefsmhmhcorporation.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

