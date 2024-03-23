package com.FMS.Daoimpl;

import com.FMS.Dao.FeedbackDAO;
import com.FMS.entity.Feedback;

import com.FMS.util.Hibernateutil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class FeedbackDAOImpl implements FeedbackDAO {
    private final SessionFactory sessionFactory;

    public FeedbackDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

   
    public FeedbackDAOImpl() {
        this.sessionFactory = Hibernateutil.getSessionFactory();
    }

	


	@Override
    public Feedback createFeedback(Feedback feedback) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(feedback);
            session.getTransaction().commit();
            return feedback;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Feedback updateFeedback(Feedback feedback) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(feedback);
            session.getTransaction().commit();
            return feedback;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Feedback retrieveFeedback(int feedbackId) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Feedback.class, feedbackId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteFeedback(int feedbackId) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Feedback feedback = session.get(Feedback.class, feedbackId);
            if (feedback != null) {
                session.delete(feedback);
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Feedback> getAllFeedback() {
        try (Session session = sessionFactory.openSession()) {
            Query<Feedback> query = session.createQuery("FROM Feedback", Feedback.class);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}














/*public class FeedbackDaoImp implements FeedbackDAO {

    @Override
    public Feedback createFeedback(Feedback feedback) {
        try (Session session = Hibernateutil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(feedback);
            session.getTransaction().commit();
            return feedback;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Feedback updateFeedback(Feedback feedback) {
        try (Session session = Hibernateutil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.update(feedback);
            session.getTransaction().commit();
            return feedback;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Feedback retrieveFeedback(int feedbackId) {
        try (Session session = Hibernateutil.getSessionFactory().openSession()) {
            return session.get(Feedback.class, feedbackId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void deleteFeedback(int feedbackId) {
        try (Session session = Hibernateutil.getSessionFactory().openSession()) {
            session.beginTransaction();
            Feedback feedback = session.get(Feedback.class, feedbackId);
            if (feedback != null) {
                session.delete(feedback);
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Feedback> getAllFeedback() {
        try (Session session = Hibernateutil.getSessionFactory().openSession()) {
            Query<Feedback> query = session.createQuery("FROM Feedback", Feedback.class);
            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}*/
