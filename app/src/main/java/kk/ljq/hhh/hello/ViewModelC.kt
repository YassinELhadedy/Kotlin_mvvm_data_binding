package kk.ljq.hhh.hello

import android.content.Context
import android.databinding.ObservableArrayMap
import android.databinding.ObservableField
import android.widget.Toast

/**
 * Created by Elhadedy on 3/16/2017.
 */

class ViewModelC(private val context: MainActivity) : ViewModel {
    private val client: Client
    val cells = ObservableArrayMap<String, String>()
    val winner = ObservableField<String>()


    init {
        client = Client("yassin")
    }

    override fun onCreate() {
        winner.set(client.name)


    }

    fun onSaveClick() {
        winner.set("saxxas")
        Toast.makeText(context, "saas", Toast.LENGTH_SHORT).show()

    }

    override fun onPause() {

    }

    override fun onResume() {

    }

    override fun onDestroy() {

    }
}
