package com.example.project1tki.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.project1tki.data.shopping.Shopping
import com.example.project1tki.databinding.ItemShoppingBinding

class ShoppingAdapter(private val listProduct: ArrayList<Shopping>) : RecyclerView.Adapter<ShoppingAdapter.ViewHolder>() {

    class ViewHolder(var binding: ItemShoppingBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemShoppingBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return listProduct.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = listProduct[position]

        holder.binding.apply {
            tvItemName.text = product.name
            tvItemPrice.text = "Rp. ${product.price.toString().reversed().chunked(3).joinToString(".").reversed()}"
            tvItemDetail.text = product.nameProduct
            Glide.with(holder.itemView)
                .load(product.photo)
                .into(ivItem)
        }
    }
}