/*
 * SpectX API
 * SpectX REST API description
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@spectx.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.spectx.apiClientExample.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.spectx.apiClientExample.model.State;
import com.spectx.apiClientExample.model.StateChange;
import com.spectx.apiClientExample.model.Warning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * QueryStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-23T21:09:27.694+02:00")
public class QueryStatus {
  @JsonProperty("queryId")
  private String queryId = null;

  @JsonProperty("state")
  private State state = null;

  @JsonProperty("progress")
  private Double progress = null;

  @JsonProperty("warnings")
  private java.util.List<Warning> warnings = null;

  @JsonProperty("error")
  private String error = null;

  @JsonProperty("stateChanges")
  private java.util.List<StateChange> stateChanges = null;

  public QueryStatus queryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

   /**
   * Get queryId
   * @return queryId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getQueryId() {
    return queryId;
  }

  public void setQueryId(String queryId) {
    this.queryId = queryId;
  }

  public QueryStatus state(State state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")
  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public QueryStatus progress(Double progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getProgress() {
    return progress;
  }

  public void setProgress(Double progress) {
    this.progress = progress;
  }

  public QueryStatus warnings(java.util.List<Warning> warnings) {
    this.warnings = warnings;
    return this;
  }

  public QueryStatus addWarningsItem(Warning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new java.util.ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Warning> getWarnings() {
    return warnings;
  }

  public void setWarnings(java.util.List<Warning> warnings) {
    this.warnings = warnings;
  }

  public QueryStatus error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public QueryStatus stateChanges(java.util.List<StateChange> stateChanges) {
    this.stateChanges = stateChanges;
    return this;
  }

  public QueryStatus addStateChangesItem(StateChange stateChangesItem) {
    if (this.stateChanges == null) {
      this.stateChanges = new java.util.ArrayList<>();
    }
    this.stateChanges.add(stateChangesItem);
    return this;
  }

   /**
   * Describes progression of the query through states
   * @return stateChanges
  **/
  @ApiModelProperty(value = "Describes progression of the query through states")
  public java.util.List<StateChange> getStateChanges() {
    return stateChanges;
  }

  public void setStateChanges(java.util.List<StateChange> stateChanges) {
    this.stateChanges = stateChanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryStatus queryStatus = (QueryStatus) o;
    return Objects.equals(this.queryId, queryStatus.queryId) &&
        Objects.equals(this.state, queryStatus.state) &&
        Objects.equals(this.progress, queryStatus.progress) &&
        Objects.equals(this.warnings, queryStatus.warnings) &&
        Objects.equals(this.error, queryStatus.error) &&
        Objects.equals(this.stateChanges, queryStatus.stateChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId, state, progress, warnings, error, stateChanges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryStatus {\n");
    
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    stateChanges: ").append(toIndentedString(stateChanges)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

