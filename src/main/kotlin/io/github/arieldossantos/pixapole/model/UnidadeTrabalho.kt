package io.github.arieldossantos.pixapole.model

import javax.persistence.*

@Entity
@Table(name = "unidades")
data class UnidadeTrabalho(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,
        val descricao: String,
        val endereco: String?,
        @ManyToMany
        val funcionarios: List<Funcionario>?
)