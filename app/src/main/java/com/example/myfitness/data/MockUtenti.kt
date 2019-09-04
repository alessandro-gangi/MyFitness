package com.example.myfitness.data


object MockUtenti {

    var ut1 = Utente("user1", "mail1", "pass1", null, "nome1", "desc1", false)
    var ut2 = Utente("user2", "mail2", "pass2", null, "nome2", "desc2", false)
    var ut3 = Utente("user3", "mail3", "pass3", null, "nome3", "desc3", false)
    var ut4 = Utente("user4", "mail4", "pass4", null, "nome4", "desc4", false)

    var all1 = Utente("all1", "mail1", "pass1", null, "nome1", "desc1", true)
    var all2 = Utente("all2", "mail2", "pass2", null, "nome2", "desc2", true)
    var all3 = Utente("all3", "mail3", "pass3", null, "nome3", "desc3", true)
    var all4 = Utente("all4", "mail4", "pass4", null, "nome4", "desc4", true)

    var listaUtenti = arrayListOf<Utente>(ut1, ut2, ut3, ut4)
    var listaAllenatori = arrayListOf<Utente>(all1, all2, all3, all4)
    var listaCopleta = arrayListOf<Utente>(ut1, ut2, ut3, ut4, all1, all2, all3, all4)
}