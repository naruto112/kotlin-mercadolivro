package com.mercadolivro.repository

import com.mercadolivro.model.CustomerModel
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<CustomerModel, Int> {

    fun findByNameContaining(name: String): List<CustomerModel>
<<<<<<< HEAD
    fun existsByEmail(email: String): Boolean
=======
>>>>>>> 641e1e3cfa2afb78e5f2e7e396749840bc9ead62

}