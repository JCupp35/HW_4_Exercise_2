package com.bateman.msu.hw4courtcounter


import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bateman.msu.hw4courtcounter.databinding.ActivityMainBinding

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {

    // var scoreTeamA = 0
    // var scoreTeamB = 0
    private lateinit var binding: ActivityMainBinding
    private val scoreViewModel: ScoreViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "Got a ScoreViewModel:$scoreViewModel")
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View?) {
        scoreViewModel.addPointsTeamA(1)
        displayForTeamA()
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View?) {
        scoreViewModel.addPointsTeamA(2)
        displayForTeamA()
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View?) {
        scoreViewModel.addPointsTeamA(3)
        displayForTeamA()
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View?) {
        scoreViewModel.addPointsTeamB(1)
        displayForTeamB()
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View?) {
        scoreViewModel.addPointsTeamB(2)
        displayForTeamB()
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View?) {
        scoreViewModel.addPointsTeamB(3)
        displayForTeamB()
    }

    /**
     * Resets the score for both teams back to 0.
     */
    fun resetScore(v: View?) {
       scoreViewModel.resetScores()
        displayForTeamB()
        displayForTeamA()
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA() {
        binding.teamAScore.text = scoreViewModel.scoreTeamA.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB() {
        binding.teamBScore.text = scoreViewModel.scoreTeamB.toString()
    }

    override fun onStart(){
        super.onStart()
        Log.d(TAG, "onStart() called" )

    }
    override fun onResume(){
        super.onResume()
        Log.d(TAG, "onResume() called" )

    }
    override fun onPause(){
        super.onPause()
        Log.d(TAG, "onPause() called" )

    }
    override fun onStop(){
        super.onStop()
        Log.d(TAG, "onStop() called" )

    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d(TAG, "onDestroy() called" )

    }

}

