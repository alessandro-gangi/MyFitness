package com.example.myfitness.data


object MockSchede {

    var es1 : Esercizio = Esercizio("Panca", 3, 8, 2.5, "")
    var es2 : Esercizio = Esercizio("Squat", 3, 10, 1.5, "Attenzione alle ginocchia")
    var es3 : Esercizio = Esercizio("stacco", 5, 6, 3.0, "Occhio alla schiena")
    var es4 : Esercizio = Esercizio("bicipiti ai cavi", 4, 10, 1.5, "")
    var es5 : Esercizio = Esercizio("bicipiti ai cavi", 4, 10, 1.5, "")
    var es6 : Esercizio = Esercizio("tricipiti con corda", 4, 10, 1.0, "")
    var es7 : Esercizio = Esercizio("military press", 5, 8, 2.0, "Spingi con ste spalle")

    var schedaGiornaliera1: SchedaGiornaliera= SchedaGiornaliera(arrayListOf(es1, es2, es3))
    var schedaGiornaliera2: SchedaGiornaliera= SchedaGiornaliera(arrayListOf(es2, es4, es6))
    var schedaGiornaliera3: SchedaGiornaliera= SchedaGiornaliera(arrayListOf(es1, es5, es7))
    var schedaGiornaliera4: SchedaGiornaliera= SchedaGiornaliera(arrayListOf(es5, es6, es7))
    var schedaGiornaliera5: SchedaGiornaliera= SchedaGiornaliera(arrayListOf(es3, es4, es5))


    var mockScheda1: Scheda = Scheda(1, "22/08/2019", "Forza", arrayListOf(schedaGiornaliera1, schedaGiornaliera2), "commento 1")
    var mockScheda2: Scheda = Scheda(2, "23/08/2019", "Definizione", arrayListOf(schedaGiornaliera1, schedaGiornaliera2, schedaGiornaliera3),"commento 2")
    var mockScheda3: Scheda = Scheda(3, "24/08/2019", "Massa", arrayListOf(schedaGiornaliera1), "commento 3")
    var mockScheda4: Scheda = Scheda(4, "25/08/2019", "Forza", arrayListOf(schedaGiornaliera1, schedaGiornaliera2, schedaGiornaliera3, schedaGiornaliera4), "commento 4")
    var mockScheda5: Scheda = Scheda(5, "26/08/2019", "Massa", arrayListOf(schedaGiornaliera1, schedaGiornaliera5), "commento 5")

    var allMockSchede : ArrayList<Scheda> = arrayListOf(mockScheda1, mockScheda2, mockScheda3, mockScheda4, mockScheda5)
}