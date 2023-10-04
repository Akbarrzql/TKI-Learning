package com.example.project1tki.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.project1tki.R
import com.example.project1tki.adapter.ShoppingAdapter
import com.example.project1tki.data.shopping.DummyShopping
import com.example.project1tki.data.shopping.Shopping
import com.example.project1tki.databinding.FragmentShoppingBinding

class ShoppingFragment : Fragment() {

    private var _binding: FragmentShoppingBinding? = null
    private val binding get() = _binding!!

    private var list: ArrayList<Shopping> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentShoppingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list.addAll(DummyShopping.listdata)
        showRecyclerCardView()
        chipCategory()
    }

    private fun chipCategory(){
        binding.cgCategory.setOnCheckedChangeListener { _, checkedId ->
            when(checkedId){
                binding.chip1.id -> {
                    list.clear()
                    list.addAll(DummyShopping.listdata.filter { it.category == "Clothes" })
                    showRecyclerCardView()
                }
                binding.chip2.id -> {
                    list.clear()
                    list.addAll(DummyShopping.listdata.filter { it.category == "Shoes" })
                    showRecyclerCardView()
                }
                binding.chip3.id -> {
                    list.clear()
                    list.addAll(DummyShopping.listdata.filter { it.category == "Bag" })
                    showRecyclerCardView()
                }
                else -> {
                    list.clear()
                    list.addAll(DummyShopping.listdata)
                    showRecyclerCardView()
                }
            }
        }
    }

    private fun showRecyclerCardView() {
        binding.rvShopping.setHasFixedSize(true)
        binding.rvShopping.layoutManager = LinearLayoutManager(context)
        val cardViewProductAdapter = ShoppingAdapter(list)
        binding.rvShopping.adapter = cardViewProductAdapter
    }

}