package com.FMS.Serviceimpl;
import java.util.List;

import com.FMS.Dao.NutritionDao;
import com.FMS.Daoimpl.NutritionDaoImpl;
import com.FMS.Service.NutritionService;
import com.FMS.entity.Nutrition;


	public class NutritionServiceImpl implements NutritionService {
	    NutritionDao nutritionDao = new NutritionDaoImpl();

	    @Override
	    public Nutrition createNutrition(Nutrition nutrition) {
	       return nutritionDao.createNutrition(nutrition);
	    }

	    @Override
	    public Nutrition  updateNutrition(Nutrition nutrition) {
	        return nutritionDao.updateNutrition(nutrition);
	    }

	    @Override
	    public Nutrition retrieveNutrition(String nutritionId) {
	        return nutritionDao.retrieveNutrition(nutritionId);
	    }

	    @Override
	    public void deleteNutrition(String nutritionId) {
	        nutritionDao.deleteNutrition(nutritionId);
	    }

	    @Override
	    public List<Nutrition> getAllNutritions() {
	        return nutritionDao.getAllNutritions();
	    }

	    @Override
	    public Nutrition getNutritionById(String nutritionId) {
	        return nutritionDao.getNutritionById(nutritionId);
	    }
	}


