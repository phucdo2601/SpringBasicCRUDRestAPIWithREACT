import axios from 'axios';

const EMPLOYMENT_API_BASE_URL = "http://localhost:8080/api/v1/employees";


class EmployeeService {

    getEmployees() {
        return axios.get(EMPLOYMENT_API_BASE_URL);
    }
    
    createEmployee(employee){
        return axios.post(EMPLOYMENT_API_BASE_URL, employee);

    }

    getEmployeeById(employeeId) {
        return axios.get(EMPLOYMENT_API_BASE_URL + '/' + employeeId);
    }

    updateEmployee(employee, employeeId){
        return axios.put(EMPLOYMENT_API_BASE_URL + '/' + employeeId,employee)
    }
    
    deleteEmployee(employeeId){
        return axios.delete(EMPLOYMENT_API_BASE_URL + '/' +employeeId);
    }
}

export default new EmployeeService()