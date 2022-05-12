package com.imadaramadhanti_19102003.pertemuan5

object DataSample {
    private val namaSampel= arrayOf(
        "Baturaden",
        "Small World",
        "Waju Jajar"
    )
    private val deskripsiSampel= arrayOf(
        "Baturaden adalah wisata yang ada di purwokerto",
        "small wordl adalah miniatur dunia",
        "Watu jajar adalah penampakan batu dari atas"
    )
    private val gambarSampel= intArrayOf(
        R.drawable.baturaden_1,
        R.drawable.smallworld_1,
        R.drawable.watu_meja1
    )
    private val latSampel= doubleArrayOf(
        -7.3181132,
        -7.3181132,
        -7.3181132
    )
    private val longSampel= doubleArrayOf(
        109.2360728,
        109.2360728,
        109.2360728
    )
    val ListData: ArrayList<DataClassWisata>
    get() {
        val listDataku = arrayListOf<DataClassWisata>()
        for (position in namaSampel.indices) {
            val data = DataClassWisata()
            data.namaWisata = namaSampel[position]
            data.deskripsi = deskripsiSampel[position]
            data.sampleImageDrawable = gambarSampel[position]
            data.lat = latSampel[position]
            data.long = longSampel[position]
            listDataku.add(data)
        }
        return listDataku
    }
}

