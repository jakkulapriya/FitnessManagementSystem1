package com.FMS.Service;
	import com.FMS.entity.Progress;
	import java.util.List;

	public interface ProgressService {
	    Progress createProgress(Progress progress);
	    Progress updateProgress(Progress progress);
	    Progress retrieveProgress(int progressId);
	    void deleteProgress(int progressId);
	    List<Progress> getAllProgress();
		Progress getProgressById(int progressIdToRetrieve);
		void retriveProgress(int progressId);
		
		
		
	}


