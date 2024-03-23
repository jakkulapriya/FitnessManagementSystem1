package com.FMS.Dao;

import com.FMS.entity.Feedback;
import java.util.List;

public interface FeedbackDAO {
    Feedback createFeedback(Feedback feedback);
    Feedback updateFeedback(Feedback feedback);
    Feedback retrieveFeedback(int feedbackId);
    void deleteFeedback(int feedbackId);
    List<Feedback> getAllFeedback();
}
