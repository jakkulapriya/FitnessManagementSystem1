package com.FMS.Service;
	import java.util.List;

import com.FMS.entity.Feedback;



public interface FeedbackService {
     Feedback createFeedback(Feedback feedback) ;
    Feedback updateFeedback(Feedback feedback);
    Feedback retrieveFeedback(int feedbackId);
    void deleteFeedback(int feedbackId);
    List<Feedback> getAllFeedback();
}

