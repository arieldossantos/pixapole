package io.github.arieldossantos.pixapole.repository

import io.github.arieldossantos.pixapole.model.Funcionario
import org.springframework.data.repository.CrudRepository

interface FuncionarioRepository: CrudRepository<Funcionario, Int>