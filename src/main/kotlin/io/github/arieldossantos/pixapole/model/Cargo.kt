package io.github.arieldossantos.pixapole.model

import javax.persistence.*

@Entity
@Table(name = "cargos")
data class Cargo(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int? = -1,
        var descricao: String?,
        @OneToMany
        var funcionario: List<Funcionario>?
) {
    constructor() : this(null, null, null)
}