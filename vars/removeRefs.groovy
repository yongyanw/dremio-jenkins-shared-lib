#!/usr/bin/env groovy

// Remove 'refs/' from git branch
def call(String gitBranch) {
  if (gitBranch.startsWith("refs/")) {
    return gitBranch.substring(5)
  }
  return gitBranch
}
