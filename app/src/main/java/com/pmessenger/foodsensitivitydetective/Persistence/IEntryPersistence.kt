package com.pmessenger.foodsensitivitydetective.Persistence

import com.pmessenger.foodsensitivitydetective.MealEntry
import com.pmessenger.foodsensitivitydetective.SymptomEntry

/**
 * Created by pmessenger on 25/11/2017.
 */
interface IEntryPersistence{
    fun saveMealEntry(mealEntry: MealEntry)
    fun saveSymptomEntry(symptomEntry: SymptomEntry)

    fun loadMealEntries(): MutableCollection<MealEntry>
    fun loadSymptomEntries(): MutableCollection<SymptomEntry>
}