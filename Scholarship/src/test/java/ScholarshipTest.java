import org.example.service.ScholarshipService;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ScholarshipTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/boundaryValueTest.csv", numLinesToSkip = 1)
    void BoundaryValueAnalysis(double gpa, int credits, boolean isDisciplined, int activity, String expected) {
        ScholarshipService scholarshipService = new ScholarshipService();
        assertEquals(expected, scholarshipService.getScholarship(gpa, credits, isDisciplined, activity));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/decisionTableTest.csv", numLinesToSkip = 1)
    void decisionTableTest(double gpa, int credits, boolean isDisciplined, int activity, String expected) {
        ScholarshipService scholarshipService = new ScholarshipService();
        assertEquals(expected, scholarshipService.getScholarship(gpa, credits, isDisciplined, activity));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/branchCoverageTest.csv", numLinesToSkip = 1)
    void branchCoverageTest(double gpa, int credits, boolean isDisciplined, int activity, String expected) {
        ScholarshipService scholarshipService = new ScholarshipService();
        assertEquals(expected, scholarshipService.getScholarship(gpa, credits, isDisciplined, activity));
    }
}