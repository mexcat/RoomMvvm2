package cl.gencina.roommvvm2.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ItemEntity::class], version = 1)
abstract class ItemDataBase : RoomDatabase() {
    abstract fun ItemDao(): ItemDao

    companion object{
        @Volatile
        private var INSTANCE: ItemDataBase? = null

        fun getDatabase(context:Context):ItemDataBase {
            val tempInstance = INSTANCE
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ItemDataBase::class.java,
                    "bill_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }

    }


}