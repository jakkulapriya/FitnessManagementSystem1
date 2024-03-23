package com.FMS.Serviceimpl;

import com.FMS.Dao.FeedbackDAO;
import com.FMS.Service.FeedbackService;
import com.FMS.entity.Feedback;
import java.util.List;

public class FeedbackServiceImpl implements FeedbackService {
    private final FeedbackDAO feedbackDAO;

    public FeedbackServiceImpl(FeedbackDAO feedbackDAO) {
        this.feedbackDAO = feedbackDAO;
    }

    @Override
    public Feedback createFeedback(Feedback feedback) {
        return feedbackDAO.createFeedback(feedback);
    }

    @Override
    public Feedback updateFeedback(Feedback feedback) {
        return feedbackDAO.updateFeedback(feedback);
    }

    @Override
    public Feedback retrieveFeedback(int feedbackId) {
        return feedbackDAO.retrieveFeedback(feedbackId);
    }

    @Override
    public void deleteFeedback(int feedbackId) {
        feedbackDAO.deleteFeedback(feedbackId);
    }

    @Override
    public List<Feedback> getAllFeedback() {
        return feedbackDAO.getAllFeedback();
    }
}


