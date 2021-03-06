package uk.co.amazon.utils.logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager {

		static Date date = new Date();
    static Timestamp ts=new Timestamp(date.getTime());  
    static SimpleDateFormat timestamp = new SimpleDateFormat("yyyy-MM-dd HH_mm_ss");  
	private static ExtentReports extent;
    private static String reportFileName = "Test-Automaton-Report"+timestamp.format(ts)+".html";
    private static String fileSeperator = System.getProperty("file.separator");
    private static String reportFilepath = System.getProperty("user.dir") +fileSeperator+ "TestReport";
    private static String reportFileLocation =  reportFilepath +fileSeperator+ reportFileName;
  
 
 
    public static ExtentReports getInstance() {
        if (extent == null)
            createInstance();
        return extent;
    }

    public static ExtentReports createInstance() {
        String fileName = getReportPath(reportFilepath);

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(fileName);
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setDocumentTitle(reportFileName);
        sparkReporter.config().setEncoding("utf-8");
        sparkReporter.config().setReportName(reportFileName);
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        return extent;
    }

    private static String getReportPath (String path) {
    	File testDirectory = new File(path);
        if (!testDirectory.exists()) {
        	if (testDirectory.mkdir()) {
                System.out.println("Directory: " + path + " is created!" );
                return reportFileLocation;
            } else {
                System.out.println("Failed to create directory: " + path);
                return System.getProperty("user.dir");
            }
        } else {
            System.out.println("Directory already exists: " + path);
        }
		return reportFileLocation;
    }
}
