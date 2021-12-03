package com.hillwar.history.fragments

object BD {
    val questions = arrayListOf<String> ("Вопрос 1", "Вопрос 2", "Вопрос 3", "Вопрос 4", "Вопрос 5")
    val answer = mutableMapOf<String, String>("Вопрос 1" to "Ответ 1", "Вопрос 2" to "Ответ 2", "Вопрос 3" to "Ответ 3", "Вопрос 4" to "Ответ 4", "Вопрос 5" to "Ответ 5")
    val flip = mutableMapOf<String, String>("Ответ 1" to "Вопрос 1", "Ответ 2" to "Вопрос 2", "Ответ 3" to "Вопрос 3", "Ответ 4" to "Вопрос 4", "Ответ 5" to "Вопрос 5")
}
