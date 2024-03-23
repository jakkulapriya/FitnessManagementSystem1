package com.FMS.Dao;

import com.FMS.entity.Nutrition;
import java.util.List;

public interface NutritionDao {
    Nutrition createNutrition(Nutrition nutrition);
    Nutrition updateNutrition(Nutrition nutrition);
    Nutrition retrieveNutrition(String nutritionId);
    void deleteNutrition(String nutritionId);
    List<Nutrition> getAllNutritions();
    Nutrition getNutritionById(String nutritionId);
}


	
