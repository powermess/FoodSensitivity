package com.pmessenger.foodsensitivitydetective

import java.time.LocalDateTime

/**
 * Created by pmessenger on 25/11/2017.
 */
class SymptomEntry(name: String, time: LocalDateTime, symptoms: MutableCollection<Pair<Symptom, Int>>)