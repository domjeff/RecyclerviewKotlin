package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewkotlin.data.Recording
import com.example.recyclerviewkotlin.data.RecordingRaw
import com.example.recyclerviewkotlin.databinding.ActivityRecordingListBinding
import com.google.firebase.database.*

class RecordingListActivity : AppCompatActivity() {

    private lateinit var dbref: DatabaseReference
    private lateinit var recordingRecyclerview: RecyclerView
    private lateinit var recordingArrayList: ArrayList<Recording>
    private lateinit var binding: ActivityRecordingListBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recording_list)


        binding = ActivityRecordingListBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.apply {
            rvRecordingList.setHasFixedSize(true)
            recordingArrayList = arrayListOf()
//            print("Running getUserData()")
            getUserData()
        }

//        recordingRecyclerview = findViewById(R.id.rvRecordingList)
//        recordingRecyclerview.layoutManager = LinearLayoutManager(this)
//        recordingRecyclerview.setHasFixedSize(true)

//        recordingArrayList = arrayListOf<Recording>()
//        getUserData()
    }

    private fun getUserData() {
//        dbref = FirebaseDatabase.getInstance().getReference("Recordings")
//
//        dbref.addValueEventListener(object : ValueEventListener {
//
//            override fun onDataChange(snapshot: DataSnapshot) {
//
//                if (snapshot.exists()) {
//
//                    for (recordingSnapshot in snapshot.children) {
//                        val recordingRaw = recordingSnapshot.getValue(RecordingRaw::class.java)
//                        recordingArrayList.add(Recording(recordingRaw!!))
//                    }
//
//                    print("snapshot does exists")
//                    recordingRecyclerview.adapter = RecyclerViewAdapter(recordingArrayList)
//
//
//                } else {
//                    print("snapshot does not exist")
//                }
//
//            }
//
//            override fun onCancelled(error: DatabaseError) {
//                TODO("Not yet implemented")
//            }
//        })

        recordingArrayList.add(
            Recording(
                RecordingRaw(
                    1,
                    "title1",
                    "subtitle1",
                    "08-08-1997"
                )
            )
        )

        Log.d("ini tag", recordingArrayList.toString())



        recordingArrayList.add(
            Recording(
                RecordingRaw(
                    2,
                    "title2",
                    "subtitle2",
                    "08-08-1997"
                )
            )
        )

        Log.d("ini tag lagi", recordingArrayList.toString())

//        recordingRecyclerview.adapter = RecyclerViewAdapter(recordingArrayList)
        binding.apply {
            rvRecordingList.adapter = RecyclerViewAdapter(recordingArrayList)
            rvRecordingList.layoutManager = LinearLayoutManager(applicationContext)
        }
    }
}