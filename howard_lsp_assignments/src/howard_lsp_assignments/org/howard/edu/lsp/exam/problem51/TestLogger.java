package howard_lsp_assignments.org.howard.edu.lsp.exam.problem51;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestLogger {
	private Logger logger;

	
	@BeforeEach
	void setUp() {
		logger = Logger.getInstance();
	}
	
	
 	@Test
 	@DisplayName("Test case for displaying the log")
 	public void testDisplayLog() {
 		logger.logMessage("Hello World!");
 		assertEquals("Log:\nHello World!\n", logger.displayLog());  
 	}

 	@Test
 	@DisplayName("Test case for logger instances")
 	public void testLoggerInstances() {
 		Logger secondLogger = Logger.getInstance();
        assertSame(logger, secondLogger);
 	}
 	
 	
 	
}
