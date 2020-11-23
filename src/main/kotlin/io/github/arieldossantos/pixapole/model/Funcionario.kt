package io.github.arieldossantos.pixapole.model

import java.sql.Date
import javax.persistence.*

@Entity
@Table(name = "funcionarios")
data class Funcionario(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,
        val nome: String,
        val cpf: String,
        val salario: Float,
        val dataContratacao: Date,
        @ManyToOne
        val cargo: Cargo?,
        @ManyToMany
        val unidadeTrabalhos: List<UnidadeTrabalho>

)