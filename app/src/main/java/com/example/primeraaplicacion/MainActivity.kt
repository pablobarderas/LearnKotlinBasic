package com.example.primeraaplicacion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lección 1
        //variablesYconstantes()

        // Lección 2
        //tiposDeDatos()

        // Lección 3
        //sentenciaIf()

        // Lección 4
        //sentenciaWhen()

        // Lección 5
        //arrays()

        // Lección 6
        maps()
    }

    // Functions

    private fun variablesYconstantes(){
        // Variables
        var myFirstVariable = "Hello Android"
        myFirstVariable = "Cambiada"
        println(myFirstVariable)

        // Constantes
        val myFirstConstant= 5
        println(myFirstConstant)
    }

    private fun tiposDeDatos(){
        // Strings
        val cadena1 = "Hola"
        val cadena2 = "cómo esás preciosa?"
        val cadena3 = cadena1 + ",  " + cadena2
        println(cadena3)

        // Enteros
        val numInt = 1
        val numInt2 = 3
        println(numInt+numInt2)

        // Decimales
        val myDouble = 2.5
        val myDouble2: Float = 1.5f

        // Hace la conversión automáticamente
        println(myDouble+myDouble2)

        // Booleanos
        val repetir = true
        val repetir2 = false

        println(repetir == repetir2)
        println(repetir && repetir2)
    }

    private fun sentenciaIf(){

        val myNumber = 11

        // Operadores lógicos
        // && operador 'and'
        // || operador 'or'
        // ! operador 'no'

        // Sentencia if y else if

        if(myNumber < 10) {
            println("$myNumber es menor que 10 y menor que 5")
        }else if(myNumber > 5){
            println("$myNumber es menor que 10 y mayor que 5")
        }
    }

    private fun sentenciaWhen(){

        // When con String
        val country = "Casita"

        when (country){
            "Casita", "Zamora", "Madrid"-> {
                println("Esto es España")
            } else -> {
                println("No tengo ni puta idea")
            }
        }

        // When con Int
        val age = 10

        when (age){
            in 0..2-> {
                println("Eres un bebé")
            } in 3..10 -> {
                println("Eres un niño")
            } in 11..17 -> {
                println("Eres un adolescente")
            } in 18..69 -> {
                println("Eres un adulto")
            } in 70..99 -> {
                println("Eres un viejo")
            } else ->{
                println("No existes")
            }
        }
    }

    private fun arrays(){
        val name = "Pablo"
        val surname = "Barderas"
        val company = "BarderasDev"
        val age = "21"

        // Crear un array
        val myArray = arrayListOf<String>()

        // Añadir datos de uno en uno
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)

        println(myArray)

        // Añadir un conjunto de datos
        myArray.addAll(listOf("Hola", "Cómo te va"))

        println(myArray)

        // Acceso a datos
        val myCompany = myArray[2]

        println("My company is: $myCompany")

        // Modificar datos
        myArray[5] = "qué tal estás"

        println(myArray)

        // Eliminar datos
        myArray.removeAt(4)

        println(myArray)

        // Recorrer datos
        myArray.forEach{
            println(it)
        }

        // Otras operaciones
        val numElements = myArray.count() // Cuenta los elementos del Array
        println(numElements)

        myArray.clear() // Vacía el array

        println(myArray.count())

        myArray.first()
        myArray.last()

        myArray.sort()



    }

    private fun maps(){

        // Sintaxis (Mapa o diccionario, seleccionando el tipo de dato de la
        // clave y a continuación del contenido asociado a la misma)
        var myMap: Map<String,Int> = mapOf()

        // Añadir elementos (Se puede hacer también cuando se crea)
        myMap = mapOf("Pablo" to 1, "Barderas" to 2)

        println(myMap)

    }
}
