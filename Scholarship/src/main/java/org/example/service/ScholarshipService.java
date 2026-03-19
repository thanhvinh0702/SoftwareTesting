package org.example.service;

import org.example.model.ScholarshipType;

public class ScholarshipService {

    public String getScholarship(double gpa, int credits, boolean isDisciplined, int activityScore) {
        if (gpa < 0 || gpa > 4 || credits < 0 || activityScore < 0 || activityScore > 100) {
            return ScholarshipType.INVALID.toString();
        }
        if (gpa < 2.5 || credits < 12 || isDisciplined || activityScore < 70) {
            return ScholarshipType.UNQUALIFIED.toString();
        }
        if (gpa >= 3.6 && activityScore >= 90) {
            return ScholarshipType.EXCELLENT.toString();
        }
        else if (gpa >= 3.2 && activityScore >= 80) {
            return ScholarshipType.VERY_GOOD.toString();
        }
        return ScholarshipType.GOOD.toString();
    }
}
