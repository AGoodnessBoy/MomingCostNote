package ink.moming.momingcostnote.data.payment

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import ink.moming.momingcostnote.data.account.Account
import java.util.*

/**
 * Entity 支出表
 */

@Entity(tableName = "payments",
    foreignKeys =
    [ForeignKey(entity = Account::class,
        parentColumns= arrayOf("accountid"),
        childColumns= arrayOf("paymentaccount"))]
)
data class
Payment(@PrimaryKey(autoGenerate = true)
       @ColumnInfo(name = "paymentid")
       val id:Int,
       @ColumnInfo(name = "paymentaccount")//外键 付款账户
       val payAccount:Int,
       @ColumnInfo(name = "paymentname")//付款名称
       val payName:String,
       @ColumnInfo(name = "paymenttype")//付款类型
       val payType:Int,
       @ColumnInfo(name = "paymentamount")//付款数量
       val payAmount:Float,
       @ColumnInfo(name = "paymentdate")//付款时间
       val payDate: Date
)