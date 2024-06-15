package com.l0122037.pab_android_projek_aset.ui.prasarana

// Prasarana1Adapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.l0122037.pab_android_projek_aset.R

class Prasarana1Adapter(private val prasaranaList: List<Prasarana>) :
    RecyclerView.Adapter<Prasarana1Adapter.PrasaranaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PrasaranaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_list_item_prasarana1, parent, false)
        return PrasaranaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PrasaranaViewHolder, position: Int) {
        val prasarana = prasaranaList[position]
        holder.txtNamaPrasarana.text = prasarana.nama
        holder.txtJenis.text = prasarana.jenis
    }

    override fun getItemCount(): Int = prasaranaList.size

    inner class PrasaranaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtNamaPrasarana: TextView = itemView.findViewById(R.id.txtNamaPrasarana)
        val txtJenis: TextView = itemView.findViewById(R.id.txtJenis)
    }
}
