package com.abhicoding.thequiz.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.abhicoding.thequiz.model.QuestionsList
import com.abhicoding.thequiz.repository.Repository

class QuizViewModel : ViewModel() {
    private var repository = Repository()

    private var questionsLiveData : LiveData<QuestionsList> = repository.getQuestionsFromAPI()

    fun getQuestionsFromLiveData():LiveData<QuestionsList>{
        return repository.getQuestionsFromAPI()
    }
}