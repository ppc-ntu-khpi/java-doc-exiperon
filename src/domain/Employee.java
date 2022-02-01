package domain;

/**
 * Базовий клас, який описує робітників компанії
 * @author Unknown
 */
public class Employee {
    /**
     * Метод для форматування інформації про робітника
     * @return повертає форматовані дані про робітника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    /**
     * Ім'я робітник
     */
    private String name;
    /**
     * Посада робітника
     */
    private String jobTitle;
    /**
     * Ідентифікатор робітника
     */
    private int ID;
    /**
     * Розряд робітника
     */
    private int level;
    /**
     * Відділ в якому працює робітник
     */
    private String dept;

   // private static int employeesCount = 0;

    /**
     * Конструктор класу
     * @param name ім'я робітника
     * @param jobTitle посада робітника
     * @param level розряд робітника
     * @param dept відділ в якому працює робітник
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Стандартний конструктор класу
     * TODO: 01.02.2022 зробити заповнення всіх полів класу згідно рандому
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Присвоїти робітнику посаду
     * @param job посада робітника
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Отримати посаду робітника
     * @return повертає посаду робітника
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Отримати ім'я робітника
     * @return повертає ім'я робітника
     */
    public String getName() {
        return name;
    }

    /**
     * Присвоїти робітнику розряд
     * @param level розряд робітника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Отримати розряд робітника
     * @return повертає розряд робітника
     */
    public int getLevel() {
        return level;
    }

    /**
     * Отримати відділ робітника
     * @return повертає відділ робітника
     */
    public String getDept() {
        return dept;
    }

    /**
     * Присвоїти відділ робітнику
     * @param dept відділ робітника
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Присвоїти ім'я робітнику
     * @param name ім'я робітника
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
