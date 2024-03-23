package com.FMS.Serviceimpl;
import com.FMS.Dao.ProgressDao;

import com.FMS.Service.ProgressService;
import com.FMS.entity.Progress;
import java.util.List;

	public class ProgressServiceImpl implements ProgressService
	{
	    //private final ProgressDao progressDao = new ProgressDaoImpl();
		 private final ProgressDao progressDAO;

		    public ProgressServiceImpl(ProgressDao progressDAO) {
		        this.progressDAO = progressDAO;
		    }
		
	    @Override
	    public Progress  createProgress(Progress Progress){
	        return progressDAO.createProgress(Progress);
	    }

	    @Override
	    public Progress updateProgress(Progress progress) {
	        return progressDAO.updateProgress(progress);
	    }

	    @Override
	    public Progress retrieveProgress(int progressId) {
	        return progressDAO.retrieveProgress(progressId);
	    }

	    @Override
	    public void deleteProgress(int progressId) {
	        progressDAO.deleteProgress(progressId);
	    }

	    @Override
	    public List<Progress> getAllProgress() {
	        return progressDAO.getAllProgress();
	    }
		@Override
		public Progress getProgressById(int progressIdToRetrieve) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void retriveProgress(int progressId) {
			// TODO Auto-generated method stub
			
		}
		
		
	}






