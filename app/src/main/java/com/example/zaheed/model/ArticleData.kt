package com.example.zaheed.model

object ArticleData {
    private val descArticle = arrayOf(
        "Islam adalah agama monotheistik yang didirikan oleh Nabi Muhammad SAW pada abad ke-7 Masehi. Islam mengajarkan keimanan kepada Allah, kepatuhan terhadap hukum agama, dan berbagai aspek kehidupan lainnya.",
        "Salah satu pilar utama Islam adalah pelaksanaan shalat lima waktu sehari-hari. Shalat adalah cara untuk berkomunikasi langsung dengan Allah dan memperkuat hubungan spiritual.",
        "Al-Quran adalah kitab suci dalam Islam. Kitab ini dianggap sebagai wahyu langsung dari Allah kepada Nabi Muhammad SAW dan mengandung petunjuk untuk seluruh umat manusia.",
        "Haji adalah salah satu kewajiban utama dalam Islam. Setiap Muslim yang mampu secara finansial dan fisik diharuskan untuk melakukan perjalanan ke Kota Mekah sekali seumur hidup.",
        "Zakat adalah kewajiban memberikan sebagian dari harta kekayaan kepada yang membutuhkan. Ini adalah salah satu cara utama Islam untuk membantu mereka yang kurang beruntung.",
    )

    private val titleArticle = arrayOf(
        "Pengenalan Islam",
        "Shalat dalam Islam",
        "Al-Quran: Kitab Suci Islam",
        "Arti dan Makna Haji",
        "Zakat: Sedekah dalam Islam",
    )

    private val kategoriArticle = arrayOf(
        "Pengenalan Islam",
        "Ibadah dalam Islam",
        "Kitab Suci",
        "Ibadah Haji",
        "Kewajiban Sosial",
    )

    val listArticle: ArrayList<ArticleModel>
        get() {
            val list = arrayListOf<ArticleModel>()
            for (position in descArticle.indices) {
                val article = ArticleModel(
                    descArticle[position],
                    titleArticle[position],
                    kategoriArticle[position]
                )
                list.add(article)
            }
            return list
        }
}