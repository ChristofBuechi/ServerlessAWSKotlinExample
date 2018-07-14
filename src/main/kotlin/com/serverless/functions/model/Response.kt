package com.serverless.functions.model

class Response internal constructor(val statusCode: Int) {
    companion object {

        fun builder(): ResponseBuilder {
            return ResponseBuilder()
        }
    }


}
