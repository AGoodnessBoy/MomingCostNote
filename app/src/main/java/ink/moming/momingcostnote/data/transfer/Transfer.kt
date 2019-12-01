package ink.moming.momingcostnote.data.transfer

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import ink.moming.momingcostnote.data.account.Account
import java.util.*

/**
 * Entity 内部转账表
 */

@Entity(tableName = "trabsfers",
    foreignKeys =
    [ForeignKey(entity = Account::class,
        parentColumns= arrayOf("accountid"),
        childColumns= arrayOf("trabsferfromaccount")),
        ForeignKey(entity = Account::class,
            parentColumns= arrayOf("accountid"),
            childColumns= arrayOf("trabsfertoaccount"))
    ]
)
data class
Transfer(@PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "trabsferid")
        val id:Int,
        @ColumnInfo(name = "trabsferfromaccount")//外键 转账a账户
        val tsFromAccount:Int,
        @ColumnInfo(name = "trabsfername")//转账名称
        val tsName:String,
        @ColumnInfo(name = "trabsfertoaccount")//外键 转账b账户
        val tsToAccount:Int,
        @ColumnInfo(name = "trabsferamount")//转账数量
        val tsAmount:Float,
        @ColumnInfo(name = "trabsferdate")//转账时间
        val tsDate: Date
)