package com.example.test1.ui.patients

import com.example.test1.data.model.Patient

// Les seuls états possibles de l'écran
sealed interface PatientsUiState {
    data object Loading : PatientsUiState

    data class Success(
        val patients: List<Patient>
    ) : PatientsUiState

    data class Error(
        val message: String
    ) : PatientsUiState
}