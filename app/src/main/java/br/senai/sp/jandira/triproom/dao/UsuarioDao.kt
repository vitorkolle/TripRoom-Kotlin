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
    fun listarTodosOsUsuarios() : List<Usuario>

    @Query("select * from tbl_usuarios where email = :email order by email asc")
    fun buscarUsuarioPeloEmail(email : String) : List<Usuario>

    @Query("select * from tbl_usuarios where senha = :senha order by senha asc")
    fun conferirSenha(senha : String) : List<Usuario>

}