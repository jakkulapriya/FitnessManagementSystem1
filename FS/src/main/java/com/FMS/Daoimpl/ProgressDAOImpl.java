package com.FMS.Daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;

import com.FMS.Dao.ProgressDao;
import com.FMS.entity.Progress;
import com.FMS.util.Hibernateutil;


/*import com.FMS.Dao.ProgressDao;
	import com.FMS.entity.Progress;
	import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
	import com.FMS.util.Hibernateutil;

	import java.util.List;

	public class ProgressDaoImpl implements ProgressDao {

	

		
	    @Override
	    public Progress createProgress(Progress Progress) {
	        try (Session session = Hibernateutil.getSession()) {
	            session.beginTransaction();
	            session.save(Progress);
	            session.getTransaction().commit();
	            return Progress;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	    @Override
	    public Progress updateProgress(Progress Progress){
	        try (Session session = Hibernateutil.getSession()) {
	            session.beginTransaction();
	            session.update(Progress);
	            session.getTransaction().commit();
	            return Progress;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	    @Override
	    public Progress retrieveProgress(String progressId){
	        try (Session session = Hibernateutil.getSession()) {
	            return session.get(Progress.class, progressId);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	    @Override
	    public void deleteProgress(String progressId) {
	        try (Session session = Hibernateutil.getSession()) {
	            session.beginTransaction();
	            Progress progress = session.get(Progress.class, progressId);
	            if (progress != null) {
	                session.delete(progress);
	                System.out.println("Progress with ID " + progressId + " deleted successfully.");
	            } else {
	                System.out.println("Progress with ID " + progressId + " not found.");
	            }
	            session.getTransaction().commit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public List<Progress> getAllProgress() {
	        try (Session session = Hibernateutil.getSession()) {
	            Query<Progress> query = session.createQuery("FROM Progress", Progress.class);
	            return query.list();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	}*/



public class ProgressDAOImpl implements ProgressDao {
    private final SessionFactory sessionFactory;

    public ProgressDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public ProgressDAOImpl() {
        this.sessionFactory = Hibernateutil.getSessionFactory();
    }

    @Override
    public Progress createProgress(Progress progress) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(progress);
            session.getTransaction().commit();
            return progress;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Progress updateProgress(Progress progress) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(progress);
            session.getTransaction().commit();
            return progress;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Progress retrieveProgress(int progressId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Progress.class, progressId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteProgress(int progressId) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Progress progress = session.get(Progress.class, progressId);
            if (progress != null) {
                session.delete(progress);
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Progress> getAllProgress() {
        try (Session session = sessionFactory.openSession()) {
            Query<Progress> query = session.createQuery("FROM Progress", Progress.class);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

	@Override
	public Progress getProgressById(int progressId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}





