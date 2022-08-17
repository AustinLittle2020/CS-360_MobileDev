# CS-360
CS-360 // Mobile Development @ SNHU


    Briefly summarize the requirements and goals of the app you developed. What user needs was this app designed to address?
    
      The event tracking application had a goal of allowing users to enter various events that they were attending and
      any information regarding the event. The application would send reminders to the user when an event was approaching.
      This application had to allow users to register/login/logout to the application, store, edit, add and remove events from the
      grid. The information needed to be stored in a Sqlite database and update accordingly when information was changed, added or deleted.
      This application was meant for users that attended events frequently and needed an application to safely store event dates
      with information that was important to the event. This allowed for the users to not miss events.
    
    What screens and features were necessary to support user needs and produce a user-centered UI for the app? How did your
    UI designs keep users in mind? Why were your designs successful?
    
      There needed to be a login screen, a registration screen, and a home screen which stored the events. Buttons were needed
      to trigger functions that would allow the user to use the application, a database was needed to store event information,
      and users needed the ability to opt-in or out of SMS notifications for event alerts. If this feature was declined, the application
      was still required to fully function. The UI that I developed was simplistic and easy on the eyes. This makes the application
      easy to use while still looking professional. The designs that I mocked-up early on in the development process were
      successful. 
    
    How did you approach the process of coding your app? What techniques or strategies did you use? How could those be applied
    in the future?
    
      I approached the development of my application by starting with customer requirements an design. Android studio
      allows for the design of an application to be fully completed with minimal coding. This allows for a solid
      user interface to be built and then I worked through the coding functionality. For instance, I knew that the
      login button should allow users to login to the application, but before this could work, there needed to be a
      check if a user already has an account and if the credentials were correct. This led to me starting with the
      registration button, which should sent an HTTP POST request with the login information that the user wanted
      to utilize. After the coding for each bit of functionality was completed, I could test the feature and ensure
      it was properly working before moving on. This led to the efficient development of the application with limited
      critical severity defects. Utilizing test-driven development and object-oriented programming were neccesary.
      These strategies should be utilized in every project that I pursue in the future and they will be. 
    
    How did you test to ensure your code was functional? Why is this process important and what did it reveal?
    
      I performed static testing and unit testing with each feature. Static testing was just ensuring that the
      UI portion was linked to the correct functionality in the back-end, while the structure of the code and the 
      syntax were correct. The unit testing consisted of actually testing the UI and ensuring that the feature
      functioned as intended. After the positive test cases were passing, I would focus on the negative test cases
      and try to break the feature. This process is important because it ensures that the application functions
      as intended. Multiple times this testing lead to the discovery of defects that I did not know existed.
    
    Considering the full app design and development process, from initial planning to finalization, where did you 
    have to innovate to overcome a challenge?
    
      The most difficult aspect of developing this application was the strict timeline for the code. I spent an abundance
      of time on the design since it is my weak point, and had minimal time to actually write and test the code. 
      To overcome this challenge, I had to work efficiently with a structured plan made ahead of time.
    
    In what specific component from your mobile app were you particularly successful in demonstrating your knowledge,
    skills, and experience?
    
      I believe the strongsuit of my application was the design and the encryption of the login credentials. This was the 
      most satisfying aspect of this application in my opinion. 
