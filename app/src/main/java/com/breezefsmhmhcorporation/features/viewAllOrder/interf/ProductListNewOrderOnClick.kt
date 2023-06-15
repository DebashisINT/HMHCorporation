package com.breezefsmhmhcorporation.features.viewAllOrder.interf

import com.breezefsmhmhcorporation.app.domain.NewOrderGenderEntity
import com.breezefsmhmhcorporation.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}