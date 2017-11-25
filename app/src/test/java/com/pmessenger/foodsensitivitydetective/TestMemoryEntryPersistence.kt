package com.pmessenger.foodsensitivitydetective

import com.pmessenger.foodsensitivitydetective.Persistence.MemoryEntryPersistence
import org.junit.Test
import java.time.LocalDateTime

/**
 * Created by pmessenger on 25/11/2017.
 */
class TestMemoryEntryPersistence {

    @Test
    fun TestSaveAndLoadMealEntry() {
        var underTest = MemoryEntryPersistence()
        var allerGens = mutableListOf(
                Pair(Allergen("Lactose"), 2),
                Pair(Allergen("Sugar"), 3)
        )

        var mealEntry = MealEntry("testMeal", LocalDateTime.of(1, 2, 4, 5, 6), allerGens)

        underTest.saveMealEntry(mealEntry)

        var mealEntries = underTest.loadMealEntries()

        assert(mealEntries.count() == 1)
        assert(mealEntries.elementAt(0) == mealEntry)
    }

    @Test
    fun TestSaveAndLoadSymptomEntry() {
        var underTest = MemoryEntryPersistence()
        var symptoms = mutableListOf(
                Pair(Symptom("Gas"), 3)
        )

        var symptomEntry = SymptomEntry("testSymptom", LocalDateTime.of(1, 2, 4, 5, 6), symptoms)

        underTest.saveSymptomEntry(symptomEntry)

        var symptomEntries = underTest.loadSymptomEntries()

        assert(symptomEntries.count() == 1)
        assert(symptomEntries.elementAt(0) == symptomEntry)
    }
}