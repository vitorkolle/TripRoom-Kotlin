package br.senai.sp.jandira.triproom.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.senai.sp.jandira.triproom.model.Usuario

@Dao
interface UsuarioDao {
    @Insert
    fun salvar(contato: Usuario): Long
    @Update
    fun atualizar(contato: Usuario)
    @Delete
    fun excluir(contato: Usuario)

    @Query("select * from tbl_usuarios order by nome asc")
    fun listarTodosOsContatos() : List<Usuario>

    @Query("select * from tbl_usuarios where nome = :nome order by nome asc")
    fun buscarContatoPeloNome(nome : String) : List<Usuario>

    @Query("select * from tbl_usuarios where id = :id")
    fun buscarContatoPeloId(id : Long) : Usuario

}