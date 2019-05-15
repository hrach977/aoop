package project.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Activity {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("activity_name")
    private String activityName;
    @JsonProperty("organization_name")
    private String organizationName;
    @JsonProperty("start_time")
    private Long startTime;
    @JsonProperty("end_time")
    private Long endTime;
    @JsonProperty("address")
    private String address;
    @JsonProperty("age_threshold")
    private Integer ageThreshold;

    public Activity() {}

    public Activity(project.entities.mongo.Activity mongoActivity) {
        this.id = mongoActivity.getId();
        this.activityName = mongoActivity.getActivityName();
        this.organizationName = mongoActivity.getOrganizationName();
        this.startTime = mongoActivity.getStartTime();
        this.endTime = mongoActivity.getEndTime();
        this.address = mongoActivity.getAddress();
        this.ageThreshold = mongoActivity.getAgeThreshold();
    }

//    public Activity(project.entities.redis.Activity redisActivity) {
//        this.id = redisActivity.getId();
//        this.activityName = redisActivity.getActivityName();
//        this.organizationName = redisActivity.getOrganizationName();
//        this.startTime = redisActivity.getStartTime();
//        this.endTime = redisActivity.getEndTime();
//        this.address = redisActivity.getAddress();
//        this.ageThreshold = redisActivity.getAgeThreshold();
//    }

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

    @Override
    public String toString() {
        return "Activity{" +
                "id='" + id + '\'' +
                ", activityName='" + activityName + '\'' +
                ", organizationName='" + organizationName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", address='" + address + '\'' +
                ", ageThreshold=" + ageThreshold +
                '}';
    }
}
