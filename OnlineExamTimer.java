public class OnlineExamTimer {

    public static void main(String[] args) {
        int examDuration = 60; // Exam duration in minutes (1 hour)
        
        // While loop to count down the time remaining
        while (examDuration > 0) {
            System.out.println("Time remaining: " + examDuration + " minutes");
            
            // Wait for 1 minute (simulating real-time countdown)
            try {
                Thread.sleep(60000); // 60000 milliseconds = 1 minute
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            examDuration--; // Decrease the remaining time by 1 minute
        }
        
        // When the time is up
        System.out.println("Time's up! The exam is over.");
    }
}
