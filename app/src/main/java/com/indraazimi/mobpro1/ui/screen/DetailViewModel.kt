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

class DetailViewModel : ViewModel() {

    fun getCatatan(id: Long): Catatan {
        return Catatan(
            id,
            "Kuliah Mobpro $id Feb",
            "Yey, hari ini belajar membuat aplikasi Android counter dan berhasil. Hehe.. Mudah2an modul selanjutnya juga lancar. Aamiin.",
            "2024-02-$id 12:34:56"
        )
    }
}