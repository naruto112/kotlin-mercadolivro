package com.mercadolivro.service

import com.mercadolivro.enums.CustomerStatus
<<<<<<< HEAD
import com.mercadolivro.enums.Errors
import com.mercadolivro.exception.NotFoundException
=======
>>>>>>> 641e1e3cfa2afb78e5f2e7e396749840bc9ead62
import com.mercadolivro.model.CustomerModel
import com.mercadolivro.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(
    val customerRepository: CustomerRepository,
    val bookService: BookService
) {

    fun getAll(name: String?): List<CustomerModel> {
        name?.let {
            return customerRepository.findByNameContaining(it)
        }
        return customerRepository.findAll().toList()
    }

    fun create(customer: CustomerModel) {
        customerRepository.save(customer)
    }

    fun findById(id: Int): CustomerModel {
<<<<<<< HEAD
        return customerRepository.findById(id).orElseThrow{ NotFoundException(Errors.ML201.message.format(id), Errors.ML201.code)}
=======
        return customerRepository.findById(id).orElseThrow()
>>>>>>> 641e1e3cfa2afb78e5f2e7e396749840bc9ead62
    }

    fun update(customer: CustomerModel) {

        if (!customerRepository.existsById(customer.id!!)) {
            throw Exception()
        }

        customerRepository.save(customer)
    }

    fun delete(id: Int) {
        val customer = findById(id)
        bookService.deleteByCustomer(customer)
        customer.status = CustomerStatus.INATIVO
        customerRepository.save(customer)
    }
<<<<<<< HEAD

    fun emailAvailable(email: String): Boolean {
        return !customerRepository.existsByEmail(email)
    }
=======
>>>>>>> 641e1e3cfa2afb78e5f2e7e396749840bc9ead62
}