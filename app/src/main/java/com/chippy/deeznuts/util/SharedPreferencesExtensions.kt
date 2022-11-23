package com.chippy.deeznuts.util

import android.content.SharedPreferences

fun SharedPreferences.getNonNullString(key: String, defValue: String): String {
    return this.getString(key, defValue) ?: defValue
}
