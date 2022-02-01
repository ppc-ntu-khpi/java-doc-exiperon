package domain;

/**
 * Клас для опису менеджера
 * @author Unknown
 */
public class Manager extends Employee {

    /**
     * Конструктор класу
     * @param employees Робітники
     * @param name Ім'я менеджера
     * @param jobTitle Посада менеджера
     * @param level Розряд менеджера
     * @param dept Відділ менеджера
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Метод для форматування інформації про робітників
     * @return повертає форматовані дані про робітників
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Конструктор класу
     * @param employees Робітники
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Конструктор класу
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Масив робітників
     */
    private Employee[] employees;

    /**
     * Отримати форматований рядок робітників
     * @return повертає форматований рядок робітників
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Присвоїти список робітників менеджеру
     * @param employees Масив робітників
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Отримати список робітників
     * @return повертає список робітників
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
