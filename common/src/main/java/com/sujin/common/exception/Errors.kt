package com.sujin.common.exception

import java.io.IOException

class FailedResponseException(val status: Int, override val message : String) : IOException(message)

class NetworkNotAvailableException : IOException()

class InvalidTokenException(val status: Int, override val message : String) : IOException(message)