#!/usr/bin/env groovy

def call(String gitBranch) {
  if (gitBranch.startsWith("changes/")) {
    return "refs/${gitBranch}:refs/remotes/origin/${gitBranch}"
  } else {
    return "+refs/heads/${gitBranch}"
  }
}
