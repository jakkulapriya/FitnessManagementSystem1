package com.FMS.Service;
import com.FMS.entity.Nutrition;
import java.util.List;

public interface NutritionService {
	    Nutrition createNutrition(Nutrition nutrition);
	    Nutrition retrieveNutrition(String nutritionId);
	    void deleteNutrition(String nutritionId);
	    List<Nutrition> getAllNutritions();
	    Nutrition getNutritionById(String nutritionId);
		Nutrition updateNutrition(Nutrition updatedNutrition);
		

}


