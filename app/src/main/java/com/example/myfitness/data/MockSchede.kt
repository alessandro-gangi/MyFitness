package com.example.myfitness.data

import java.time.LocalDate
import java.util.*
import kotlin.collections.ArrayList

object MockSchede {

    var es1 : Esercizio = Esercizio("Panca", 3, 8, 2.5, "")
    var es2 : Esercizio = Esercizio("Squat", 3, 10, 1.5, "Attenzione alle ginocchia")
    var es3 : Esercizio = Esercizio("stacco", 5, 6, 3.0, "Occhio alla schiena")
    var es4 : Esercizio = Esercizio("bicipiti ai cavi", 4, 10, 1.5, "")
    var es5 : Esercizio = Esercizio("bicipiti ai cavi", 4, 10, 1.5, "")
    var es6 : Esercizio = Esercizio("tricipiti con corda", 4, 10, 1.0, "")
    var es7 : Esercizio = Esercizio("military press", 5, 8, 2.0, "Spingi con ste spalle")

    var listaEs1: ArrayList<Esercizio> = arrayListOf(es1, es2, es3)
    var listaEs2: ArrayList<Esercizio> = arrayListOf(es2, es4, es6)
    var listaEs3: ArrayList<Esercizio> = arrayListOf(es1, es5, es7)
    var listaEs4: ArrayList<Esercizio> = arrayListOf(es5, es6, es7)
    var listaEs5: ArrayList<Esercizio> = arrayListOf(es3, es4, es5)

    var schede = arrayListOf(
        Scheda(1, "22/08/2019", "Forza", 3, listaEs1, "commento 1"),
        Scheda(2, "23/08/2019", "Definizione", 4, listaEs2, "commento 2"),
        Scheda(3, "24/08/2019", "Massa", 3, listaEs3, "commento 3"),
        Scheda(4, "25/08/2019", "Forza", 2, listaEs4, "commento 4"),
        Scheda(5, "26/08/2019", "Massa", 5, listaEs5, "commento 5")
    )

    var mockScheda1: Scheda = Scheda(1, "22/08/2019", "Forza", 3, listaEs1, "commento 1")
    var mockScheda2: Scheda = Scheda(2, "23/08/2019", "Definizione", 4, listaEs2, "commento 2")
    var mockScheda3: Scheda = Scheda(3, "24/08/2019", "Massa", 3, listaEs3, "commento 3")
    var mockScheda4: Scheda = Scheda(4, "25/08/2019", "Forza", 2, listaEs4, "commento 4")
    var mockScheda5: Scheda = Scheda(5, "26/08/2019", "Massa", 5, listaEs5, "commento 5")

}