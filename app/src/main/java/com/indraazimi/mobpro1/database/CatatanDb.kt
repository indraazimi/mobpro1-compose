/*
 * Copyright (c) 2024-2025 Indra Azimi. All rights reserved.
 *
 * Dibuat untuk kelas Pemrograman untuk Perangkat Bergerak 1.
 * Dilarang melakukan penggandaan dan atau komersialisasi,
 * sebagian atau seluruh bagian, baik cetak maupun elektronik
 * terhadap project ini tanpa izin pemilik hak cipta.
 */

package com.indraazimi.mobpro1.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.indraazimi.mobpro1.model.Catatan

@Database(entities = [Catatan::class], version = 1, exportSchema = false)
abstract class CatatanDb : RoomDatabase() {

    abstract val dao: CatatanDao

    companion object {

        @Volatile
        private var INSTANCE: CatatanDb? = null

        fun getInstance(context: Context): CatatanDb {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        CatatanDb::class.java,
                        "catatan.db"
                    ).build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}