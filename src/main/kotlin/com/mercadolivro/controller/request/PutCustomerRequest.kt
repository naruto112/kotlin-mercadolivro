package com.mercadolivro.controller.request

<<<<<<< HEAD
import com.mercadolivro.validation.EmailAvailable
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class PutCustomerRequest(

    @field:NotEmpty(message = "Nome deve ser informado")
    var name: String,

    @field:Email(message = "E-mail deve ser válido")
    @EmailAvailable(message = "E-mail em uso")
=======
data class PutCustomerRequest(
    var name: String,

>>>>>>> 641e1e3cfa2afb78e5f2e7e396749840bc9ead62
    var email: String
)
