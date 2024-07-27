package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BusScheduleDao {
    @Query("SELECT * from schedule_items ORDER BY arrivalTimeInMillis")
    fun getAllItems(): Flow<List<BusSchedule>>

    @Query("SELECT * from schedule_items WHERE id = :id")
    fun getAllItems(id: Int): Flow<List<BusSchedule>>
}