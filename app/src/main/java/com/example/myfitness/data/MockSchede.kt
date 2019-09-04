package com.example.myfitness.data


object MockSchede {

    var es1 : Esercizio = Esercizio("Panca", 3, 8, 2.5, "")
    var es2 : Esercizio = Esercizio("Squat", 3, 10, 1.5, "Attenzione alle ginocchia")
    var es3 : Esercizio = Esercizio("stacco", 5, 6, 3.0, "Occhio alla schiena")
    var es4 : Esercizio = Esercizio("bicipiti ai cavi", 4, 10, 1.5, "")
    var es5 : Esercizio = Esercizio("bicipiti ai cavi", 4, 10, 1.5, "")
    var es6 : Esercizio = Esercizio("tricipiti con corda", 4, 10, 1.0, "")
    var es7 : Esercizio = Esercizio("military press", 5, 8, 2.0, "Spingi con ste spalle")

    var schedaGiornaliera1a: SchedaGiornaliera= SchedaGiornaliera(1, 1, arrayListOf(es1, es2, es3))
    var schedaGiornaliera1b: SchedaGiornaliera= SchedaGiornaliera(1, 2, arrayListOf(es2, es4, es6))

    var schedaGiornaliera2a: SchedaGiornaliera= SchedaGiornaliera(2, 1, arrayListOf(es1, es2, es3))
    var schedaGiornaliera2b: SchedaGiornaliera= SchedaGiornaliera(2, 2, arrayListOf(es2, es4, es6))
    var schedaGiornaliera2c: SchedaGiornaliera= SchedaGiornaliera(2, 3, arrayListOf(es1, es5, es7))

    var schedaGiornaliera3a: SchedaGiornaliera= SchedaGiornaliera(3, 1, arrayListOf(es1, es2, es3))

    var schedaGiornaliera4a: SchedaGiornaliera= SchedaGiornaliera(4, 1, arrayListOf(es1, es2, es3))
    var schedaGiornaliera4b: SchedaGiornaliera= SchedaGiornaliera(4, 2, arrayListOf(es2, es4, es6))
    var schedaGiornaliera4c: SchedaGiornaliera= SchedaGiornaliera(4, 3, arrayListOf(es1, es5, es7))
    var schedaGiornaliera4d: SchedaGiornaliera= SchedaGiornaliera(4, 4, arrayListOf(es5, es6, es7))

    var schedaGiornaliera5a: SchedaGiornaliera= SchedaGiornaliera(5, 1, arrayListOf(es5, es6, es7))
    var schedaGiornaliera5b: SchedaGiornaliera= SchedaGiornaliera(5, 2, arrayListOf(es3, es4, es5))

    var commento1 : String = "Questo è un commento di prova lungoooooooooaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "  AHAHAHAHAHHHHAHAH LIHBLWIEBFWUVBPWIDBPVCWIBVPWIR PWBPEW VAFFANCULOOOOOOOOOOOOOOOOOOOOOO WEHIFBLWHWVFPWYVFPYWVF" +
            "WELOIVWEBPWIFVPWIVFPWEFWIEVPWEEEEEEEEEEEEEEEEEEEEEEEEE MERDEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE ieiwbfpi3rvf"


    var mockScheda1: Scheda = Scheda(1, "22/08/2019", "Forza", arrayListOf(schedaGiornaliera1a, schedaGiornaliera1b), commento1)
    var mockScheda2: Scheda = Scheda(2, "23/08/2019", "Definizione", arrayListOf(schedaGiornaliera2a, schedaGiornaliera2b, schedaGiornaliera2c),"commento 2")
    var mockScheda3: Scheda = Scheda(3, "24/08/2019", "Massa", arrayListOf(schedaGiornaliera3a), "commento 3")
    var mockScheda4: Scheda = Scheda(4, "25/08/2019", "Forza", arrayListOf(schedaGiornaliera4a, schedaGiornaliera4b, schedaGiornaliera4c, schedaGiornaliera4d), "commento 4")
    var mockScheda5: Scheda = Scheda(5, "26/08/2019", "Massa", arrayListOf(schedaGiornaliera5a, schedaGiornaliera5b), "commento 5")

    var allMockSchede : ArrayList<Scheda> = arrayListOf(mockScheda1, mockScheda2, mockScheda3, mockScheda4, mockScheda5)
}