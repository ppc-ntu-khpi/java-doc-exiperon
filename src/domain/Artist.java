package domain;

/**
 * Клас для опису художника
 * @author Unknown
 */
public class Artist extends Employee {
    /**
     * Конструктор класу
     * @param skiils Вміння художника
     * @param name Ім'я художника
     * @param jobTitle Посада художника
     * @param level Розряд художника
     * @param dept Відділ художника
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Конструктор класу
     * @param skiils Вміння художника
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Конструктор класу
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Метод для форматування інформації про художника
     * @return повертає форматовані дані про художника
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    /**
     * Масив вмінь художника
     */
    private String[] skiils;

    /**
     * Отримати всі вміння художника
     * @return
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Присвоїти вміння художника
     * @param skills Вміння художника
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Отримати список вмінь художника
     * @return поверає список вмінь художника
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
