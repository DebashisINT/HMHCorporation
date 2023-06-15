package com.breezefsmhmhcorporation.features.performanceAPP

import com.breezefsmhmhcorporation.features.orderList.model.NewProductListDataModel


data class NoOrderTakenShop(var shop_id:String="",var shop_name:String="",var owner_contact_number:String="",var address:String="",var owner_name:String=""
,var type:String="")

data class NoProductSoldShop(var product_name:String="")

data class OrderProductListForTeam(var order_id:String="",var product_name:String="")

