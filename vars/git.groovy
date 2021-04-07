#!/usr/bin/env groovy

/* Get git refspec from a git branch */
def getRefspec(String gitBranch) {
  gitBranch = removeRefs(gitBranch)
  if (gitBranch.startsWith("changes/")) {
    return "refs/${gitBranch}:refs/remotes/origin/${gitBranch}"
  } else if (gitBranch.equals("master") || gitBranch.startsWith("releases/") || gitBranch.startsWith("sandbox/")) {
    return "+refs/heads/${gitBranch}"
  } else {
    return "+refs/heads/*:refs/remotes/origin/*"
  }
}

/* Remove 'refs/' from a git branch */
def removeRefs(String gitBranch) {
  if (gitBranch.startsWith("refs/")) {
    return gitBranch.substring(5)
  }
  return gitBranch
}

