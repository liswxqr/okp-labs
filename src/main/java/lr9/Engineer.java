
package lr9;

public class Engineer extends Professional {
    private String project;

    public Engineer(String name, int experience, double rating, String project) {
        super(name, experience, rating);
        this.project = project;
    }

    @Override
    public void work() {
        System.out.println("Проектирует системы");
    }

    @Override
    public String getResponsibilities() {
        return "Проектирование и расчеты";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Проект: " + project);
    }
}
