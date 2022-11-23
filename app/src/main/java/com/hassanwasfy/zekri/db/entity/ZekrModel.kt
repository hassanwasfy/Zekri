package com.hassanwasfy.zekri.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ZekrModel(

    @PrimaryKey(autoGenerate = true)
    var zekrId: Int,
    var zekrName: String,
    var zekrTarget: Int,
    var zekrProcess: Int = 0,
    var zekrPercent: Int = (100 * zekrProcess) / zekrTarget
)