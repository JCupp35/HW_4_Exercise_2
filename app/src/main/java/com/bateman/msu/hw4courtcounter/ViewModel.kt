package com.bateman.msu.hw4courtcounter

import androidx.lifecycle.ViewModel
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.SavedStateHandle
import com.bateman.msu.hw4courtcounter.databinding.ActivityMainBinding

private const val TAG ="theViewModel"
const val  SCORE_TEAM_A = "SCORE_TEAM_A"
const val  SCORE_TEAM_B = "SCORE_TEAM_B"


class ScoreViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    var scoreTeamA: Int
        get() = savedStateHandle.get(SCORE_TEAM_A) ?: 0
        set(value) = savedStateHandle.set(SCORE_TEAM_A, value)

    var scoreTeamB: Int
        get() = savedStateHandle.get(SCORE_TEAM_B) ?: 0
        set(value) = savedStateHandle.set(SCORE_TEAM_B, value)

    fun addPointsTeamA(points: Int) {
        scoreTeamA += points
    }

    fun addPointsTeamB(points: Int) {
        scoreTeamB += points
    }

    fun resetScores() {
        scoreTeamA = 0
        scoreTeamB = 0
    }
}