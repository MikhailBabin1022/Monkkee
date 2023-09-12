package tests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

    public class Retry implements IRetryAnalyzer {
        private int attempt = 1;
        private static final int MAX_RETRY = 3;

        @Override
        public boolean retry(ITestResult result) {
            if (!result.isSuccess() && attempt <= MAX_RETRY) {
                System.out.println("Retrying test method: " + result.getName() + ", attempt " + attempt);
                attempt++;
                return true;
            }
            return false;
        }
    }


