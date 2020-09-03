package com.shagalalab.core.data.db.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "accounts")
internal data class AccountDbModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "account_id") val id: Long = 0,
    @ColumnInfo(name = "account_title") val title: String,
    @ColumnInfo(name = "account_currency") val currency: String,
    @ColumnInfo(name = "account_sign") val sign: String = ""
)
