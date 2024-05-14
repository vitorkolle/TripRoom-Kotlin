package br.senai.sp.jandira.triproom.repository

import android.content.Context
import br.senai.sp.jandira.triproom.dao.UsuarioDb
import br.senai.sp.jandira.triproom.model.Usuario

class UsuarioRepository(context: Context) {
    private val db = UsuarioDb.getBancoDeDados(context).usuarioDao()

    fun salvar(usuario: Usuario):Long{
        return db.salvar(usuario)
    }

    fun listarTodosOsContatos(): List<Usuario>{
        return db.listarTodosOsContatos()
    }
}