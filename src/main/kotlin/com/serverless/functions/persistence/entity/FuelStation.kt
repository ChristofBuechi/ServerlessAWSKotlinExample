package com.serverless.functions.persistence.entity

import com.serverless.functions.model.FuelStationRequest
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class FuelStation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
    lateinit var name: String
    lateinit var longitude: String
    lateinit var latitude: String

    constructor() {}

    constructor(request: FuelStationRequest) {
        this.name = request.name
        this.latitude = request.latitude
        this.longitude = request.longitude
    }

    constructor(name: String, longitude: String, latitude: String) {
        this.name = name
        this.longitude = longitude
        this.latitude = latitude
    }
}
