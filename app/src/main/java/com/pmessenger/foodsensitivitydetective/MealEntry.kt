package com.pmessenger.foodsensitivitydetective

import java.time.LocalDateTime

/**
 * Created by pmessenger on 25/11/2017.
 */
class MealEntry(name: String, time: LocalDateTime, allergens: MutableCollection<Pair<Allergen, Int>>)