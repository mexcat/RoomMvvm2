package cl.gencina.roommvvm2.data

import androidx.lifecycle.LiveData
import cl.gencina.roommvvm2.data.local.ItemDao
import cl.gencina.roommvvm2.data.local.ItemEntity

class Repository(private val itemDao: ItemDao) {
    fun getAllItems(): LiveData<List<ItemEntity>> = itemDao.getAllItems()

    suspend fun insertItem(item: ItemEntity){
        itemDao.insertItem(item)
    }
}