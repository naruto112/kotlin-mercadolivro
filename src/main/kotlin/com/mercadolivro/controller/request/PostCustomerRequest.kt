package com.mercadolivro.controller.request

<<<<<<< HEAD
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty


data class PostCustomerRequest(

    @field:NotEmpty(message = "Nome deve ser informado")
    var name: String,

    @field:Email(message = "E-mail deve ser válido")
=======
import com.mercadolivro.model.CustomerModel

data class PostCustomerRequest(
    var name: String,

>>>>>>> 641e1e3cfa2afb78e5f2e7e396749840bc9ead62
    var email: String
)
