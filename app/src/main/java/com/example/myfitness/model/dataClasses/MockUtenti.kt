package com.example.myfitness.model.dataClasses



object MockUtenti {

    var mockUtenteAle: Utente = Utente(
        "ghingo",
        "ale@gmail.com",
        "alepass",
        false,
       "Alessandro",
        "Gangi", 23, "Ciao sono Alessandro Gangi", null, 68.5,
       172, 'M', "ghingo", null)

    var mockUtenteFra: Utente = Utente("fralicca", "fra@gmail.com", "frapass", false,
        "Francesco", "Liccardo", 24, "Ciao sono Francesco Liccardo", null, 65.0,
        174, 'M', null, null)

    var mockUtenteLuca: Utente = Utente("lucacilla", "luca@gmail.com", "lucapass", true,
        "Luca", "Cillario", 24, "Ciao sono Luca Cillario", null, 64.0,
        173, 'M', null, null)

    var allMockUtenti : ArrayList<Utente> = arrayListOf(mockUtenteAle, mockUtenteFra)


}