package com.example.myfitness.model.dataClasses


object MockSchede {

    var es1 : Esercizio =
        Esercizio("Panca", 3, 8, 2.5, "")
    var es2 : Esercizio =
        Esercizio("Squat", 3, 10, 1.5, "Attenzione alle ginocchia")
    var es3 : Esercizio =
        Esercizio("stacco", 5, 6, 3.0, "Occhio alla schiena")
    var es4 : Esercizio =
        Esercizio("bicipiti ai cavi", 4, 10, 1.5, "")
    var es5 : Esercizio =
        Esercizio("bicipiti ai cavi", 4, 10, 1.5, "")
    var es6 : Esercizio =
        Esercizio("tricipiti con corda", 4, 10, 1.0, "")
    var es7 : Esercizio =
        Esercizio("military press", 5, 8, 2.0, "Spingi con ste spalle")

    var schedaGiornaliera1a = ArrayList(arrayListOf(
        es1,
        es2,
        es3
    ))
    var schedaGiornaliera1b = ArrayList(arrayListOf(
        es4,
        es5
    ))
    var schedaGiornaliera1c = ArrayList(arrayListOf(
        es6,
        es7
    ))

    var schedaGiornaliera2a = ArrayList(arrayListOf(
        es1,
        es2,
        es3
    ))
    var schedaGiornaliera2b = ArrayList(arrayListOf(
        es1,
        es3
    ))
    var schedaGiornaliera2c = ArrayList(arrayListOf(
        es4,
        es7
    ))
    var schedaGiornaliera2d = ArrayList(arrayListOf(
        es5,
        es6,
        es7
    ))

    var schedaGiornaliera3a = ArrayList(arrayListOf(
        es1,
        es2,
        es3,
        es4,
        es5
    ))
    var schedaGiornaliera3b = ArrayList(arrayListOf(
        es6,
        es5
    ))

    var commento1 : String = "Questo è un commento di prova lungoooooooooaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
            "  AHAHAHAHAHHHHAHAH LIHBLWIEBFWUVBPWIDBPVCWIBVPWIR PWBPEW VAFFANCULOOOOOOOOOOOOOOOOOOOOOO WEHIFBLWHWVFPWYVFPYWVF" +
            "WELOIVWEBPWIFVPWIVFPWEFWIEVPWEEEEEEEEEEEEEEEEEEEEEEEEE MERDEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE ieiwbfpi3rvf"


    var mockScheda1: Scheda = Scheda(
        1,
        3,
        "23/08/2019",
        "Forza",
        "comm1",
        MockUtenti.mockUtenteLuca,
        MockUtenti.mockUtenteAle,
        arrayListOf(
            schedaGiornaliera1a,
            schedaGiornaliera1b,
            schedaGiornaliera1c
        )
    )
    var mockScheda2: Scheda = Scheda(
        2,
        4,
        "24/08/2019",
        "Massa",
        "comm2",
        MockUtenti.mockUtenteAndre,
        MockUtenti.mockUtenteAle,
        arrayListOf(
            schedaGiornaliera2a,
            schedaGiornaliera2b,
            schedaGiornaliera2c,
            schedaGiornaliera2d
        )
    )
    var mockScheda3: Scheda = Scheda(
        3,
        2,
        "25/08/2019",
        "Definizione",
        "comm3",
        MockUtenti.mockUtenteLuca,
        MockUtenti.mockUtenteFra,
        arrayListOf(
            schedaGiornaliera3a,
            schedaGiornaliera3b
        )
    )


    var allMockSchede : ArrayList<Scheda> = arrayListOf(
        mockScheda1,
        mockScheda2,
        mockScheda3
    )
}