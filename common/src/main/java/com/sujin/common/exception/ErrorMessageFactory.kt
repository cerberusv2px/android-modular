package com.sujin.common.exception

import android.content.Context
import android.database.sqlite.SQLiteException
import com.sujin.common.R
import org.json.JSONException

object ErrorMessageFactory {

    fun createMessage(e: Throwable?, context: Context) : String{
        return when {
            e is JSONException -> context.getString(R.string.json_exception)
            e is NetworkNotAvailableException -> context.getString(R.string.internet_conn_fail)
            e is SQLiteException -> context.getString(R.string.db_not_available)
            e?.message.equals("401 Unauthorized",true)  -> context.getString(R.string.invalid_credential)
            e is FailedResponseException-> e.message
            else ->  context.getString(R.string.something_went_wrong)
        }

    }
}