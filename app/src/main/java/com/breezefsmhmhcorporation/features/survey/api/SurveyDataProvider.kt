package com.breezefsmhmhcorporation.features.survey.api

import com.breezefsmhmhcorporation.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefsmhmhcorporation.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}