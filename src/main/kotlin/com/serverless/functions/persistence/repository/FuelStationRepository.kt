package com.serverless.functions.persistence.repository

import com.serverless.functions.persistence.entity.FuelStation
import org.springframework.data.repository.CrudRepository

interface FuelStationRepository : CrudRepository<FuelStation, Long> {
    fun findByName(name: String): List<FuelStation>
}
