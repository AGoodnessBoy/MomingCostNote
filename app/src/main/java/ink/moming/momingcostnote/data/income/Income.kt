package ink.moming.momingcostnote.data.income

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import ink.moming.momingcostnote.data.account.Account
import java.util.*

/**
 * Entity 收入表
 */

@Entity(tableName = "incomes",
        foreignKeys =
        [ForeignKey(entity = Account::class,
            parentColumns= arrayOf("accountid"),
            childColumns= arrayOf("incomeaccount"))]
)
data class
Income(@PrimaryKey(autoGenerate = true)
       @ColumnInfo(name = "incomeid")
       val id:Int,
       @ColumnInfo(name = "incomeaccount")//外键 收款账户
       val icAccount:Int,
       @ColumnInfo(name = "incomename")//收款名称
       val icName:String,
       @ColumnInfo(name = "incometype")//收款类型
       val icType:Int,
       @ColumnInfo(name = "incomeamount")//收款数量
       val icAmount:Float,
       @ColumnInfo(name = "incomedate")//收款时间
       val icDate: Date
       )