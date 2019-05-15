package project.entities.mongo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@JsonIgnoreProperties(ignoreUnknown = true)
@Document("activities")
public class Activity {
//    @Id
//    private String id;
//    private static Long counter = 0L;

    @Field("id")
    private Long id;
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

    public Activity(project.entities.Activity activity) {
        this.id = activity.getId();
        this.activityName = activity.getActivityName();
        this.organizationName = activity.getOrganizationName();
        this.startTime = activity.getStartTime();
        this.endTime = activity.getEndTime();
        this.address = activity.getAddress();
        this.ageThreshold = activity.getAgeThreshold();
    }

    public Activity(Long id, String activityName, String organizationName, Long startTime, Long endTime, String address, Integer ageThreshold) {
        this.id = id;
        this.activityName = activityName;
        this.organizationName = organizationName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.address = address;
        this.ageThreshold = ageThreshold;
    }

    public Activity(String activityName, String organizationName, Long startTime, Long endTime, String address, Integer ageThreshold) {
//        this.id = ++counter;
        this.activityName = activityName;
        this.organizationName = organizationName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.address = address;
        this.ageThreshold = ageThreshold;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", activityName='" + activityName + '\'' +
                ", organizationName='" + organizationName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", address='" + address + '\'' +
                ", ageThreshold=" + ageThreshold +
                '}';
    }

    //
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
