
package com.example.test1.ui.patients

import com.example.test1.data.model.Consultation

sealed interface ConsultationUiState {

    data object Loading : ConsultationUiState

    data class Success(
        val consultations: List<Consultation>
    ) : ConsultationUiState

    data class Error(
        val message: String
    ) : ConsultationUiState
}