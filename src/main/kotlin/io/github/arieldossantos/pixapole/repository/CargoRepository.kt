package io.github.arieldossantos.pixapole.repository

import io.github.arieldossantos.pixapole.model.Cargo
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface CargoRepository: CrudRepository<Cargo, Int>