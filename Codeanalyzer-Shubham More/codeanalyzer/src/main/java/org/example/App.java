package org.example;

import java.io.*;
import java.util.*;

/**
 * The App class prompts the user for a Git repository URL and local path, clones the repository, and
 * runs PMD analysis on it.
 */
public class App {

    /**
     * The main function initializes and runs the Code Analyzer application.
     */
    public static void main(String[] args) {
        System.out.println("---------- WELCOME TO CODE ANALYZER ----------------");
        App app = new App();
        app.runCodeAnalyzerApp();
    }

    /**
     * This function prompts the user for a Git repository URL and local path, clones the repository, and
     * runs PMD analysis on it.
     */

    private void runCodeAnalyzerApp() {
        // This code block is prompting the user to enter a Git repository URL and a local path to clone the
        // repository to. It is using the `Scanner` class to read input from the console. The entered values
        // are stored in the `gitRepositoryURL` and `localPath` variables respectively.
        Scanner scanner = new Scanner(System.in);

        // Get the URL of the Git repository
        System.out.println("Enter a valid Git repository URL: ");
        final String gitRepositoryURL = scanner.nextLine();

        // Get the local path to store the Git repository
        System.out.println("Enter a location to clone the Git repository: ");
        final String localPath = scanner.nextLine();


        // This code block is calling the `cloneGitRepository` function with the `gitRepositoryURL` and
        // `localPath` parameters, which clones a Git repository from the given URL to the local path.
        // If an exception of type `RepoCloneException` is thrown during the cloning process, the catch
        // block will print the error message to the console.
        try {
            GitCloner gitCloner = new GitCloner();
            gitCloner.cloneGitRepository(gitRepositoryURL, localPath);

        } catch (RepoCloneException e) {
            System.out.println(e.getMessage());
            System.out.println("-------- EXITING CODE ANALYZER ----------------");
            System.exit(1);
        }

        // This code block is calling the `runPMD` function with the `localPath` parameter, which runs
        // PMD analysis on the cloned Git repository located at `localPath`. If an `IOException` occurs
        // during the PMD analysis, the catch block will print an error message to the console.
        try {
            PMDAnalyzer pmdAnalyzer = new PMDAnalyzer();
            pmdAnalyzer.runPMD(localPath);
        } catch (IOException | PMDException e) {
            System.out.println("Error running PMD analysis: " + e.getMessage());
        }

        scanner.close();
    }

}
