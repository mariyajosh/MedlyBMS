package com.example
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.time.LocalDate

class BookTest : StringSpec({
   val book=BookingService(listOf(Movie("RRR", listOf(Show("9pm","Night",0, LocalDate.now()))),
       Movie("Omg", listOf(Show("9pm","Night",100, LocalDate.now()),Show("6pm","Evening",0, LocalDate.now()))),
       Movie("Fun", listOf(Show("9pm","Night",91, LocalDate.now())))))

    "return unsuccessfull ticket booking"{
        book.ticketGeneration("Omg","Night",7,LocalDate.now().plusDays(4)) shouldBe emptyList()
    }
    "return list of ticket  number"{
        book.ticketGeneration("Fun","Night",5, LocalDate.now().plusDays(4)) shouldBe listOf(92,93,94,95,96)
    }
    "return empty ticket list"{
        book.ticketGeneration("Fun","Night",5, LocalDate.now().plusDays(8)) shouldBe emptyList()
    }

})