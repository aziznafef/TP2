
package com.example.test1.data.remote

import com.example.test1.data.model.Consultation
import retrofit2.http.GET
import retrofit2.http.Query

interface ConsultationApi {

    @GET("consultations")
    suspend fun getConsultations(
        @Query("patient") patientId: String
    ): List<Consultation>
}