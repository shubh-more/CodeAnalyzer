package org.example;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.JGitInternalException;

import java.io.File;

/**
 * The GitCloner class provides a function to clone a Git repository from a
 * given URL to a local path.
 */
public class GitCloner {

    /**
     * This function clones a Git repository from a given URL to a local path.
     *
     * @param gitRepositoryURL The URL of the Git repository that needs to be
     *                         cloned.
     * @param localPath        The local path where the Git repository will be
     *                         cloned to.
     */
    public void cloneGitRepository(final String gitRepositoryURL, final String localPath) throws RepoCloneException {
        System.out.println("Cloning Git repository...");

        try {
            Git.cloneRepository()
                    .setURI(gitRepositoryURL)
                    .setDirectory(new File(localPath))
                    .call();

            System.out.println("Git repository cloned successfully!");
        } catch (GitAPIException | JGitInternalException e) {
            throw new RepoCloneException("Could not clone Git repository: " + e.getMessage());
        }
    }
}
