package br.senai.sp.jandira.triproom.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_usuarios")
data class Usuario(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nome: String = "",
    val email: String = "",
    val senha: String = "",
    val telefone: String = "",
)