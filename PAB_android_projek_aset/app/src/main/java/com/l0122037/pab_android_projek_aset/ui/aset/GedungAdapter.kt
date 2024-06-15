package com.l0122037.pab_android_projek_aset.ui.aset

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.l0122037.pab_android_projek_aset.R

class GedungAdapter(private val gedungList: List<Gedung>) : RecyclerView.Adapter<GedungAdapter.GedungViewHolder>() {

    class GedungViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val noTextView: TextView = view.findViewById(R.id.noTextView)
        val descriptionTextView: TextView = view.findViewById(R.id.descriptionTextView)
        val jumlahTextView: TextView = view.findViewById(R.id.jumlahTextView)
        val luasTextView: TextView = view.findViewById(R.id.luasTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GedungViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_gedung, parent, false)
        return GedungViewHolder(view)
    }

    override fun onBindViewHolder(holder: GedungViewHolder, position: Int) {
        val gedung = gedungList[position]
        holder.noTextView.text = gedung.no
        holder.descriptionTextView.text = gedung.description
        holder.jumlahTextView.text = gedung.jumlah
        holder.luasTextView.text = gedung.luas
    }

    override fun getItemCount() = gedungList.size
}
