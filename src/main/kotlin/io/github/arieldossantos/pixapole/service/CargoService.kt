package io.github.arieldossantos.pixapole.service

import io.github.arieldossantos.pixapole.model.Cargo
import io.github.arieldossantos.pixapole.repository.CargoRepository
import org.springframework.stereotype.Service

@Service
class CargoService(private val cargoRepository: CargoRepository) {
    /**
     * Salva um cargo no banco
     */
    fun save(descricao: String) {
        cargoRepository.save(Cargo(null, descricao))
    }

    /**
     * Atualiza um cargo
     */
    fun update(id: Int, descricao: String) {
        cargoRepository.save(Cargo(id, descricao))
    }

    /**
     * Busca um cargo pelo id
     */
    fun findById(id: Int): Cargo? {
        val cargo = cargoRepository.findById(id)
        return cargo.get() ?: null
    }

    /**
     * Deleta um cargo
     */
    fun delete(id: Int) {
        cargoRepository.delete(Cargo(id, null))
    }
}