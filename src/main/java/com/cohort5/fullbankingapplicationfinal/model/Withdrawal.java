package com.cohort5.fullbankingapplicationfinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Withdrawal {

    @Id
    @GeneratedValue
    Long id;
    String type;
    String transaction_date;
    Long payer_id;
    String medium;
    Double amount;
    String description;

    public Withdrawal() {
    }

    public Withdrawal(Long id, String type, String transaction_date, Long payer_id, String medium, Double amount, String description) {
        this.id = id;
        this.type = type;
        this.transaction_date = transaction_date;
        this.payer_id = payer_id;
        this.medium = medium;
        this.amount = amount;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
    }

    public Long getPayer_id() {
        return payer_id;
    }

    public void setPayer_id(Long payer_id) {
        this.payer_id = payer_id;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Withdrawal{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", transaction_date='" + transaction_date + '\'' +
                ", payer_id=" + payer_id +
                ", medium='" + medium + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}
