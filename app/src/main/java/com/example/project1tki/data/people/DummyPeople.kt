package com.example.project1tki.data.people

object DummyPeople {
    private val namePeople = arrayOf(
        "Bill Gates",
        "Steve Jobs",
        "Mark Zuckerberg",
        "Elon Musk",
        "Jack Ma",
        "Jeff Bezos",
        "Larry Page",
        "Sergey Brin",
        "Larry Ellison",
        "Michael Dell",
        "Safra Catz",
        "Satya Nadella",
        "Tim Cook",
        "Susan Wojcicki",
    )

    private val jobdescPeople = arrayOf(
        "Microsoft",
        "Apple",
        "Facebook",
        "Tesla",
        "Alibaba",
        "Amazon",
        "Google",
        "Google",
        "Oracle",
        "Dell",
        "Oracle",
        "Microsoft",
        "Apple",
        "YouTube",
    )

    private val imagePeople = arrayOf(
        "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Bill_Gates_2017_%28cropped%29.jpg/330px-Bill_Gates_2017_%28cropped%29.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/Steve_Jobs_Headshot_2010-CROP_%28cropped_2%29.jpg/330px-Steve_Jobs_Headshot_2010-CROP_%28cropped_2%29.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Mark_Zuckerberg_F8_2019_Keynote_%2832830578717%29_%28cropped%29.jpg/330px-Mark_Zuckerberg_F8_2019_Keynote_%2832830578717%29_%28cropped%29.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Elon_Musk_Royal_Society_%28crop2%29.jpg/330px-Elon_Musk_Royal_Society_%28crop2%29.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Enabling_eCommerce-_Small_Enterprises%2C_Global_Players_%2839008130265%29_%28cropped%29.jpg/330px-Enabling_eCommerce-_Small_Enterprises%2C_Global_Players_%2839008130265%29_%28cropped%29.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Jeff_Bezos_at_Amazon_Spheres_Grand_Opening_in_Seattle_-_2018_%2839074799225%29_%28cropped%29.jpg/330px-Jeff_Bezos_at_Amazon_Spheres_Grand_Opening_in_Seattle_-_2018_%2839074799225%29_%28cropped%29.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Larry_Page_in_the_European_Parliament%2C_17.06.2009_%28cropped%29.jpg/330px-Larry_Page_in_the_European_Parliament%2C_17.06.2009_%28cropped%29.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Larry_Page_in_the_European_Parliament%2C_17.06.2009_%28cropped%29.jpg/330px-Larry_Page_in_the_European_Parliament%2C_17.06.2009_%28cropped%29.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ec/Larry_Page_in_the_European_Parliament%2C_17.06.2009_%28cropped%29.jpg/330px-Larry_Page_in_the_European_Parliament%2C_17.06.2009_%28cropped%29.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Michael_Dell_2010.jpg/330px-Michael_Dell_2010.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/Safra_Catz%2C_official_portrait%2C_Homeland_Security_Council.jpg/330px-Safra_Catz%2C_official_portrait%2C_Homeland_Security_Council.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Satya_Nadella.jpg/330px-Satya_Nadella.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/Visit_of_Tim_Cook_to_the_European_Commission_-_P061904-946789.jpg/330px-Visit_of_Tim_Cook_to_the_European_Commission_-_P061904-946789.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Susan_Wojcicki_%2829393944130%29_%28cropped%29.jpg/330px-Susan_Wojcicki_%2829393944130%29_%28cropped%29.jpg",
    )

    val listData: ArrayList<People>
        get() {
            val list = arrayListOf<People>()
            for (position in namePeople.indices) {
                val people = People()
                people.namePeople = namePeople[position]
                people.jobdescPeople = jobdescPeople[position]
                people.imagePeople = imagePeople[position]
                list.add(people)
            }
            return list
        }
}