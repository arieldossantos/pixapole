package io.github.arieldossantos.pixapole

import io.github.arieldossantos.pixapole.model.Cargo
import io.github.arieldossantos.pixapole.repository.CargoRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PixapoleApplication

fun main(args: Array<String>) {
	runApplication<PixapoleApplication>(*args)
}
