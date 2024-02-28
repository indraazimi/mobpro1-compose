/*
 * Copyright (c) 2024 Indra Azimi. All rights reserved.
 *
 * Dibuat untuk kelas Pemrograman untuk Perangkat Bergerak 1.
 * Dilarang melakukan penggandaan dan atau komersialisasi,
 * sebagian atau seluruh bagian, baik cetak maupun elektronik
 * terhadap project ini tanpa izin pemilik hak cipta.
 */

package com.indraazimi.mobpro1.ui.screen

import androidx.lifecycle.ViewModel
import com.indraazimi.mobpro1.model.Catatan

class MainViewModel : ViewModel() {

    val data = getDataDummy()

    private fun getDataDummy(): List<Catatan> {
        val data = mutableListOf<Catatan>()
        for (i in 29 downTo 20 ) {
            data.add(
                Catatan(
                    i.toLong(),
                    "Kuliah Mobpro $i Feb",
                    "Yey, hari ini belajar membuat aplikasi Android counter dan berhasil. Hehe.. Mudah2an modul selanjutnya juga lancar. Aamiin.",
                    "2024-02-$i 12:34:56"
                )
            )
        }
        return data
    }
}