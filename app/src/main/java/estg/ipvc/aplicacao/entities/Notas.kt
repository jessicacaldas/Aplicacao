package estg.ipvc.aplicacao.entities

import androidx.room.Entity


@Entity(tableName = "notas_table")

class Notas {
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
        @ColumnInfo(name = "nota") val nota: String,
        @ColumnInfo(name = "descricao") val descricao: String
}


