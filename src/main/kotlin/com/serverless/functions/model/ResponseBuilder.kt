package com.serverless.functions.model

class ResponseBuilder {

    private var statusCode: Int = 0

    fun statusCode(statusCode: Int): ResponseBuilder {
        this.statusCode = statusCode
        return this
    }

    fun build(): Response {
        return Response(statusCode)
    }

}
