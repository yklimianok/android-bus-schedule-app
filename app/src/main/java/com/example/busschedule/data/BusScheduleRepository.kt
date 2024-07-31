package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow

interface BusScheduleRepositoryInterface {
    fun getAllItemsStream(): Flow<List<BusSchedule>>

    fun getItemStream(stopName: String): Flow<List<BusSchedule>>
}


class BusScheduleRepository(private val busScheduleDao: BusScheduleDao) :
    BusScheduleRepositoryInterface {
    override fun getAllItemsStream(): Flow<List<BusSchedule>> = busScheduleDao.getAllItems()

    override fun getItemStream(stopName: String): Flow<List<BusSchedule>> =
        busScheduleDao.getItem(stopName)
}
