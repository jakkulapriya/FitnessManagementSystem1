package com.FMS.Dao;
import com.FMS.entity.Progress;
import java.util.List;


public interface ProgressDao {
    Progress createProgress(Progress progress);
    Progress updateProgress(Progress progress);
    Progress retrieveProgress(int progressId);
    void deleteProgress(int progressId);
    List<Progress> getAllProgress();
	Progress getProgressById(int progressId);
	
	
}

	


