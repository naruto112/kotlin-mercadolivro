package com.mercadolivro.service

import com.mercadolivro.enums.BookStatus
<<<<<<< HEAD
import com.mercadolivro.enums.Errors
import com.mercadolivro.exception.NotFoundException
=======
>>>>>>> 641e1e3cfa2afb78e5f2e7e396749840bc9ead62
import com.mercadolivro.model.BookModel
import com.mercadolivro.model.CustomerModel
import com.mercadolivro.repository.BookrRepository
import org.springframework.data.domain.Page
import org.springframework.stereotype.Service
import org.springframework.data.domain.Pageable

@Service
class BookService(
    val bookRepository: BookrRepository
) {
    fun create(book: BookModel) {
        bookRepository.save(book)
    }

    fun findAll(pageable: Pageable): Page<BookModel> {
         return bookRepository.findAll(pageable)
    }

    fun findActives(pageable: Pageable): Page<BookModel> {
        return bookRepository.findByStatus(BookStatus.ATIVO, pageable)
    }

    fun findById(id: Int): BookModel {
<<<<<<< HEAD
        return bookRepository.findById(id).orElseThrow{ NotFoundException(Errors.ML101.message.format(id), Errors.ML101.code)}
=======
        return bookRepository.findById(id).orElseThrow{ Exception("Não existe este recurso")}
>>>>>>> 641e1e3cfa2afb78e5f2e7e396749840bc9ead62
    }

    fun delete(id: Int) {
        val book = findById(id)

        book.status = BookStatus.CANCELADO

        update(book)
    }

    fun update(book: BookModel) {
        bookRepository.save(book)
    }

    fun deleteByCustomer(customer: CustomerModel) {
        val books = bookRepository.findByCustomer(customer)
        for(book in books) {
            book.status = BookStatus.DELETADO
        }
        bookRepository.saveAll(books)
    }

<<<<<<< HEAD
    fun findAllByIds(bookIds: Set<Int>): List<BookModel> {
        return bookRepository.findAllById(bookIds).toList()
    }

    fun purchase(books: MutableList<BookModel>) {
        books.map{
            it.status = BookStatus.VENDIDO
        }
        bookRepository.saveAll(books)
    }

=======
>>>>>>> 641e1e3cfa2afb78e5f2e7e396749840bc9ead62
}
