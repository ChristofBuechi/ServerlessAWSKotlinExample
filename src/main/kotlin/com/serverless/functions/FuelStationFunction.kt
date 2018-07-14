package com.serverless.functions

import com.serverless.functions.model.Response
import com.serverless.functions.model.ResponseBuilder
import com.serverless.functions.model.FuelStationRequest
import com.serverless.functions.persistence.entity.FuelStation
import com.serverless.functions.persistence.repository.FuelStationRepository
import org.springframework.beans.factory.annotation.Autowired

import java.util.function.Function


class FuelStationFunction : Function<FuelStationRequest, Response> {

    @Autowired
    private val fuelStationRepository: FuelStationRepository? = null

    override fun apply(fuelStationRequest: FuelStationRequest): Response {
        fuelStationRepository!!.save(FuelStation(fuelStationRequest))
        return ResponseBuilder()
                .statusCode(201)
                .build()
    }
}
