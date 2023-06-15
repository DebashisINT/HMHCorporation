package com.breezefsmhmhcorporation.features.newcollection.model

import com.breezefsmhmhcorporation.app.domain.CollectionDetailsEntity
import com.breezefsmhmhcorporation.base.BaseResponse
import com.breezefsmhmhcorporation.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}