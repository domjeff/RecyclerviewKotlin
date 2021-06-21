package com.example.recyclerviewkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

//package com.example.recyclerviewkotlin
//
//import android.app.Dialog
//import android.icu.text.AlphabeticIndex
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.example.recyclerviewkotlin.data.Recording
//import com.example.recyclerviewkotlin.data.RecordingRaw
//import com.example.recyclerviewkotlin.databinding.ActivityRecordingListBinding
//import com.example.recyclerviewkotlin.databinding.CardRecordingLayoutBinding
//import com.google.firebase.database.*
//
//class com.example.recyclerviewkotlin.MainActivity : AppCompatActivity() {
//
//    private lateinit var dbref: DatabaseReference
//
//    //    private lateinit var recordingRecyclerView: RecyclerView
//    private lateinit var recordingArrayList: ArrayList<Recording>
//
////    private var _binding: CardRecordingLayoutBinding? = null
////    private val binding get() = _binding!!
//
//    private lateinit var binding: ActivityRecordingListBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        binding = ActivityRecordingListBinding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)
//
//        binding.apply {
//            rvRecordingList.setHasFixedSize(true)
//            recordingArrayList = arrayListOf<Recording>()
//            print("Running getUserData()")
//            getUserData()
//        }
//
////
////        _binding = CardRecordingLayoutBinding.bind()
//
////        val openDialog = Dialog(this)
////        recordingRecyclerView = openDialog.findViewById<RecyclerView>(R.id.rvRecordingList)
////        openDialog.setCancelable(false)
//
////        recordingRecyclerView = findViewById(R.id.rvRecordingList)
////        recordingRecyclerView.layoutManager = LinearLayoutManager(this)
////        recordingRecyclerView.setHasFixedSize(true)
////
////        recordingArrayList = arrayListOf<Recording>()
////        getUserData()
//
//    }
//
//    private fun getUserData() {
//        dbref = FirebaseDatabase.getInstance().getReference("Recordings")
//
//        dbref.addValueEventListener(object : ValueEventListener {
//            override fun onDataChange(snapshot: DataSnapshot) {
//                if (snapshot.exists()) {
//                    for (recordingSnapshot in snapshot.children) {
//                        val recordingRaw = recordingSnapshot.getValue(RecordingRaw::class.java)
//                        val recording = Recording(recordingRaw!!)
//                        recordingArrayList.add(recording)
//                        print("Recording Added")
//
//                    }
//                    binding.rvRecordingList.adapter = RecyclerViewAdapter(recordingArrayList)
////                    recordingRecyclerView.adapter = RecyclerViewAdapter(recordingArrayList)
//                } else {
//                    print("Snapshot does not exist")
//                }
//            }
//
//            override fun onCancelled(error: DatabaseError) {
//                TODO("Not yet implemented")
//            }
//        })
//    }
//}

class MainActivity : AppCompatActivity() {

    lateinit var recyclerbtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerbtn = findViewById(R.id.btnGoToList)

        recyclerbtn.setOnClickListener {

            var i = Intent(this, RecordingListActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}