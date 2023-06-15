package com.breezefsmhmhcorporation.features.lead.api

import com.breezefsmhmhcorporation.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefsmhmhcorporation.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}