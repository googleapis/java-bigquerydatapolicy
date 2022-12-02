// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datapolicies/v1/datapolicy.proto

package com.google.cloud.bigquery.datapolicies.v1;

public interface CreateDataPolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datapolicies.v1.CreateDataPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Resource name of the project that the data policy will belong to.
   * The format is `projects/{project_number}/locations/{location_id}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Resource name of the project that the data policy will belong to.
   * The format is `projects/{project_number}/locations/{location_id}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The data policy to create. The `name` field does not need to be
   * provided for the data policy creation.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datapolicies.v1.DataPolicy data_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the dataPolicy field is set.
   */
  boolean hasDataPolicy();
  /**
   * <pre>
   * Required. The data policy to create. The `name` field does not need to be
   * provided for the data policy creation.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datapolicies.v1.DataPolicy data_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dataPolicy.
   */
  com.google.cloud.bigquery.datapolicies.v1.DataPolicy getDataPolicy();
  /**
   * <pre>
   * Required. The data policy to create. The `name` field does not need to be
   * provided for the data policy creation.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datapolicies.v1.DataPolicy data_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.bigquery.datapolicies.v1.DataPolicyOrBuilder getDataPolicyOrBuilder();
}
