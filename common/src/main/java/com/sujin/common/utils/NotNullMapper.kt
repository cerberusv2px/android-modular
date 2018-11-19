package com.sujin.common.utils

import com.sujin.common.exception.FailedResponseException
import io.reactivex.Observable
import io.reactivex.annotations.NonNull
import io.reactivex.functions.Function

class NotNullMapper<T> : Function<BaseResponse<T>, Observable<T>> {
    @Throws(Exception::class)
    override fun apply(@NonNull baseResponse: BaseResponse<T>): Observable<T> {

        if (baseResponse.statusCode != 200)
            return Observable.error(
                FailedResponseException(
                    baseResponse.statusCode,
                    baseResponse.statusMessage.toString()
                )
            )

        val item = baseResponse.response
        return if (item == null)
            Observable.error(NullPointerException("Server Error"))
        else
            Observable.just(item)
    }
}