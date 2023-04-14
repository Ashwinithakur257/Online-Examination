import java.util.*;
import java.io.*;

public class OnlineExamSystem {
  // User authentication and authorization
  public static boolean login(String username, String password) {
    // check username and password against the database
    // return true if the user is authenticated, false otherwise
  }

  // User profile management
  public static void updateProfile(String username, String newEmail, String newPassword) {
    // update the user's profile in the database
  }

  // MCQs functionality
  public static void selectAnswer(int questionId, int answerOption) {
    // update the user's answer in the database for the given question
  }

  // Timer and auto-submit
  public static void startTimer(int examDuration) {
    Timer timer = new Timer();
    timer.schedule(new TimerTask() {
      public void run() {
        // auto-submit the exam when the timer is up
      }
    }, examDuration * 60 * 1000);
  }

  // Closing session and logout
  public static void closeSession(String username) {
    // clear the user's session data in the database
  }

  public static void main(String[] args) {
    // implementation code goes here
  }
}