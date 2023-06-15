package com.breezefsmhmhcorporation.features.viewAllOrder.interf

import com.breezefsmhmhcorporation.app.domain.NewOrderColorEntity
import com.breezefsmhmhcorporation.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}