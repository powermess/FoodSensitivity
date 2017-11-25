package com.pmessenger.foodsensitivitydetective.Persistence

import com.pmessenger.foodsensitivitydetective.MealEntry
import com.pmessenger.foodsensitivitydetective.SymptomEntry

/**
 * Created by pmessenger on 25/11/2017.
 */
class MemoryEntryPersistence : IEntryPersistence{

    var mMealEntries = mutableListOf<MealEntry>()
    var mSymptomEntries = mutableListOf<SymptomEntry>()

    override fun saveMealEntry(mealEntry: MealEntry) {
        mMealEntries.add(mealEntry)
    }

    override fun saveSymptomEntry(symptomEntry: SymptomEntry) {
        mSymptomEntries.add(symptomEntry)
    }

    override fun loadMealEntries(): MutableCollection<MealEntry> {
        return mMealEntries;
    }

    override fun loadSymptomEntries(): MutableCollection<SymptomEntry> {
        return mSymptomEntries
    }

}