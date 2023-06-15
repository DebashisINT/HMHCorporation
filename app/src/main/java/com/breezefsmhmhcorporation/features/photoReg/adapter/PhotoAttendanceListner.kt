package com.breezefsmhmhcorporation.features.photoReg.adapter

import com.breezefsmhmhcorporation.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}