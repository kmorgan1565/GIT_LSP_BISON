package howard_lsp_assignments.org.howard.edu.lsp.exam.problem51;

// Used to ensure that only one instance of a particular class ever gets created 
// and that there is just one (global) way to gain access to that instance

public class Logger {
	private static Logger logger;
    private String log;
    
    private Logger() {this.log = "";}
    

    public void logMessage(String message) {
        this.log += message + "\n";
    }

    public String displayLog() {
        return("Log:\n" + log);
    }
    
    public static Logger getInstance () {
    		if (logger == null) {
    			logger = new Logger();
    		}
    		return logger;
   }
}