package com.mercadolivro.model

import com.mercadolivro.enums.BookStatus
<<<<<<< HEAD
import com.mercadolivro.enums.Errors
import com.mercadolivro.exception.BadRequestException
=======
>>>>>>> 641e1e3cfa2afb78e5f2e7e396749840bc9ead62
import java.math.BigDecimal
import javax.persistence.*

@Entity(name = "book")
data class BookModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column
    var name: String,

    @Column
    var price: BigDecimal,

    @ManyToOne
    @JoinColumn(name = "customer_id")
    var customer: CustomerModel?
){
    @Column
    @Enumerated(EnumType.STRING)
    var status: BookStatus? = null
        set(value) {
            if (field == BookStatus.CANCELADO || field == BookStatus.DELETADO)
<<<<<<< HEAD
                throw BadRequestException(Errors.ML102.message.format(field), Errors.ML102.code)
=======
                throw Exception("Não é possivel alterar um livro com status ${field}")
>>>>>>> 641e1e3cfa2afb78e5f2e7e396749840bc9ead62

            field = value
        }
    constructor(id: Int? = null,
                name: String,
                price: BigDecimal,
                customer: CustomerModel? = null,
                status: BookStatus?): this(id, name, price, customer) {
        this.status = status
    }
}