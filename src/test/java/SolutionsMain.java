import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fce.Employee;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SolutionsMain {

    public SolutionsMain solutionsMain;
    public List<Employee> employeeList;

    @BeforeEach
    public void setUp() {
        solutionsMain = new SolutionsMain();
        ObjectMapper mapper = new ObjectMapper();

        //load employees
        try {
            employeeList = mapper.readValue(
                    new File("src/test/resources/company_data.json"),
                    new TypeReference<List<Employee>>() {}
            );

        } catch (IOException error) {
            System.err.println(error.getMessage());
            error.printStackTrace();
        }
    }
}
