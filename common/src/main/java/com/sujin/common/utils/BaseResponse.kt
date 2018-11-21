package com.sujin.common.utils

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BaseResponse<T>(

    @SerializedName("message") @Expose var statusMessage: String? = null,
    @SerializedName("status_code") @Expose var statusCode: Int = 0,
    @SerializedName("debug_code") @Expose var debugCode: Int = 0,
    @SerializedName("data") @Expose var response: T? = null

)