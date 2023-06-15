package com.breezefsmhmhcorporation.features.viewAllOrder.interf

import com.breezefsmhmhcorporation.app.domain.NewOrderGenderEntity
import com.breezefsmhmhcorporation.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}