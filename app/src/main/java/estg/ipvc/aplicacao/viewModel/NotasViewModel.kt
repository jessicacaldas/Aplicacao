package estg.ipvc.aplicacao.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import estg.ipvc.aplicacao.entities.Notas

class NotasViewModel(private val repository: NotasViewModel) : ViewModel() {

    val allNotas: LiveData<List<Notas>> = repository.allNotas.asLiveData()

}