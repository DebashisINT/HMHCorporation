package com.breezefsmhmhcorporation.features.document.api

import com.breezefsmhmhcorporation.features.dymanicSection.api.DynamicApi
import com.breezefsmhmhcorporation.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}