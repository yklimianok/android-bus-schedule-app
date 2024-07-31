package com.example.busschedule

import android.app.Application
import com.example.busschedule.data.BusScheduleDatabase
import com.example.busschedule.data.BusScheduleRepository

class BusScheduleApplication : Application() {
    val busScheduleRepository: BusScheduleRepository by lazy {
        BusScheduleRepository(
            BusScheduleDatabase.getDatabase(this).busScheduleDao()
        )
    }
}