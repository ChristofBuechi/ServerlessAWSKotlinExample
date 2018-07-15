package com.serverless.handler.aws

import com.serverless.functions.TimeRequest
import com.serverless.functions.TimeResponse
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler

/**
 * This handler is used for invoking lambda functions directly
 */
class TimeHandler() : SpringBootRequestHandler<TimeRequest, TimeResponse>()