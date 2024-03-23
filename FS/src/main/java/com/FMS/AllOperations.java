package com.FMS;

import java.util.List;
import java.util.Scanner;
//import com.FMS.entity.TimeStrap;
import com.FMS.Dao.FeedbackDAO;
import com.FMS.Daoimpl.FeedbackDAOImpl;
import com.FMS.Daoimpl.ProgressDAOImpl;
import com.FMS.Service.FeedbackService;
import com.FMS.Service.NutritionService;
import com.FMS.Service.ProgressService;
import com.FMS.Service.UserService;
import com.FMS.Service.WorkoutService;
import com.FMS.Serviceimpl.FeedbackServiceImpl;
import com.FMS.Serviceimpl.NutritionServiceImpl;
import com.FMS.Serviceimpl.ProgressServiceImpl;
import com.FMS.Serviceimpl.UserServiceimpl;
import com.FMS.Serviceimpl.WorkoutServiceimpl;
import com.FMS.entity.Feedback;
import com.FMS.entity.Nutrition;
import com.FMS.entity.Progress;
import com.FMS.entity.User;
import com.FMS.entity.Workout;




public class AllOperations
      {
	//***************************************************
	         //user main-operations
	//****************************************************
	
	 static UserService UserService = new UserServiceimpl();
	 static Scanner sc = new Scanner(System.in);
	 
	 static User UserInput() {
		sc.nextLine();
		System.out.println("enter userID");
		String UserId=sc.nextLine();
		
		System.out.println("enter username");
		String Username=sc.nextLine();
		
		System.out.println("enter dateofbirth");
		String dateofbirth=sc.nextLine();
		
		System.out.println("enter Email");
		String Email=sc.nextLine();
		
		System.out.println("Gender");
		String Gender=sc.nextLine();
		
		System.out.println("phonenumber");
		String phonenumber=sc.nextLine();
		return new User(UserId,Username,dateofbirth,Email,Gender,phonenumber);
	 }
	public static void Useroperations()
	{
		System.out.println("1.Insert User Details");
		System.out.println("2.Update User Details");
		System.out.println("3.Retrive User Details");
		System.out.println("4.Delete User Details");
		System.out.println("5.Get all User Details");
		System.out.println("6.Get User Details based on id");
		System.out.println("7.Get Users by Gender");
		
		int choice =sc.nextInt();
		
		switch(choice) 
		{
		case 1:
			User User=UserInput();
			UserService.CreateUser(User);
			System.out.println("user datails are inserted succesfully");
			break;
		
		
	     case 2:
           System.out.println("Enter UserID to update:");
           String userIdToUpdate = sc.next();
           User updatedUser = UserInput();
           updatedUser.setUserid(userIdToUpdate);
           UserService.updateUser(updatedUser);
           System.out.println("User details updated successfully");
           break;
           
       case 3:
    	   
          System.out.println("Enter UserID to retrieve:");
           String userIdToRetrieve = sc.next();
           User retrievedUser = UserService.retrieveUser(userIdToRetrieve);
           System.out.println("Retrieved User Details:");
           System.out.println(retrievedUser);
           break;
           
        case 4:
         System.out.println("Enter UserID to delete:");
         String userIdToDelete = sc.next();
        UserService.deleteUser(userIdToDelete);
        System.out.println("User details deleted successfully");
        break;
   
       case 5:
            System.out.println("All User Details:");
            List<User> allUsers = UserService.getAllUsers();
            for (User u : allUsers) {
                System.out.println(u);
            }
            break;
            
        case 6:
        System.out.println("Enter UserID to get details:");
        String userIdToGet = sc.next();
        User userById = UserService.getUserById(userIdToGet);
        System.out.println("User Details for ID " + userIdToGet + ":");
        System.out.println(userById);
        break;
        
        case 7:
            System.out.println("Enter gender to retrieve users (Male/Female/Other):");
            String gender = sc.next();
            List<User> usersByGender = UserService.getUsersByGender(gender);
            if (usersByGender.isEmpty()) {
                System.out.println("No users found with the specified gender.");
            } else {
                System.out.println("Users with gender " + gender + ":");
                for (User u : usersByGender) {
                    System.out.println(u);
                }
            }
            break;
        
        
    default:
        System.out.println("Invalid choice");
}
	}


	//*************************************************************
	             //Workout main-operations
	//*************************************************************
   static WorkoutService workoutService = new WorkoutServiceimpl();
   static Scanner scanner1 = new Scanner(System.in);

   static Workout workoutInput() {
    scanner1.nextLine();
    System.out.println("Enter Workout ID:");
    String workoutId = scanner1.nextLine();
    
    System.out.println("Enter User ID:");
    String userId = scanner1.next();
    
    System.out.println("Enter Workout Type:");
    String workoutType = scanner1.next();
    
    System.out.println("Enter Duration:");
    String duration = scanner1.next();
    
    System.out.println("Enter Date:");
    String date = scanner1.next();
    return new Workout( workoutId, workoutType, duration, date);
}

   public static void workoutOperations() {
    System.out.println("1. Insert Workout Details");
    System.out.println("2. Update Workout Details");
    System.out.println("3. Retrieve Workout Details");
    System.out.println("4. Delete Workout Details");
    System.out.println("5. Get all Workout Details");
    System.out.println("6. Get Workouts by Age Range");
    
    int choice = scanner1.nextInt();
    switch (choice) {
        case 1:
            Workout workout = workoutInput();
            workoutService.createWorkout(workout);
            System.out.println("Workout details inserted successfully");
            break;
            
        case 2:
            System.out.println("Enter Workout ID to update:");
            String workoutIdToUpdate = scanner1.nextLine();
            Workout updatedWorkout = workoutInput();
            updatedWorkout.setWorkoutid(workoutIdToUpdate);
            workoutService.updateWorkout(updatedWorkout);
            System.out.println("Workout details updated successfully");
            break;
            
        case 3:
            System.out.println("Enter Workout ID to retrieve:");
            String workoutIdToRetrieve = scanner1.nextLine();
            Workout retrievedWorkout = workoutService.retrieveWorkout(workoutIdToRetrieve);
            System.out.println("Retrieved Workout Details:");
            System.out.println(retrievedWorkout);
            break;
            
        case 4:
            System.out.println("Enter Workout ID to delete:");
            int workoutIdToDelete = scanner1.nextInt();
            workoutService.deleteWorkout(workoutIdToDelete);
            System.out.println("Workout details deleted successfully");
            break;
            
        case 5:
            System.out.println("All Workout Details:");
            List<Workout> allWorkouts = workoutService.getAllWorkouts();
            for (Workout w : allWorkouts) {
                System.out.println(w);
            }
            break;
            
        case 6:
            System.out.println("Enter minimum age:");
            int minAge = scanner1.nextInt();
            System.out.println("Enter maximum age:");
            int maxAge = scanner1.nextInt();
            List<Workout> workoutsByAgeRange = workoutService.getWorkoutsByAgeRange(minAge, maxAge);
            System.out.println("Workouts for age range " + minAge + " to " + maxAge + ":");
            for (Workout w : workoutsByAgeRange) {
                System.out.println(w);
            }
            break;  
            
        default:
            System.out.println("Invalid choice");
    }
}

   //******************************************************************
                //Nutrition main-operations
   //********************************************************************
   
   static NutritionService nutritionService = new NutritionServiceImpl();
   static Scanner scanner = new Scanner(System.in);

   static Nutrition nutritionInput() {
       scanner.nextLine(); 
       System.out.println("Enter Nutrition ID:");
       String nutritionId = scanner.nextLine();
       
       System.out.println("Enter User ID:");
       String userId = scanner.next();
       
       System.out.println("Enter Meal Type:");
       String mealType = scanner.next();
       
       System.out.println("Enter Meal Description:");
       String mealDescription = scanner.next();
       System.out.println("Enter Date:");
       String date = scanner.next();
       return new Nutrition( nutritionId,mealType, mealDescription, date);
   }

   public static void nutritionOperations() {
       System.out.println("Nutrition Operations:");
       System.out.println("1. Insert Nutrition Details");
       System.out.println("2. Update Nutrition Details");
       System.out.println("3. Retrieve Nutrition Details");
       System.out.println("4. Delete Nutrition Details");
       System.out.println("5. Get all Nutrition Details");

       int choice = scanner.nextInt();
       switch (choice) {
           case 1:
               Nutrition nutrition = nutritionInput();
               nutritionService.createNutrition(nutrition);
               System.out.println("Nutrition details inserted successfully");
               break;
           case 2:
               System.out.println("Enter Nutrition ID to update:");
               String nutritionIdToUpdate = scanner.nextLine();
               Nutrition updatedNutrition = nutritionInput();
               updatedNutrition.setNutritionid(nutritionIdToUpdate);
               nutritionService.updateNutrition(updatedNutrition);
               System.out.println("Nutrition details updated successfully");
               break;
           case 3:
               System.out.println("Enter Nutrition ID to retrieve:");
               String nutritionIdToRetrieve = scanner.nextLine();
               Nutrition retrievedNutrition = nutritionService.retrieveNutrition(nutritionIdToRetrieve);
               System.out.println("Retrieved Nutrition Details:");
               System.out.println(retrievedNutrition);
               break;
           case 4:
               System.out.println("Enter Nutrition ID to delete:");
               String nutritionIdToDelete = scanner.nextLine();
               Nutrition nutritionToDelete = nutritionService.retrieveNutrition(nutritionIdToDelete);
               if (nutritionToDelete != null) {
                   System.out.println("Are you sure you want to delete the following nutrition details?");
                   System.out.println(nutritionToDelete);
                   System.out.println("Enter 'yes' to confirm deletion, or any other key to cancel.");
                   String confirmation = scanner.next().trim().toLowerCase();
                   if (confirmation.equals("yes")) {
                       nutritionService.deleteNutrition(nutritionIdToDelete);
                       System.out.println("Nutrition details deleted successfully");
                   } else {
                       System.out.println("Deletion canceled.");
                   }
               } else {
                   System.out.println("Nutrition details not found.");
               }
               break;
           case 5:
               System.out.println("All Nutrition Details:");
               List<Nutrition> allNutritions = nutritionService.getAllNutritions();
               for (Nutrition n : allNutritions) {
                   System.out.println(n);
               }
               break;
           default:
               System.out.println("Invalid choice");
       }
   }

   //***********************************************************
             //Progress main-operations
   //***********************************************************

   
   private static final Scanner sc3 = new Scanner(System.in);
   private static final ProgressService progressService = new ProgressServiceImpl(new ProgressDAOImpl());

   public static void main1(String[] args) {
       progressOperations();
   }

   private static Progress progressInput() {
       scanner.nextLine(); 

       System.out.println("Enter User ID:");
       String userId = sc3.nextLine();

       System.out.println("Enter Weight:");
       double weight = sc3.nextDouble();

       System.out.println("Enter Body Fat Percentage:");
       double bodyFatPercentage = sc3.nextDouble();

       System.out.println("Enter Date:");
       String date = sc3.next();

       return new Progress(0, new User(userId, "", "", "", "", ""), weight, bodyFatPercentage, date);
   }

   public static void progressOperations() {
       System.out.println("Progress Operations:");
       System.out.println("1. Insert Progress Details");
       System.out.println("2. Update Progress Details");
       System.out.println("3. Retrieve Progress Details");
       System.out.println("4. Delete Progress Details");
       System.out.println("5. Get all Progress Details");

       int choice = scanner.nextInt();
       switch (choice) {
           case 1:
               Progress progressToAdd = progressInput();
               Progress createdProgress = progressService.createProgress(progressToAdd);
               if (createdProgress != null) {
                   System.out.println("Progress details inserted successfully");
               } else {
                   System.out.println("Failed to insert progress details");
               }
               break;
           case 2:
               System.out.println("Enter Progress ID to update:");
               int progressIdToUpdate = scanner.nextInt();
               Progress progressToUpdate = progressInput();
               progressToUpdate.setProgressid(progressIdToUpdate);
               Progress updatedProgress = progressService.updateProgress(progressToUpdate);
               if (updatedProgress != null) {
                   System.out.println("Progress details updated successfully");
               } else {
                   System.out.println("Failed to update progress details");
               }
               break;
           case 3:
               System.out.println("Enter Progress ID to retrieve:");
               int progressIdToRetrieve = scanner.nextInt();
               Progress retrievedProgress = progressService.getProgressById(progressIdToRetrieve);
               if (retrievedProgress != null) {
                   System.out.println("Retrieved Progress Details:");
                   System.out.println(retrievedProgress);
               } else {
                   System.out.println("Progress  found.");
               }
               break;
           case 4:
               System.out.println("Enter Progress ID to delete:");
               int progressIdToDelete = scanner.nextInt();
               progressService.deleteProgress(progressIdToDelete);
               System.out.println("Progress details deleted successfully");
               break;
           case 5:
               System.out.println("All Progress Details:");
               List<Progress> allProgress = progressService.getAllProgress();
               for (Progress p : allProgress) {
                   System.out.println(p);
               }
               break;
           default:
               System.out.println("Invalid choice");
       }
   }

   
   
       /*private static final Scanner sc2 = new Scanner(System.in);
       private static final ProgressService progressService = new ProgressServiceImpl(new ProgressDAOImpl());

       public static void main1(String[] args) {
           progressOperations();
       }

       private static Progress progressInput() {
           sc2.nextLine();

           System.out.println("Enter Progress ID:");
           int progressId = sc2.nextInt();

           System.out.println("Enter User ID:");
           String userId = sc2.nextLine();

           System.out.println("Enter Weight:");
           double weight = sc2.nextDouble();

           System.out.println("Enter Body Fat Percentage:");
           double bodyFatPercentage = sc2.nextDouble();

           System.out.println("Enter Date:");
           String date = sc2.nextLine();

           return new Progress(progressId, userId, weight, bodyFatPercentage, date);
       }

       public static void progressOperations() {
           System.out.println("Progress Operations:");
           System.out.println("1. Insert Progress Details");
           System.out.println("2. Update Progress Details");
           System.out.println("3. Retrieve Progress Details");
           System.out.println("4. Delete Progress Details");
           System.out.println("5. Get all Progress Details");

           int choice = scanner.nextInt();
           switch (choice) {
               case 1:
                   Progress progressToAdd = progressInput();
                   Progress createdProgress = progressService.createProgress(progressToAdd);
                   if (createdProgress != null) {
                       System.out.println("Progress details inserted successfully");
                   } else {
                       System.out.println("Failed to insert progress details");
                   }
                   break;
               case 2:
                   System.out.println("Enter Progress ID to update:");
                   int progressIdToUpdate = scanner.nextInt();
                   Progress progressToUpdate = progressInput();
                   progressToUpdate.setProgressid(progressIdToUpdate);
                   Progress updatedProgress = progressService.updateProgress(progressToUpdate);
                   if (updatedProgress != null) {
                       System.out.println("Progress details updated successfully");
                   } else {
                       System.out.println("Failed to update progress details");
                   }
                   break;
               case 3:
                   System.out.println("Enter Progress ID to retrieve:");
                   int progressIdToRetrieve = scanner.nextInt();
                   Progress retrievedProgress = progressService.retrieveProgress(progressIdToRetrieve);
                   if (retrievedProgress != null) {
                       System.out.println("Retrieved Progress Details:");
                       System.out.println(retrievedProgress);
                   } else {
                       System.out.println("Progress not found.");
                   }
                   break;
               case 4:
                   System.out.println("Enter Progress ID to delete:");
                   int progressIdToDelete = scanner.nextInt();
                   progressService.deleteProgress(progressIdToDelete);
                   System.out.println("Progress details deleted successfully");
                   break;
               case 5:
                   System.out.println("All Progress Details:");
                   List<Progress> allProgress = progressService.getAllProgress();
                   for (Progress p : allProgress) {
                       System.out.println(p);
                   }
                   break;
               default:
                   System.out.println("Invalid choice");
           }
       }*/
   

   
     /* static ProgressService progressService = new ProgressServiceImpl();
      static Scanner sc1 = new Scanner(System.in);
	private static Object feedbackDAO;

      static Progress progressInput() {
    scanner.nextLine(); 
    System.out.println("Enter Progress ID:");
    String progressId = sc1.nextLine();
    
    System.out.println("Enter User ID:");
    String userId = sc1.next();
    
    System.out.println("Enter Weight:");
    double weight = sc1.nextDouble();
    
    System.out.println("Enter Body Fat Percentage:");
    double bodyFatPercentage = sc1.nextDouble();
    
    System.out.println("Enter Date:");
    String date = sc1.next();
    return new Progress(progressId, userId, weight, bodyFatPercentage, date);
}

   public static void progressOperations() {
    System.out.println("Progress Operations:");
    System.out.println("1. Insert Progress Details");
    System.out.println("2. Update Progress Details");
    System.out.println("3. Retrieve Progress Details");
    System.out.println("4. Delete Progress Details");
    System.out.println("5. Get all Progress Details");

    int choice = scanner.nextInt();
    switch (choice) {
        case 1:
            Progress progress = progressInput();
            progressService.createProgress(progress);
            System.out.println("Progress details inserted successfully");
            break;
            
        case 2:
            System.out.println("Enter Progress ID to update:");
            String progressIdToUpdate = scanner.nextLine();
            Progress updatedProgress = progressInput();
            updatedProgress.setProgressid(progressIdToUpdate);
            progressService.updateProgress(updatedProgress);
            System.out.println("Progress details updated successfully");
            break;
            
        case 3:
            System.out.println("Enter Progress ID to retrieve:");
            String progressIdToRetrieve = scanner.nextLine();
            Progress retrievedProgress = progressService.retrieveProgress(progressIdToRetrieve);
            System.out.println("Retrieved Progress Details:");
            System.out.println(retrievedProgress);
            break;
            
        case 4:
            System.out.println("Enter Progress ID to delete:");
            String progressIdToDelete = scanner.nextLine();
            Progress progressToDelete = progressService.retrieveProgress(progressIdToDelete);
            if (progressToDelete != null) {
                System.out.println("Are you sure you want to delete the following progress details?");
                System.out.println(progressToDelete);
                System.out.println("Enter 'yes' to confirm deletion, or any other key to cancel.");
                String confirmation = scanner.next().trim().toLowerCase();
                if (confirmation.equals("yes")) {
                    progressService.deleteProgress(progressIdToDelete);
                    System.out.println("Progress details deleted successfully");
                } else {
                    System.out.println("Deletion canceled.");
                }
            } else {
                System.out.println("Progress details not found.");
            }
            break;
            
        case 5:
            System.out.println("All Progress Details:");
            List<Progress> allProgress = progressService.getAllProgress();
            for (Progress p : allProgress) {
                System.out.println(p);
            }
            break;
            
        default:
            System.out.println("Invalid choice");
    }
}
     */ 

  // *****************************************************
       //feedback main-operations
//**********************************************************


       private static final Scanner s1 = new Scanner(System.in);
       private static final FeedbackService feedbackService = new FeedbackServiceImpl(new FeedbackDAOImpl());

       public static void main(String[] args) {
           feedbackOperations();
       }

       private static Feedback feedbackInput() {
           s1.nextLine(); 

           System.out.println("Enter User ID:");
           String userId = s1.nextLine();

           System.out.println("Enter Date:");
           String date = s1.nextLine();

           System.out.println("Enter Feedback Message:");
           String feedbackMessage = s1.nextLine();

           return new Feedback(0, new User(userId, "", "", "", "", ""), date, feedbackMessage);
       }

       public static void feedbackOperations() {
           System.out.println("Feedback Operations:");
           System.out.println("1. Insert Feedback Details");
           System.out.println("2. Update Feedback Details");
           System.out.println("3. Retrieve Feedback Details");
           System.out.println("4. Delete Feedback Details");
           System.out.println("5. Get all Feedback Details");

           int choice = scanner.nextInt();
           switch (choice) {
               case 1:
                   Feedback feedbackToAdd = feedbackInput();
                   Feedback createdFeedback = feedbackService.createFeedback(feedbackToAdd);
                   if (createdFeedback != null) {
                       System.out.println("Feedback details inserted successfully");
                   } else {
                       System.out.println("Failed to insert feedback details");
                   }
                   break;
               case 2:
                   System.out.println("Enter Feedback ID to update:");
                   int feedbackIdToUpdate = scanner.nextInt();
                   Feedback feedbackToUpdate = feedbackInput();
                   feedbackToUpdate.setFeedbackid(feedbackIdToUpdate);
                   Feedback updatedFeedback = feedbackService.updateFeedback(feedbackToUpdate);
                   if (updatedFeedback != null) {
                       System.out.println("Feedback details updated successfully");
                   } else {
                       System.out.println("Failed to update feedback details");
                   }
                   break;
               case 3:
                   System.out.println("Enter Feedback ID to retrieve:");
                   int feedbackIdToRetrieve = scanner.nextInt();
                   Feedback retrievedFeedback = feedbackService.retrieveFeedback(feedbackIdToRetrieve);
                   if (retrievedFeedback != null) {
                       System.out.println("Retrieved Feedback Details:");
                       System.out.println(retrievedFeedback);
                   } else {
                       System.out.println("Feedback not found.");
                   }
                   break;
               case 4:
                   System.out.println("Enter Feedback ID to delete:");
                   int feedbackIdToDelete = scanner.nextInt();
                   feedbackService.deleteFeedback(feedbackIdToDelete);
                   System.out.println("Feedback details deleted successfully");
                   break;
               case 5:
                   System.out.println("All Feedback Details:");
                   List<Feedback> allFeedback = feedbackService.getAllFeedback();
                   for (Feedback f : allFeedback) {
                       System.out.println(f);
                   }
                   break;
               default:
                   System.out.println("Invalid choice");
           }
       }
   }

  
   /*static FeedbackServiceImpl feedbackService = new FeedbackServiceImpl(feedbackDAO);

     static Scanner sc2 = new Scanner(System.in);

    static Feedback feedbackInput() 
    {
    scanner.nextLine(); 
    
    System.out.println("Enter Feedback ID:");
    int feedbackId = sc2.nextInt();
    
    System.out.println("Enter User ID:");
    String userId = sc2.next();
  
    System.out.println("Enter Date:");
    String date = sc2.next();
    
    System.out.println("Enter Feedback Message:");
    String feedbackMessage = sc2.next();
    
    return new Feedback(feedbackId, userId, date, feedbackMessage);
  }

    public static void feedbackOperations() {
    System.out.println("Feedback Operations:");
    System.out.println("1. Insert Feedback Details");
    System.out.println("2. Update Feedback Details");
    System.out.println("3. Retrieve Feedback Details");
    System.out.println("4. Delete Feedback Details");
    System.out.println("5. Get all Feedback Details");

    int choice = scanner.nextInt();
    switch (choice) {
//    case 1:
//        System.out.println("Enter Feedback ID to create:");
//        int feedbackId = scanner.nextInt();
//        feedbackService.createFeedback(feedbackId);
//        System.out.println("Feedback details inserted successfully");
//        break;
//        
        
    case 1:
        System.out.println("Enter Feedback ID to create:");
        int feedbackId = scanner.nextInt();
        Feedback feedbackToAdd = feedbackInput(); // Call feedbackInput to get feedback details
        feedbackToAdd.setFeedbackid(feedbackId); // Set feedbackId
        feedbackService.createFeedback(feedbackToAdd); // Pass feedback object to createFeedback method
        System.out.println("Feedback details inserted successfully");
        break;

        
    case 2:
        System.out.println("Enter Feedback ID to update:");
        int feedbackIdToUpdate = scanner.nextInt();
        Feedback updatedFeedback = feedbackInput();
        updatedFeedback.setFeedbackid(feedbackIdToUpdate);
        feedbackService.updateFeedback(updatedFeedback);
        System.out.println("Feedback details updated successfully");
        break;

            
        case 3:
            System.out.println("Enter Feedback ID to retrieve:");
            String feedbackIdToRetrieve = scanner.nextLine();
            Feedback retrievedFeedback = feedbackService.retrieveFeedback(Integer.parseInt(feedbackIdToRetrieve));
            if (retrievedFeedback != null) {
                System.out.println("Retrieved Feedback Details:");
                System.out.println(retrievedFeedback);
            } else {
                System.out.println("Feedback not found.");
            }
            break;
            
        case 4:
            System.out.println("Enter Feedback ID to delete:");
            String feedbackIdToDelete = scanner.nextLine();
            Feedback feedbackToDelete = feedbackService.retrieveFeedback(Integer.parseInt(feedbackIdToDelete));
            if (feedbackToDelete != null) {
                System.out.println("Are you sure you want to delete the following feedback details?");
                System.out.println(feedbackToDelete);
                System.out.println("Enter 'yes' to confirm deletion, or any other key to cancel.");
                String confirmation = scanner.next().trim().toLowerCase();
                if (confirmation.equals("yes")) {
                    feedbackService.deleteFeedback(Integer.parseInt(feedbackIdToDelete));
                    System.out.println("Feedback details deleted successfully");
                } else {
                    System.out.println("Deletion canceled.");
                }
            } else {
                System.out.println("Feedback details not found.");
            }
            break;

            
        case 5:
            System.out.println("All Feedback Details:");
            List<Feedback> allFeedback = feedbackService.getAllFeedback();
            for (Feedback f : allFeedback) {
                System.out.println(f);
            }
            break;
            
        default:
            System.out.println("Invalid choice");
    }
}
}*/
   
   
   

