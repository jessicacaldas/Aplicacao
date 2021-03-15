package estg.ipvc.aplicacao.dao

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.Query
import estg.ipvc.aplicacao.entities.Notas

interface NotasDao {

        @Query("SELECT * FROM notas_table ORDER BY nota ASC")
        fun getAlphabetizedNotas(): LiveData<List<Notas>>

        // @Query("SELECT * FROM notas_table WHERE descricao == :name")
        // fun getAlphabetizedDescricao(name: String): LiveData<List<Notas>>

        @Insert(onConflict = OnConflictStrategy.IGNORE)
        suspend fun insert(notas: Notas)

        @Query("DELETE FROM notas_table")
        suspend fun deleteAll()

}