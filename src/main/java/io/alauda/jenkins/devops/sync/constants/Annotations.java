/**
 * Copyright (C) 2018 Alauda.io
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.alauda.jenkins.devops.sync.constants;

import io.alauda.jenkins.devops.sync.controller.ResourceControllerManager;

/** Alauda k8s resources annotations */
public final class Annotations {
  private Annotations() {}

  public static final String JENKINS_JOB_PATH =
      ResourceControllerManager.getControllerManager().getFormatedAnnotation("job-path");

  public static final String MULTI_BRANCH_BRANCH =
      ResourceControllerManager.getControllerManager().getFormatedAnnotation("jenkins.branch");
  public static final String MULTI_BRANCH_STALE_BRANCH =
      ResourceControllerManager.getControllerManager()
          .getFormatedAnnotation("jenkins.stale.branch");
  public static final String MULTI_BRANCH_STALE_PR =
      ResourceControllerManager.getControllerManager().getFormatedAnnotation("jenkins.stale.pr");

  public static final String MULTI_BRANCH_CATEGORY =
      ResourceControllerManager.getControllerManager().getFormatedAnnotation("multiBranchCategory");
  public static final String MULTI_BRANCH_NAME =
      ResourceControllerManager.getControllerManager().getFormatedAnnotation("multiBranchName");

  public static final String MULTI_BRANCH_PR =
      ResourceControllerManager.getControllerManager().getFormatedAnnotation("jenkins.pr");
  public static final String MULTI_BRANCH_PR_DETAIL =
      ResourceControllerManager.getControllerManager().getFormatedAnnotation("jenkins.pr.detail");

  public static final String ALAUDA_PIPELINE_CONTEXT =
      ResourceControllerManager.getControllerManager().getFormatedAnnotation("pipelinecontext.");
}
