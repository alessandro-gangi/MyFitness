package com.example.myfitness.data


object MockSchede {

    var es1 : Esercizio = Esercizio(1, 1, 1, "Panca", 3, 8, 2.5, "")
    var es2 : Esercizio = Esercizio(1, 1, 2, "Squat", 3, 10, 1.5, "Attenzione alle ginocchia")
    var es3 : Esercizio = Esercizio(1,1,3,"stacco", 5, 6, 3.0, "Occhio alla schiena")
    var es4 : Esercizio = Esercizio(1,2,1,"bicipiti ai cavi", 4, 10, 1.5, "")
    var es5 : Esercizio = Esercizio(1,2,2,"bicipiti ai cavi", 4, 10, 1.5, "")
    var es6 : Esercizio = Esercizio(1,3,1,"tricipiti con corda", 4, 10, 1.0, "")
    var es7 : Esercizio = Esercizio(1,3,2,"military press", 5, 8, 2.0, "Spingi con ste spalle")

    var schedaGiornaliera1a: SchedaGiornaliera= SchedaGiornaliera(1, 1, arrayListOf(es1, es2, es3))
    var schedaGiornaliera1b: SchedaGiornaliera= SchedaGiornaliera(1, 2, arrayListOf(es4, es5))
    var schedaGiornaliera1c: SchedaGiornaliera= SchedaGiornaliera(1, 3, arrayListOf(es6, es7))

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


    var mockScheda1: Scheda = Scheda(1, 3, "23/08/2019","Forza", "", "", "" ,arrayListOf(schedaGiornaliera1a, schedaGiornaliera1b, schedaGiornaliera1c))
    var mockScheda2: Scheda = mockScheda1
    var mockScheda3: Scheda = mockScheda1
    var mockScheda4: Scheda = mockScheda1
    var mockScheda5: Scheda = mockScheda1

    var allMockSchede : ArrayList<Scheda> = arrayListOf(mockScheda1, mockScheda2, mockScheda3, mockScheda4, mockScheda5)
}