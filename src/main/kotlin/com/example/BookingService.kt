package com.example
import java.util.Scanner
 class Book(private val MovieData:List<Movie>){
    val input=Scanner(System.`in`)
    var selectedMovieName=""
    var selectedShowType=""
    fun printData(){
        MovieData.forEach { it->
            println("${it.movie} ${it.show} ")
        }
    }

    fun selectMovie(){
        selectedMovieName=input.nextLine()

    }
    fun selectShowType(){
        selectedShowType=input.nextLine()
        //ticketGeneration(selectedMovieName,selectedShowType)
    }

    fun ticketGeneration(movie:String,showType:String):String{
        MovieData.forEach {
            if(it.movie.equals(movie,true))
            {
              it.show.forEach { s->
                  if(s.showType.equals(showType) && s.BookedSeats< AvaiableSeats)
                  {
                      s.BookedSeats+=1
                      return s.BookedSeats.toString()
                  }}

            }

        }
        return "Ticket is not booked as Theatre is full"
    }


}