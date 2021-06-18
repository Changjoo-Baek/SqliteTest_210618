//package com.zzazzu.sqlitetest_210618

import android.provider.BaseColumns

object ContactContract {

    const val_RESULTS = "result"
    const val_CallingNO = "callingNO"
    const val_CallingTime = "received_time"

    object Entry : BaseColumns {
        const val TABLE_NAME = "PBbook"
        const val _IDX = "idx"
        const val _NAME = "userNM"
        const val _MobileNO = "mobileNO"
        const val _telNO = "telNO"
        const val _Team = "Team"
        const val _Mission = "Mission"
        const val _Position = "Position"
        const val _Photo = "photo"
        const val _Status = "status"
    }

}