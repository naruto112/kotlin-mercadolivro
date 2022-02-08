package com.mercadolivro.controller

import com.mercadolivro.controller.extension.toCustomerModel
import com.mercadolivro.controller.extension.toResponse
import com.mercadolivro.controller.request.PostCustomerRequest
import com.mercadolivro.controller.request.PutCustomerRequest
import com.mercadolivro.controller.response.CustomerResponse
import com.mercadolivro.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
<<<<<<< HEAD
import javax.validation.Valid
=======
>>>>>>> 641e1e3cfa2afb78e5f2e7e396749840bc9ead62

@RestController
@RequestMapping("customer")
class CustomerController(
    val customerService: CustomerService
) {

    @GetMapping
    fun getAll(@RequestParam name: String?): List<CustomerResponse> {
        return customerService.getAll(name).map { it.toResponse() }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
<<<<<<< HEAD
    fun create(@RequestBody @Valid customer: PostCustomerRequest) {
=======
    fun create(@RequestBody customer: PostCustomerRequest) {
>>>>>>> 641e1e3cfa2afb78e5f2e7e396749840bc9ead62
        customerService.create(customer.toCustomerModel())
    }

    @GetMapping("/{id}")
    fun getCustomer(@PathVariable id: Int): CustomerResponse {
        return customerService.findById(id).toResponse()
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
<<<<<<< HEAD
    fun update(@PathVariable id: Int, @RequestBody @Valid customer: PutCustomerRequest) {
=======
    fun update(@PathVariable id: Int, @RequestBody customer: PutCustomerRequest) {
>>>>>>> 641e1e3cfa2afb78e5f2e7e396749840bc9ead62
        val customerSaved = customerService.findById(id)
        customerService.update(customer.toCustomerModel(customerSaved))
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Int) {
        customerService.delete(id)
    }

}