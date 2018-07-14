package com.serverless.handler.aws

import com.serverless.functions.model.FuelStationRequest
import com.serverless.functions.model.Response
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler

/**
 * This handler is used for invoking lambda functions directly
 */
class FuelStationHandler() : SpringBootRequestHandler<FuelStationRequest, Response>()