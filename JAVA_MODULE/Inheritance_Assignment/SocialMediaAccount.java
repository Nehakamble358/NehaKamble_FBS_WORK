package inheritanceDemo;

public class SocialMediaAccount {
	String userName;
    String email;
    boolean isPublic;
    boolean isVerified;
    String countryOrigin;
    int noOfPosts;
    int noOfLikes;
    int noOfComments;
    String createdAt; 
    int noOfImpressions;	
    
    SocialMediaAccount()//Default Constructor
    {
    	 this.userName = "not given";
         this.email = "not given";
         this.isPublic = false;
         this.isVerified = true;
         this.countryOrigin = "not given";
         this.noOfPosts = 0;
         this.noOfLikes = 0;
         this.noOfComments = 0;
         this.createdAt = "not given";
         this.noOfImpressions = 0;
    }
        SocialMediaAccount(String userName, String email, boolean isPublic, boolean isVerified,
                String countryOrigin, int noOfPosts, int noOfLikes, int noOfComments,
                String createdAt, int noOfImpressions)//parameterized constructor
        {
        	 System.out.println("Parameterized SocialMediaAccount Constructor Called");

        	 this.userName = userName;
        	 this.email = email;
        	 this.isPublic = isPublic;
        	 this.isVerified = isVerified;
        	 this.countryOrigin = countryOrigin;
        	 this.noOfPosts = noOfPosts;
        	 this.noOfLikes = noOfLikes;
        	 this.noOfComments = noOfComments;
        	 this.createdAt = createdAt;
        	 this.noOfImpressions = noOfImpressions;

       }
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public boolean isPublic() {
			return isPublic;
		}
		public void setPublic(boolean isPublic) {
			this.isPublic = isPublic;
		}
		public boolean isVerified() {
			return isVerified;
		}
		public void setVerified(boolean isVerified) {
			this.isVerified = isVerified;
		}
		public String getCountryOrigin() {
			return countryOrigin;
		}
		public void setCountryOrigin(String countryOrigin) {
			this.countryOrigin = countryOrigin;
		}
		public int getNoOfPosts() {
			return noOfPosts;
		}
		public void setNoOfPosts(int noOfPosts) {
			this.noOfPosts = noOfPosts;
		}
		public int getNoOfLikes() {
			return noOfLikes;
		}
		public void setNoOfLikes(int noOfLikes) {
			this.noOfLikes = noOfLikes;
		}
		public int getNoOfComments() {
			return noOfComments;
		}
		public void setNoOfComments(int noOfComments) {
			this.noOfComments = noOfComments;
		}
		public String getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}
		public int getNoOfImpressions() {
			return noOfImpressions;
		}
		public void setNoOfImpressions(int noOfImpressions) {
			this.noOfImpressions = noOfImpressions;
		}
         
        	 void display() {
        	        System.out.println("User Name: " + userName);
        	        System.out.println("Email: " + email);
        	        System.out.println("Public Account: " + isPublic);
        	        System.out.println("Verified: " + isVerified);
        	        System.out.println("Country of Origin: " + countryOrigin);
        	        System.out.println("Number of Posts: " + noOfPosts);
        	        System.out.println("Number of Likes: " + noOfLikes);
        	        System.out.println("Number of Comments: " + noOfComments);
        	        System.out.println("Account Created At: " + createdAt);
        	        System.out.println("Number of Impressions: " + noOfImpressions);
        	    }
    }// SocialMediaAccount class ends here
 
 class InstagramAccount extends SocialMediaAccount
 {
	    int noOfFollowers;
	    int noOfFollowing;
	    int noOfHighlights;
	    int noOfPostArchived;
	    int noOfStoryArchived;
	    int noOfAudioSaved;
	    
	    InstagramAccount()//default construtor 
	    {
	        super(); 
	        System.out.println("Default InstagramAccount Constructor Called");
	        this.noOfFollowers = 0;
	        this.noOfFollowing = 0;
	        this.noOfHighlights = 0;
	        this.noOfPostArchived = 0;
	        this.noOfStoryArchived = 0;
	        this.noOfAudioSaved = 0;
	    }
	    InstagramAccount(String userName, String email, boolean isPublic, boolean isVerified, String countryOrigin,
                int noOfPosts, int noOfLikes, int noOfComments, String createdAt, int noOfImpressions,
                int noOfFollowers, int noOfFollowing, int noOfHighlights,
                int noOfPostArchived, int noOfStoryArchived, int noOfAudioSaved) 
	    {

   super(userName, email, isPublic, isVerified, countryOrigin,
         noOfPosts, noOfLikes, noOfComments, createdAt, noOfImpressions);

             System.out.println("Parameterized InstagramAccount Constructor Called");
                          this.noOfFollowers = noOfFollowers;
                          this.noOfFollowing = noOfFollowing;
                          this.noOfHighlights = noOfHighlights;
                          this.noOfPostArchived = noOfPostArchived;
                          this.noOfStoryArchived = noOfStoryArchived;
                          this.noOfAudioSaved = noOfAudioSaved; 
}
		public int getNoOfFollowers() {
			return noOfFollowers;
		}
		public void setNoOfFollowers(int noOfFollowers) {
			this.noOfFollowers = noOfFollowers;
		}
		public int getNoOfFollowing() {
			return noOfFollowing;
		}
		public void setNoOfFollowing(int noOfFollowing) {
			this.noOfFollowing = noOfFollowing;
		}
		public int getNoOfHighlights() {
			return noOfHighlights;
		}
		public void setNoOfHighlights(int noOfHighlights) {
			this.noOfHighlights = noOfHighlights;
		}
		public int getNoOfPostArchived() {
			return noOfPostArchived;
		}
		public void setNoOfPostArchived(int noOfPostArchived) {
			this.noOfPostArchived = noOfPostArchived;
		}
		public int getNoOfStoryArchived() {
			return noOfStoryArchived;
		}
		public void setNoOfStoryArchived(int noOfStoryArchived) {
			this.noOfStoryArchived = noOfStoryArchived;
		}
		public int getNoOfAudioSaved() {
			return noOfAudioSaved;
		}
		public void setNoOfAudioSaved(int noOfAudioSaved) {
			this.noOfAudioSaved = noOfAudioSaved;
		}
		void display() {
	        super.display();
	        System.out.println("Followers: " + noOfFollowers);
	        System.out.println("Following: " + noOfFollowing);
	        System.out.println("Highlights: " + noOfHighlights);
	        System.out.println("Posts Archived: " + noOfPostArchived);
	        System.out.println("Stories Archived: " + noOfStoryArchived);
	        System.out.println("Audio Saved: " + noOfAudioSaved);
	    }
 }// InstagramAccount class end here
 
 class LinkedIn extends InstagramAccount 
         {
	 int noOfConnections;
	    int noOfProfileViewed;
	    int noOfJobsApplied;

	    LinkedIn() 
	    {
	        super(); 
	        System.out.println("Default LinkedIn Constructor Called");
	        this.noOfConnections = 0;
	        this.noOfProfileViewed = 0;
	        this.noOfJobsApplied = 0;
	    }

	    LinkedIn(String userName, String email, boolean isPublic, boolean isVerified, String countryOrigin,
	             int noOfPosts, int noOfLikes, int noOfComments, String createdAt, int noOfImpressions,
	             int noOfFollowers, int noOfFollowing, int noOfHighlights, int noOfPostArchived,
	             int noOfStoryArchived, int noOfAudioSaved,
	             int noOfConnections, int noOfProfileViewed, int noOfJobsApplied) 
	    {

	        super(userName, email, isPublic, isVerified, countryOrigin,
	              noOfPosts, noOfLikes, noOfComments, createdAt, noOfImpressions,
	              noOfFollowers, noOfFollowing, noOfHighlights, noOfPostArchived,
	              noOfStoryArchived, noOfAudioSaved);

	        System.out.println("Parameterized LinkedIn Constructor Called");
	        this.noOfConnections = noOfConnections;
	        this.noOfProfileViewed = noOfProfileViewed;
	        this.noOfJobsApplied = noOfJobsApplied;
	    }

	    void display() {
	        super.display();
	        System.out.println("Number of Connections: " + noOfConnections);
	        System.out.println("Number of Profiles Viewed: " + noOfProfileViewed);
	        System.out.println("Number of Jobs Applied: " + noOfJobsApplied);
	    }
         }//LinkedIn class ends here
 class YouTube extends SocialMediaAccount {

	    int noOfSubscribers;
	    double watchTime; 
	    boolean isMonetized;
	    double estimatedRevenue;

	    YouTube() {
	        super(); 
	        System.out.println("Default YouTube Constructor Called");
	        this.noOfSubscribers = 0;
	        this.watchTime = 0.0;
	        this.isMonetized = false;
	        this.estimatedRevenue = 0.0;
	    }

	    YouTube(String userName, String email, boolean isPublic, boolean isVerified, String countryOrigin,
	            int noOfPosts, int noOfLikes, int noOfComments, String createdAt, int noOfImpressions,
	            int noOfSubscribers, double watchTime, boolean isMonetized, double estimatedRevenue) {

	        super(userName, email, isPublic, isVerified, countryOrigin, noOfPosts, noOfLikes, noOfComments, createdAt, noOfImpressions);
	        System.out.println("Parameterized YouTube Constructor Called");

	        this.noOfSubscribers = noOfSubscribers;
	        this.watchTime = watchTime;
	        this.isMonetized = isMonetized;
	        this.estimatedRevenue = estimatedRevenue;
	    }

	    void display() {
	        super.display();
	        System.out.println("Number of Subscribers: " + noOfSubscribers);
	        System.out.println("Watch Time: " + watchTime + " hours");
	        System.out.println("Is Monetized: " + isMonetized);
	        System.out.println("Estimated Revenue: ₹" + estimatedRevenue);
	    }
	}// YouTube class ends here

  class TestSocialMedia {
	    public static void main(String[] args) {
	        System.out.println("Instagram Account");
	        
	        InstagramAccount insta = new InstagramAccount("Neha", "nehakambale781@gmail.com", true, true, "India",
	                150, 12000, 2500, "2022-03-15", 500000, 5000, 200, 10, 50, 100, 30);
	        insta.display();

	        System.out.println("\nLinkedIn Account");
	        LinkedIn link = new LinkedIn("Neha_linked", "nehakambale781@gmail.com", true, true, "India",
	                75, 5000, 800, "2021-08-01", 250000, 1000, 500, 5, 10, 5, 2,
	                300, 120, 15);
	        link.display();

	        System.out.println("\nYouTube Account");
	        YouTube yt = new YouTube("NehaTube", "nehakambale781@gmail.com", true, true, "India",
	                200, 15000, 3500, "2020-01-01", 1000000, 25000, 4000.5, true, 75000.75);
	        yt.display();
	    }
	}//TestSocialMedia class end here