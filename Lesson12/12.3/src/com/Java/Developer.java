package com.Java;

public class Developer extends Employee {
    protected String mainLanguage;
    protected String[] skills;

    public Developer (String name, String email, int experience, String mainLanguage, String[] skills)
    {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }
}
