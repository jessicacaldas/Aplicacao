package estg.ipvc.aplicacao.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import estg.ipvc.aplicacao.dao.NotasDao
import estg.ipvc.aplicacao.entities.Notas

@Database(entities = arrayOf(Notas::class), version = 1, exportSchema = false)
public abstract class NotasDB : RoomDatabase() {

    abstract fun notasDao(): NotasDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: NotasDB? = null

        fun getDatabase(context: Context, scope: CoroutineScope): NotasDB {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NotasDB::class.java,
                    "notas_database"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}


