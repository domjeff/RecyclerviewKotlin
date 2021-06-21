package com.example.recyclerviewkotlin.data

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

data class Recording(
    private val recordingRaw: RecordingRaw
) {
    var id = recordingRaw.id
    var title: String = recordingRaw.title
    var subtitle: String = recordingRaw.subtitle
//    var date: LocalDate?

    var date:String
    init {

        var formatter: DateTimeFormatter;

//        date = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
//            LocalDate.parse(recordingRaw.launchingDate, formatter)
//        } else {
//            null
//        }
        date=recordingRaw.launchingDate
    }
}