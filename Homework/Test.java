public class Test {
    public static void main(String[] args) {

        for(int i = 0 ; i < empList.length ; i++)
        {
            
            if (empList[i] != null) {

                int id = empList[i].getEmpId();

                if (id == empId) {

                    for(int j = i ; j+1 < empList.length ; j++)
                    {
                        empList[j] = empList[j+1];
                    }

                    return true;
                

                }
            }
        }
        return false;
    }

    // for(Employee emp : empList)
    //     {
    //         if(emp != null)
    //         {
    //             int id = emp.getEmpId();
    //             if(id == empId)
    //             {
    //                 Employee [] newEmpList = new Employee[empList.length];
    //                 for(int i = 0 ; i < empList.length ; i++)
    //                 {
    //                     if(empList[i] != emp)
    //                     {
    //                         newEmpList[i] = empList[i];
    //                     }
    //                 }

    //                 empList = newEmpList;
    //                 return true;

    //             } 
    //         }
    //     }
    //     return false;
}
