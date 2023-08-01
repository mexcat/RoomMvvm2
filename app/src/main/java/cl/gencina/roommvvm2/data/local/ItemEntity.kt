package cl.gencina.roommvvm2.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "item_table")
class ItemEntity (val name:String, val price: Int, val quantity: Int){
    @PrimaryKey(autoGenerate = true) var id: Long = 0
}
