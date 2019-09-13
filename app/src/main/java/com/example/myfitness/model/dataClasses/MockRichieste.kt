package com.example.myfitness.model.dataClasses



object MockRichieste {

    var mockRichiestaAleToLuca: Richiesta = Richiesta(
        richiestaId = 1,
        utente = MockUtenti.mockUtenteAle,
        allenatore = MockUtenti.mockUtenteLuca,
        data = "13/09/2019",
        numGiorni = 3,
        tipologia = "Forza",
        commento = "Ciao sono Ale e richiedo una scheda a Luca"
    )

    var mockRichiestaAleToAndrea: Richiesta = Richiesta(
        richiestaId = 1,
        utente = MockUtenti.mockUtenteAle,
        allenatore = MockUtenti.mockUtenteAndre,
        data = "13/09/2019",
        numGiorni = 2,
        tipologia = "Massa",
        commento = "Ciao sono Ale e richiedo una scheda ad Andrea"
    )




}