package com.example.wahabmovie


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Eternal Marvel"

        val superherokuList = listOf<Eternal>(
            Eternal(
                R.drawable.sersi,
                nameEternal = "SERSI",
                descEternal = "Sersi diperankan oleh Gemma Chan. Tokoh satu ini memiliki kekuatan mampu memanipulasi materi dalam skala besar untuk kemudian diubah menjadi bentuk apapun yang ia inginkan. Dalam komik, Sersi bekerja sebagai seorang pesulap dan memanfaatkan keahliannya itu untuk mendapatkan uang. Namun, dalam film, Sersi bekerja sebagai petugas museum.",
                desc2Eternal = "Pemeran : Gemma Chan \n" +
                        "Lahir\t29 November 1982 (umur 39)\n" +
                        "London, Britania Raya\n" +
                        "Almamater\tUniversitas Oxford\n" +
                        "Pekerjaan\tAktris\n" +
                        "Tahun aktif\t2006–sekarang"

            ),
            Eternal(
                R.drawable.phastos,
                nameEternal = "PHASTOS",
                descEternal = "Anggota Eternals selanjutnya adalah Phastos yang dimainkan oleh Brian Tyree Henry. Phastos merupakan jagoan teknologi di timnya, ia bisa merakit apa saja yang berkaitan dengan bidang teknologi dan senjata. Kekuatan yang dimilikinya adalah kecepatan, kekuatan, dan terbang. Tak hanya itu, ia juga memiliki senjata palu spesial yang dapat memancarkan energi khusus.",
                desc2Eternal = "Pemeran : Brian Tyree Henry \n" +
                        "Lahir\t31 Maret 1982 (umur 40)[1][2][3]\n" +
                        "Fayetteville, Carolina Utara, Amerika Serikat[1]\n" +
                        "Pendidikan\tMorehouse College (BA)\n" +
                        "Universitas Yale (MFA)\n" +
                        "Pekerjaan\tAktor\n" +
                        "Tahun aktif\t2007–sekarang"
            ),
            Eternal(
                R.drawable.makkari,
                nameEternal = "MAKKARI",
                descEternal = "Makkari dikenal sebagai seorang Eternals dengan kemampuan larinya yang secepat cahaya. Bahkan, ia juga mempunyai kekuatan refleks tingkat tinggi dan dapat mengendarai berbagai jenis kendaraan.",
                desc2Eternal = "Pemeran : Lauren Ridloff \n" +
                        "American deaf actress and teacher"
            ),
            Eternal(
                R.drawable.kingo,
                nameEternal = "KINGO",
                descEternal = "Diperankan oleh Kumail Nanjiani, tokoh Kingo dalam The Eternals juga memiliki perbedaan mencolok antara film dan komik. Dalam film, Kingo merupakan seorang ahli pedang yang tinggal di Jepang. Semenatar di film, Kingo digambarkan sebagai seorang artis Bollywood yang sangat mencintai ketenarannya. Di balik itu, Kingo memiliki kekuatan untuk menembahkan energi kosmik dari tangan kosong.",
                desc2Eternal = "Pemeran : Kumail Nanjiani \n" +
                        "Lahir\t2 Mei 1978 (umur 44)\n" +
                        "Karachi, Sindh, Pakistan\n" +
                        "Pekerjaan\tAktor, komika, pembawa acara, penulis naskah\n" +
                        "Tahun aktif\t2008–sekarang\n" +
                        "Suami/istri\tEmily V. Gordon \u200B(m. 2007)"
            ),
            Eternal(
                R.drawable.druig,
                nameEternal = "DRUIG",
                descEternal = "Druig merupakan salah satu anggota Eternals yang memiliki sifat penyendiri. Diperankan oleh Barry Keoghan, Druig, sepupu Ikaris, memiliki kekuatan untuk mengendalikan pikiran, manipulasi materi, terbang, dan telepati.",
                desc2Eternal = "Pemeran : Barry Keoghan \n" +
                        "Lahir\t18 Oktober 1992 (umur 29)\n" +
                        "Summerhill, Dublin, Irlandia\n" +
                        "Tempat tinggal\tKillarney, County Kerry, Irlandia[1]\n" +
                        "Pekerjaan\tAktor\n" +
                        "Tahun aktif\t2011–sekarang"
            ),
            Eternal(
                R.drawable.sprite,
                nameEternal = "SPRITE",
                descEternal = "Jangan tertipu dengan penampilannya yang masih anak-anak, Sprite adalah sosok abadi yang sudah hidup berabad-abad lamanya dengan mental anak-anak. Diperankan oleh Lia McHugh, Sprite memiliki kekuatan yang mampu memanipulasi objek. Bisa dikatakan, kemampuannya mirip dengan Sersi, namun tidak lebih hebat dari Sersi.",
                desc2Eternal = "Pemeran : Lia McHugh \n" +
                        "Lahir\tLia Ryan McHugh\n" +
                        "18 November 2007 (umur 14)\n" +
                        "Pittsburgh, Pennsylvania, Amerika Serikat\n" +
                        "Tahun aktif\t2016–sekarang"
            ),
            Eternal(
                R.drawable.gilgamesh,
                nameEternal = "GILGAMESH",
                descEternal = "Gilgamesh adalah Eternals terkuat, dia adalah partner Thena ketika keduanya diasingkan dari Eternals lainnya. Setelah mendapat reputasi sebagai pejuang ganas berkat kegigihannya saat melawan Deviants, karakter yang diperankan oleh Ma Dong Seok ini dapat menciptakan exoskeleton yang super kuat dari energi kosmik miliknya.",
                desc2Eternal = "Pemeran : Don Lee \n" +
                        "Lahir\tLee Dong-seok\n" +
                        "(Don Lee)\n" +
                        "1 Maret 1971 (umur 51)\n" +
                        "Pendidikan\tColumbus State University - Pendidikan Kesehatan dan Fisik\n" +
                        "Pekerjaan\tAktor\n" +
                        "Tahun aktif\t2005-sekarang"
            ),
            Eternal(
                R.drawable.thena,
                nameEternal = "THENA",
                descEternal = "Diperankan oleh Angelina Jolie, Thena dikenal sebagai seorang prajurit paling disegani dalam dunia Eternals. Dalam komik, Thena dikisahkan merupakan anak dari Zuras yang pernah menyandang gelar Prime Eternals. Thena diceritakan telah menghabiskan waktu berabad-abad lamanya untuk melatih kekuatan yang dapat menciptakan berbagai macam bentuk senjata. Bahkan dalam film, terlihat Thena mampu memanipulasi energi cosmic menjadi senjata berbentuk pedang.",
                desc2Eternal = "Pemeran : Angelina Jolie \n" +
                        "Lahir\tAngelina Jolie Voight\n" +
                        "4 Juni 1975 (umur 47)\n" +
                        "Los Angeles, California, AS\n" +
                        "Warga negara\t\n" +
                        "Amerika SerikatKamboja\n" +
                        "Pekerjaan\t\n" +
                        "AktrisPembuat filmaktivis\n" +
                        "Tahun aktif\t1982–sekarang"
            ),
            Eternal(
                R.drawable.ikaris,
                nameEternal = "IKARIS",
                descEternal = "Karakter pertama yang muncul dalam film The Eternals adalah Ikaris. Tokoh ini diperankan oleh Richard Madden dan memiliki kekuatan dapat mengapung di udara, serta mengeluarkan laser dari matanya bak Superman. Ikaris juga memiliki super strength yang mampu membuatnya menerjang Deviant.",
                desc2Eternal = "Pemeran : Richard Madden \n" +
                        "Lahir\t18 Juni 1986 (umur 36)\n" +
                        "Elderslie, Renfrewshire, Skotlandia\n" +
                        "Kebangsaan\tBritania Raya\n" +
                        "Pekerjaan\tAktor\n" +
                        "Tahun aktif\t1999–sekarang"
            ),
            Eternal(
                R.drawable.ajak,
                nameEternal = "AJAK",
                descEternal = "Ajak adalah pemimpin Eternals secara spiritual. Kebijaksanaannya telah membantu membimbing tim sejak mereka tiba di Bumi dari planet asal mereka untuk membantu membela umat manusia dari Devinats, serta memajukan peradaban manusia ke era modern.",
                desc2Eternal = "Pemeran : Salma Hayek \n" +
                        "Lahir\tSalma Valgarma Hayek Jiménez\n" +
                        "Pekerjaan\tPemeran\n" +
                        "/Produser film\n" +
                        "Tahun aktif\t1988–sekarang\n" +
                        "Suami/istri\tFrançois-Henri Pinault\n" +
                        "(2009-sekarang)"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = EternalAdapter(this,superherokuList){
            val intent = Intent (this, DetailEternalActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }

    }

}