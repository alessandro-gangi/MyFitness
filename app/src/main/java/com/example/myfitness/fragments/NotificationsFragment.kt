
package com.example.myfitness.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myfitness.R


class NotificationsFragment : Fragment() {
    val TAG = "NotificationsFragment"

    val MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE: Int = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_notifications, container, false)

        return view
    }


}
