package com.breezefsmhmhcorporation.features.viewAllOrder.interf

import com.breezefsmhmhcorporation.app.domain.NewOrderProductEntity
import com.breezefsmhmhcorporation.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}