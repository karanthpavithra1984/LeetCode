package medium.hashTable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}

public class EmployeeImportance {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for(Employee employee: employees){
            employeeMap.put(employee.id, employee);
        }

        return dfs(employeeMap, id);
    }

    private int dfs(Map<Integer, Employee> employeeMap, Integer id){
        List<Integer> subordinates = employeeMap.get(id).subordinates;
        int ans = employeeMap.get(id).importance;

        for(Integer subordinate: subordinates){
            ans += dfs(employeeMap, subordinate);
        }

        return ans;
    }
}
