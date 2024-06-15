package com.l0122037.pab_android_projek_aset.ui.aset

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TableLayout
import androidx.fragment.app.Fragment
import com.l0122037.pab_android_projek_aset.R

class TabelDataGedungFragment : Fragment() {

    private lateinit var spinnerTahun: Spinner
    private lateinit var buttonPilihTahun: Button
    private lateinit var tableLayout: TableLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tabel_data_gedung, container, false)
        spinnerTahun = view.findViewById(R.id.spinner_tahun)
        buttonPilihTahun = view.findViewById(R.id.button_pilih_tahun)
        tableLayout = view.findViewById(R.id.tableLayout)

        // Set up spinner
        ArrayAdapter.createFromResource(
            requireContext(),
            R.array.tahun_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerTahun.adapter = adapter
        }

        // Handle button click
        buttonPilihTahun.setOnClickListener {
            // TODO: Load data based on selected year
        }

        return view
    }

    // Function to load data into the table (to be implemented)
    private fun loadDataForYear(year: String) {
        // TODO: Implement data loading and populate table
    }
}