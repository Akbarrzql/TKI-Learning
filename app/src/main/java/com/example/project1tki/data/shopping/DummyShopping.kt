package com.example.project1tki.data.shopping

object DummyShopping {
    private val name = arrayOf(
        "Toko Makmur",
        "Toko Jaya",
        "Toko Sebelah",
        "Toko Kita",
        "Toko Kamu",
        "Toko Dia",
        "Toko Saya",
        "Toko Padie",
        "Toko Oren",
        "Toko Merah",
    )

    private val nameProduk = arrayOf(
        "Baju Kerja",
        "Baju Santai",
        "Sweter",
        "Jacket",
        "Kemeja",
        "Kaos",
        "Hoody",
        "Kaos Warna Warni",
        "Baju 1 Set",
        "Baju Polo",
    )

    private val category = arrayOf(
        "Clothes",
        "Shoes",
        "Bag",
        "Clothes",
        "Shoes",
        "Bag",
        "Clothes",
        "Shoes",
        "Bag",
        "Clothes",
    )

    private val price = intArrayOf(
        10000,
        20000,
        30000,
        40000,
        50000,
        60000,
        70000,
        80000,
        90000,
        100000
    )

    private val imageProduct = arrayOf(
        "https://images.unsplash.com/photo-1467043237213-65f2da53396f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1887&q=80",
        "https://images.unsplash.com/photo-1556905055-8f358a7a47b2?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8Y2xvdGhlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60",
        "https://images.unsplash.com/photo-1620799140408-edc6dcb6d633?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fGNsb3RoZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",
        "https://images.unsplash.com/photo-1591047139829-d91aecb6caea?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTZ8fGNsb3RoZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",
        "https://images.unsplash.com/photo-1551488831-00ddcb6c6bd3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzR8fGNsb3RoZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",
        "https://images.unsplash.com/photo-1564584217132-2271feaeb3c5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzJ8fGNsb3RoZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",
        "https://images.unsplash.com/photo-1620799140188-3b2a02fd9a77?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzZ8fGNsb3RoZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",
        "https://images.unsplash.com/photo-1617331721458-bd3bd3f9c7f8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDF8fGNsb3RoZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",
        "https://images.unsplash.com/photo-1544441893-675973e31985?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTZ8fGNsb3RoZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",
        "https://images.unsplash.com/photo-1586363104862-3a5e2ab60d99?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NjJ8fGNsb3RoZXN8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60",

    )

    val listdata: ArrayList<Shopping>
        get() {
            val list = arrayListOf<Shopping>()
            for (position in name.indices) {
                val shopping = Shopping()
                shopping.name = name[position]
                shopping.nameProduct = nameProduk[position]
                shopping.category = category[position]
                shopping.price = price[position]
                shopping.photo = imageProduct[position]
                list.add(shopping)
            }
            return list
        }
}