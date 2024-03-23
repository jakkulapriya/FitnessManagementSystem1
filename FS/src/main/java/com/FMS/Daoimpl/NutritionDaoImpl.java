package com.FMS.Daoimpl;
import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import com.FMS.Dao.NutritionDao;
import com.FMS.entity.Nutrition;
	import com.FMS.util.Hibernateutil;

	public class NutritionDaoImpl implements NutritionDao {

	    @Override
	    public Nutrition createNutrition(Nutrition nutrition)
	    {
	        try (Session session = Hibernateutil.getSession())
	        {
	            session.beginTransaction();
	            session.save(nutrition);
	            session.getTransaction().commit();
	            return nutrition;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	    @Override
	    public Nutrition updateNutrition(Nutrition nutrition) {
	        try (Session session = Hibernateutil.getSession()) {
	            session.beginTransaction();
	            session.update(nutrition);
	            session.getTransaction().commit();
	            return nutrition;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	    @Override
	    public Nutrition retrieveNutrition(String nutritionId) {
	        try (Session session = Hibernateutil.getSession()) {
	            return session.get(Nutrition.class, nutritionId);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	    @Override
	    public void deleteNutrition(String nutritionId) {
	        try (Session session = Hibernateutil.getSession()) {
	            session.beginTransaction();
	            Nutrition nutrition = session.get(Nutrition.class, nutritionId);
	            if (nutrition != null) {
	                session.delete(nutrition);
	            }
	            session.getTransaction().commit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public List<Nutrition> getAllNutritions() {
	        try (Session session = Hibernateutil.getSession()) {
	            Query<Nutrition> query = session.createQuery("FROM Nutrition", Nutrition.class);
	            return query.list();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	    @Override
	    public Nutrition getNutritionById(String nutritionId) {
	        try (Session session = Hibernateutil.getSession()) {
	            return session.get(Nutrition.class, nutritionId);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	}

