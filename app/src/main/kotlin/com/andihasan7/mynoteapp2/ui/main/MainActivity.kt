package com.andihasan7.mynoteapp2.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.content.Context
import android.widget.Toast
import com.andihasan7.mynoteapp2.databinding.ActivityMainBinding
import com.itsaky.androidide.logsender.LogSender

public class MainActivity : AppCompatActivity() {
    
    private var _activityMainBinding: ActivityMainBinding? = null
    private val binding get() = _activityMainBinding
    private lateinit var adapter: NoteAdapter
    
    override fun onCreate(savedInstanceState: Bundle?) {
        // Remove this line if you don't want AndroidIDE to show this app's logs
        LogSender.startLogging(this@MainActivity)
        super.onCreate(savedInstanceState)
        
        _activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        
        val mainViewModel = obtainViewModel(this@MainActivity)
        mainViewModel.getAllNotes().observe(this, { noteList ->
            if (noteList != null) {
                adapter.setListNotes(noteList)
            }
        })
        
        adapter = NoteAdapter()
        
        binding?.rvNotes?.layoutManager = LinearLayoutManager(this)
        binding?.rvNotes?.setHasFixedSize(true)
        binding?.rvNotes?.adapter = adapter
        
        binding?.fabAdd?.setOnClickListener { view ->
            if (view.id == R.id.fab_add) {
                val intent = Intent(this@MainActivity, NoteAddUpdateActivity::class.java)
                startActivity(intent)
            }
        }
    }
    
    override fun onDestroy() {
        super.onDestroy()
        _activityMainBinding = null
    }
    
    private fun obtainViewModel(activity: AppCompatActivity): MainViewModel {
        val factory = ViewModelFactory.getInstance(activity.application)
        return ViewModelProvider(activity, factory).get(MainViewModel::class.java)
    }
}