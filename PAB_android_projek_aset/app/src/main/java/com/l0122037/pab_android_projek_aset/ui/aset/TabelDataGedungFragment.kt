package com.l0122037.pab_android_projek_aset.ui.aset

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.l0122037.pab_android_projek_aset.R

class TabelDataGedungFragment : Fragment() {

    private lateinit var spinnerTahun: Spinner
    private lateinit var buttonPilihTahun: Button
    private lateinit var recyclerView: RecyclerView
    private lateinit var gedungAdapter: GedungAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tabel_data_gedung, container, false)
        spinnerTahun = view.findViewById(R.id.spinner_tahun)
        buttonPilihTahun = view.findViewById(R.id.button_pilih_tahun)
        recyclerView = view.findViewById(R.id.recycler_view)

        // Set up spinner
        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.tahun_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerTahun.adapter = adapter
        }

        // Set up RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)
        gedungAdapter = GedungAdapter(emptyList())
        recyclerView.adapter = gedungAdapter

        // Handle button click
        buttonPilihTahun.setOnClickListener {
            val selectedYear = spinnerTahun.selectedItem.toString()
            loadDataForYear(selectedYear)
        }

        return view
    }

    // Function to load data into the table
    private fun loadDataForYear(year: String) {
        val gedungList = resources.getStringArray(R.array.gedung_data)
            .map { it.split(",") }
            .map { Gedung(it[0], it[1], it[2], it[3]) }
            .filter { it.no == year }

        gedungAdapter = GedungAdapter(gedungList)
        recyclerView.adapter = gedungAdapter
    }
}
