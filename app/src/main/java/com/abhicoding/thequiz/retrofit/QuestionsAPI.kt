package com.abhicoding.thequiz.retrofit

import com.abhicoding.thequiz.model.QuestionsList
import retrofit2.Response
import retrofit2.http.GET

interface QuestionsAPI {
    @GET("questionsapi.php")
    suspend fun getQuestions() : Response<QuestionsList>
}