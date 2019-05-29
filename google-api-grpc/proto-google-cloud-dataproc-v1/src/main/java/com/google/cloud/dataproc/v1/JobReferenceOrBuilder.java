// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/jobs.proto

package com.google.cloud.dataproc.v1;

public interface JobReferenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.JobReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the job
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the job
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The job ID, which must be unique within the project.
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), or hyphens (-). The maximum length is 100 characters.
   * If not specified by the caller, the job ID will be provided by the server.
   * </pre>
   *
   * <code>string job_id = 2;</code>
   */
  java.lang.String getJobId();
  /**
   *
   *
   * <pre>
   * Optional. The job ID, which must be unique within the project.
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), or hyphens (-). The maximum length is 100 characters.
   * If not specified by the caller, the job ID will be provided by the server.
   * </pre>
   *
   * <code>string job_id = 2;</code>
   */
  com.google.protobuf.ByteString getJobIdBytes();
}
