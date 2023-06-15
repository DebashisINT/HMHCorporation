package com.breezefsmhmhcorporation.features.viewAllOrder.interf

import com.breezefsmhmhcorporation.app.domain.NewOrderGenderEntity
import com.breezefsmhmhcorporation.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}