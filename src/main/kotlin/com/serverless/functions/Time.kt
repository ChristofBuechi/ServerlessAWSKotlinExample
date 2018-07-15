package com.serverless.functions

import java.time.LocalDateTime
import java.time.ZoneId
import java.util.function.Function

class Time : Function<TimeRequest, TimeResponse> {
    override fun apply(request: TimeRequest) = TimeResponse("Time, ${LocalDateTime.now(ZoneId.of("Europe/Paris"))}!")
}

class TimeRequest()

class TimeResponse(val message: String)