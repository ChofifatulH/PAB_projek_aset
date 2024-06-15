// Prasarana1Fragment.kt
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.l0122037.pab_android_projek_aset.R
import com.l0122037.pab_android_projek_aset.ui.prasarana.Prasarana1Adapter

class Prasarana1Fragment<Prasarana> : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var prasarana1Adapter: Prasarana1Adapter
    private lateinit var prasaranaList: MutableList<Prasarana>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_prasarana1, container, false)

        // Initialize RecyclerView
        recyclerView = view.findViewById(R.id.recyclerViewPrasarana1)
        recyclerView.layoutManager = LinearLayoutManager(activity)

        // Initialize Data
        prasaranaList = mutableListOf(
            Prasarana("Nama Prasarana 1", "Jenis 1"),
            Prasarana("Nama Prasarana 2", "Jenis 2")
            // Tambahkan lebih banyak data sesuai kebutuhan
        )

        // Set Adapter
        prasarana1Adapter = Prasarana1Adapter(prasaranaList)
        recyclerView.adapter = prasarana1Adapter

        return view
    }
}
