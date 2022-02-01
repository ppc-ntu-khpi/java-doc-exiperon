package domain;

/**
 * Клас для опису редактора
 * @author Unknown
 */
public class Editor extends Artist {
    /**
     * Конструктор класу
     * @param electronicEditing Чи може редактор працювати з текстами на комп'ютері
     * @param skiils Вміння редактора
     * @param name Ім'я редактора
     * @param jobTitle Посада редактора
     * @param level Розряд редактора
     * @param dept Відділ редактора
     */

    /**
     * Конструктор класу
     * @param electronicEditing Чи може редактор працювати з текстами на комп'ютері
     * @param skiils Вміння редактора
     * @param name Ім'я редактора
     * @param jobTitle Посада редактора
     * @param level Розряд редактора
     * @param dept Відділ редактора
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор класу
     * @param electronicEditing Чи може редактор працювати з текстами на комп'ютері
     * @param skiils Вміння редактора
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор класу
     * @param electronicEditing Чи може редактор працювати з текстами на комп'ютері
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор класу
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Метод, який вказує вміє редактор працювати з комп'ютером, чи ні
     * @return повертає значення, вміє редактор працювати з комп'ютером, чи ні
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    /**
     * Чи може редактор працювати з текстами на комп'ютері, чи ні
     * <code>true</code> - вміє прцювати з комп'ютером
     */
    private boolean electronicEditing;

    /**
     * Отримати значення редактору чи вміє він працювати з комп'ютером, чи ні
     * <code>true</code> - вміє прцювати з комп'ютером
     * @return повертає значення, вміє редактор працювати з комп'ютером, чи ні
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює значення чи вміє працювати редактор з комп'ютером, чи ні
     * <code>true</code> - вміє прцювати з комп'ютером
     * @param electronic
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
