package com.ngo.fundraiser.entity;

import javax.persistence.*;

@Entity
public class DonorInterest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long donorInterestID;

    // Donor Interest to Donor table
    @ManyToOne
    @JoinColumn(name = "donorId")
    private Donor donorId;

    // Donor Interest to Themes table
    @ManyToOne
    @JoinColumn(name = "themeId")
    private Theme themeId;

    private int BudgetedValue;

    public Long getDonorInterestID() {
        return donorInterestID;
    }

    public void setDonorInterestID(Long donorInterestID) {
        this.donorInterestID = donorInterestID;
    }

    public Donor getDonorId() {
        return donorId;
    }

    public void setDonorId(Donor donorId) {
        this.donorId = donorId;
    }

    public Theme getThemeId() {
        return themeId;
    }

    public void setThemeId(Theme themeId) {
        this.themeId = themeId;
    }

    public int getBudgetedValue() {
        return BudgetedValue;
    }

    public void setBudgetedValue(int budgetedValue) {
        BudgetedValue = budgetedValue;
    }
}
