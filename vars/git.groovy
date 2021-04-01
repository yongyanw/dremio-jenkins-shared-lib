#!/usr/bin/env groovy

/* Get git refspec from a git branch */
def getRefspec(String gitBranch) {
  if (gitBranch.startsWith("changes/")) {
    return "refs/${gitBranch}:refs/remotes/origin/${gitBranch}"
  } else {
    return "+refs/heads/${gitBranch}"
  }
}

/* Remove 'refs/' from a git branch */
def removeRefs(String gitBranch) {
  if (gitBranch.startsWith("refs/")) {
    return gitBranch.substring(5)
  }
  return gitBranch
}

