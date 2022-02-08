package com.mercadolivro.controller.request

import com.fasterxml.jackson.annotation.JsonAlias
import java.math.BigDecimal
<<<<<<< HEAD
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class PostBookRequest(

     @field:NotEmpty(message = "Nome deve ser informado")
     var name: String,

     @field:NotNull(message = "Price deve ser informado")
     var price: BigDecimal,


=======

data class PostBookRequest(
     var name: String,

     var price: BigDecimal,

>>>>>>> 641e1e3cfa2afb78e5f2e7e396749840bc9ead62
     @JsonAlias("customer_id")
     var customerId: Int
)
