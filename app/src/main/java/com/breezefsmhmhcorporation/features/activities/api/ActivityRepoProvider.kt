package com.breezefsmhmhcorporation.features.activities.api

import com.breezefsmhmhcorporation.features.member.api.TeamApi
import com.breezefsmhmhcorporation.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}