package project.entities.mongo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@JsonIgnoreProperties(ignoreUnknown = true)
@Document("activities")
public class Activity {
    @Id
    private String id;
    @Field("activity_name")
    @JsonProperty("activity_name")
    private String activityName;
    @Field("organization_name")
    @JsonProperty("organization_name")
    private String organizationName;
    @Field("start_time")
    @JsonProperty("start_time")
    private Long startTime;
    @Field("end_time")
    @JsonProperty("end_time")
    private Long endTime;
    @Field("address")
    @JsonProperty("address")
    private String address;
    @Field("age_threshold")
    @JsonProperty("age_threshold")
    private Integer ageThreshold;

    public Activity() {

    }

    public Activity(String activityName, String organizationName, Long startTime, Long endTime, String address, Integer ageThreshold) {
        this.activityName = activityName;
        this.organizationName = organizationName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.address = address;
        this.ageThreshold = ageThreshold;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAgeThreshold() {
        return ageThreshold;
    }

    public void setAgeThreshold(Integer ageThreshold) {
        this.ageThreshold = ageThreshold;
    }
}
