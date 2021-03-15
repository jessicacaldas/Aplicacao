package estg.ipvc.aplicacao.db

import androidx.lifecycle.LiveData
import estg.ipvc.aplicacao.dao.NotasDao
import estg.ipvc.aplicacao.entities.Notas

class NotasRepository(private val NotasDao: NotasDao) {
    val allNotas: LiveData<List<Notas>> = NotasDao.getAlphabetizedNotas()

    suspend fun insert(Notas: Notas) {
        NotasDao.insert(Notas)
    }
}