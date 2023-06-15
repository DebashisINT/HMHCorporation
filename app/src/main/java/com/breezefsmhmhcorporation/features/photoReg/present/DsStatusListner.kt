package com.breezefsmhmhcorporation.features.photoReg.present

import com.breezefsmhmhcorporation.app.domain.ProspectEntity
import com.breezefsmhmhcorporation.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}