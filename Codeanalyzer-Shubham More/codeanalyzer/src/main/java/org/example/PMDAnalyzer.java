package org.example;

import net.sourceforge.pmd.PMD;
import net.sourceforge.pmd.PMDConfiguration;

import java.io.IOException;

/**
 * The PMDAnalyzer class runs PMD analysis on a local repository and saves the
 * results to a CSV file.
 */
public class PMDAnalyzer {

    /**
     * This function runs PMD analysis on a local repository and saves the results
     * to a CSV file.
     *
     * @param localPath The local path of the repository to be analyzed using PMD.
     */
    public void runPMD(final String localPath) throws IOException, PMDException {

        String pmdOutputPath = localPath + "/pmd-report.csv";

        try {
            PMDConfiguration configuration = new PMDConfiguration();

            configuration.setInputPaths(localPath);
            configuration.setReportFormat("csv");
            configuration.setReportFile(pmdOutputPath);
            configuration.setRuleSets("org/example/PMD.xml");

            System.out.println("Analyzing repository using PMD...");
            PMD.doPMD(configuration);
            System.out.println("PMD analysis completed. Results saved to " + pmdOutputPath);
        } catch (Exception e) {
            throw new PMDException("Could not run PMD analysis: " + e.getMessage());
        }

    }
}
