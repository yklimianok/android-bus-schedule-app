package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BusScheduleDao {
    @Query("SELECT * from schedule ORDER BY arrival_time")
    fun getAllItems(): Flow<List<BusSchedule>>

    @Query("SELECT * from schedule WHERE stop_name = :stopName ORDER BY arrival_time")
    fun getItem(stopName: String): Flow<List<BusSchedule>>
}