package com.hassanwasfy.zekri.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.hassanwasfy.zekri.db.entity.ZekrModel

@Dao
interface ZekrDao {

    @Insert
    fun insertZekr(zekrModel: ZekrModel)

    @Update
    fun updateZekr(zekrModel: ZekrModel)

    @Delete
    fun deleteZekr(zekrModel: ZekrModel)

    @Query("SELECT * FROM zekrmodel")
    fun getAllZekr(): LiveData<List<ZekrModel>>
}