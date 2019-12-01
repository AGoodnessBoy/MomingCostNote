package ink.moming.momingcostnote.data.repayment

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import ink.moming.momingcostnote.data.account.Account
import ink.moming.momingcostnote.data.payment.Payment
import java.util.*



@Entity(tableName = "repayments",
    foreignKeys =
    [ForeignKey(entity = Account::class,
        parentColumns= arrayOf("accountid"),
        childColumns= arrayOf("repaymentaccount")),
        ForeignKey(entity = Payment::class,
            parentColumns= arrayOf("paymentname"),
            childColumns= arrayOf("repaymentname"))

    ]
)
data class
Repayment(@PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "repaymentid")
        val id:Int,
        @ColumnInfo(name = "repaymentaccount")//外键 分期账户
        val repayAccount:Int,
        @ColumnInfo(name = "repaymentname")//外键 分期名称
        val repayName:String,
        @ColumnInfo(name = "repaymentamount")//循环金额
        val repayAmount:Array<Float>,
        @ColumnInfo(name = "repaymentnumber")//分期数
        val repayNumber: Int,
        @ColumnInfo(name = "repaymentalreadynumber",defaultValue = "0")//已还期数
        val repayAlreadyNumber: Int
)