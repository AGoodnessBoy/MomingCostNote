package ink.moming.momingcostnote.data.account

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entity 账户表
 */

@Entity(tableName = "accounts")
data class
Account(@PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "accountid")
        val id:Int,
        @ColumnInfo(name = "accountname") //账户名称
        val acName:String,
        @ColumnInfo(name = "accounttype") //账户类型 1：储蓄账户 2：借款账户
        val acType:String,
        @ColumnInfo(name = "accountbalance",defaultValue = "0.00") //余额
        val acBalance:Float,
        @ColumnInfo(name = "accountlineofcredit",defaultValue = "0.00") //信用额度
        val acLineOfCredit:Float,
        @ColumnInfo(name = "accountdate") //还款日期
        val acDate:Int
)