package com.example.myfitness.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfitness.R
import com.example.myfitness.adapters.AllenatoriAdapter
import android.view.*
import android.widget.SearchView
import com.example.myfitness.data.Utente
import kotlinx.android.synthetic.main.fragment_allenatori.view.*


class AllenatoriFragment : Fragment() {
    val TAG = "AllenatoriFragment"

    lateinit var listaAllenatori: ArrayList<Utente>
    lateinit var myAdapter: AllenatoriAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        //listaAllenatori = MyDataManager.retrieve_all_allenatori()
        listaAllenatori = ArrayList()
        myAdapter = AllenatoriAdapter(listaAllenatori)

        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_allenatori, container, false)

        Toast.makeText(activity, "Allenatori: ${listaAllenatori.size}", Toast.LENGTH_LONG).show()
        rootView.allenatori_recycler_view.layoutManager = LinearLayoutManager(activity)
        rootView.allenatori_recycler_view.adapter = myAdapter

        setHasOptionsMenu(true)

        return rootView
    }




    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {

        inflater.inflate(R.menu.search_allenatore_menu, menu)

        val searchItem = menu.findItem(R.id.action_search)
        val searchView: SearchView = searchItem.actionView as SearchView

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                myAdapter.filter(query)
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                myAdapter.filter(newText)
                return true
            }
        })

        super.onCreateOptionsMenu(menu, inflater)
    }



}
