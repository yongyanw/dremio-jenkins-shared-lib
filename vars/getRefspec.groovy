#!/usr/bin/env groovy

def getGitRefspec(String gitBranch) {
  if (gitBranch.startsWith("changes/")) {
    return "refs/${gitBranch}:refs/remotes/origin/${gitBranch}"
  } else {
    return "+refs/heads/${gitBranch}"
  }
}
